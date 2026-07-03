package controller;

import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.dto.UsuarioDTO;
import service.IUsuarioService;
import service.UsuarioService;
import util.DialogUtil;
import validator.IUsuarioValidator;
import validator.UsuarioValidator;


public class FXMLDocumentController implements Initializable {

    @FXML private TableView<UsuarioDTO> tblUsuario;
    @FXML private TableColumn<UsuarioDTO, Integer> colId;
    @FXML private TableColumn<UsuarioDTO, String> colNome;
    @FXML private TableColumn<UsuarioDTO, String> colEmail;
    @FXML private TableColumn<UsuarioDTO, String> colSenha;
    @FXML private TableColumn<UsuarioDTO, String> colLogin;

    @FXML private Button btnCadastrar, btnExcluir, btnAtualizar, btnLimpar;
    @FXML private TextField txtNome, txtEmail, txtSenha, txtLogin;
    
    private final IUsuarioService usuarioService;
    private final IUsuarioValidator validator;
    
    public FXMLDocumentController(IUsuarioService usuarioService, IUsuarioValidator usuarioValidator) {
        this.usuarioService = usuarioService;
        this.validator = usuarioValidator;
    }

    

    @FXML
    private void cadastrar(ActionEvent event) {
        UsuarioDTO usuario = obterUsuario();
        if (!validator.validarUsuario(usuario)) {
            // Caso esteja errado, será mostrado um aviso (está na própria classe)
            return;
        }
        usuarioService.cadastrarUsuario(usuario);
        limparCampos();
        listarUsuarios();
    }

    @FXML
    private void excluir(ActionEvent event) {
        UsuarioDTO usuario = tblUsuario.getSelectionModel().getSelectedItem();
        if (usuario != null) {
            Optional<ButtonType> resultado = DialogUtil.showConfirm("Tem certeza que deseja excluir o usuário " + usuario.getNome() + "?");
            if (resultado.isPresent() && resultado.get() == ButtonType.OK) {
                usuarioService.excluirUsuario(usuario.getId());
                limparCampos();
                listarUsuarios();
            }
        } else {
            DialogUtil.showInfo("Selecione um usuário para excluir.");
        }
    }

    @FXML
    private void atualizar(ActionEvent event) {
        UsuarioDTO usuario = tblUsuario.getSelectionModel().getSelectedItem();
        if (usuario != null) {
            UsuarioDTO atualizado = obterUsuario();
            atualizado.setId(usuario.getId());

            if (!validator.validarUsuario(atualizado)) {
                return;
            }

            usuarioService.atualizarUsuario(atualizado);
            limparCampos();
            listarUsuarios();
        } else {
            DialogUtil.showInfo("Selecione um usuário para atualizar.");
        }
    }

    @FXML
    private void limpar(ActionEvent event) {
        limparCampos();
    }

    @FXML
    private void carregarCampos() {
        UsuarioDTO usuario = tblUsuario.getSelectionModel().getSelectedItem();
        if (usuario != null) {
            txtNome.setText(usuario.getNome());
            txtEmail.setText(usuario.getEmail());
            txtSenha.setText(usuario.getSenha());
            txtLogin.setText(usuario.getLogin());

            btnAtualizar.setDisable(false);
            btnExcluir.setDisable(false);
        }
    }

    private void limparCampos() {
        txtNome.clear();
        txtEmail.clear();
        txtSenha.clear();
        txtLogin.clear();

        btnAtualizar.setDisable(true);
        btnExcluir.setDisable(true);
    }

    private UsuarioDTO obterUsuario() {
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setNome(txtNome.getText().trim());
        usuario.setEmail(txtEmail.getText().trim());
        usuario.setSenha(txtSenha.getText().trim());
        usuario.setLogin(txtLogin.getText().trim());
        return usuario;
    }

    @FXML
    private void listarUsuarios() {
        List<UsuarioDTO> lista = usuarioService.listarUsuarios();
        lista.sort(Comparator.comparingInt(UsuarioDTO::getId));
        ObservableList<UsuarioDTO> observableList = FXCollections.observableArrayList(lista);
        tblUsuario.setItems(observableList);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colSenha.setCellValueFactory(new PropertyValueFactory<>("senha"));
        colLogin.setCellValueFactory(new PropertyValueFactory<>("login"));

        tblUsuario.setOnMouseClicked(e -> carregarCampos());
        limparCampos();
        listarUsuarios();
    }
}