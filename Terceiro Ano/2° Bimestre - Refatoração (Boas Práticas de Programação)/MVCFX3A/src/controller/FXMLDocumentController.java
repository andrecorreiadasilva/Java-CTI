package controller;

import java.net.URL;
import java.util.Collections;
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
import model.dao.UsuarioDAO;
import model.dto.UsuarioDTO;
import util.DialogUtil;

public class FXMLDocumentController implements Initializable {
    @FXML
    private TableView<UsuarioDTO> tblUsuario;
    @FXML private TableColumn<UsuarioDTO, Integer> colId;
    @FXML private TableColumn<UsuarioDTO, String> colNome;
    @FXML private TableColumn<UsuarioDTO, String> colEmail;
    @FXML private TableColumn<UsuarioDTO, String> colSenha;
    @FXML private TableColumn<UsuarioDTO, String> colLogin;

    @FXML
    private Button btnExcluir;
    @FXML
    private Button btnAtualizar;
    
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtSenha;
    @FXML
    private TextField txtLogin;

    @FXML
    private void cadastrar(ActionEvent event) {

        if(txtNome.getText() != "" && txtSenha.getText() != "" 
                && txtEmail.getText() != "" && txtLogin.getText() != ""){
            String nome, email, senha, login;

            nome = txtNome.getText();
            email = txtEmail.getText();
            senha = txtSenha.getText();
            login = txtLogin.getText();

            UsuarioDTO objUsuarioDTO = new UsuarioDTO();
            objUsuarioDTO.setNome(nome);
            objUsuarioDTO.setEmail(email);
            objUsuarioDTO.setSenha(senha);
            objUsuarioDTO.setLogin(login);

            UsuarioDAO objUsuarioDAO = new UsuarioDAO();
            objUsuarioDAO.cadastrarUsuario(objUsuarioDTO);
        }
        else {
            DialogUtil.showInfo("Preencha todos os campos.");
        }
        
        listarUsuarios();
    }
    
    @FXML
    private void excluir(ActionEvent event) {
        UsuarioDTO objUsuarioDTO = (UsuarioDTO) tblUsuario.getSelectionModel().getSelectedItem();
        if (objUsuarioDTO != null) {
            Optional<ButtonType> resultado = DialogUtil.showConfirm("Tem certeza que deseja deletar o usuário " + objUsuarioDTO.getNome() + "?");

            if (resultado.isPresent() && resultado.get() == ButtonType.OK) {
                UsuarioDAO objUsuarioDAO = new UsuarioDAO();
                objUsuarioDAO.deletarUsuario(objUsuarioDTO.getId());

                btnExcluir.setDisable(true);
                btnAtualizar.setDisable(true);

                txtNome.setText("");
                txtEmail.setText("");
                txtSenha.setText("");
                txtLogin.setText("");
            }

            listarUsuarios();
        } else {
            DialogUtil.showInfo("Selecione um usuário para deletar.");
        }
    }
    
    @FXML
    private void atualizar(ActionEvent event) {
        if(txtNome.getText() != "" && txtSenha.getText() != "" 
                && txtEmail.getText() != "" && txtLogin.getText() != ""){
            String nome, email, senha, login;
            
            nome = txtNome.getText();
            senha = txtSenha.getText();
            email = txtEmail.getText();
            login = txtLogin.getText();

            UsuarioDTO objUsuarioDTO = (UsuarioDTO) tblUsuario.getSelectionModel().getSelectedItem();
            if (objUsuarioDTO != null) {
                objUsuarioDTO.setNome(nome);
                objUsuarioDTO.setSenha(senha);
                objUsuarioDTO.setEmail(email);
                objUsuarioDTO.setLogin(login);

                UsuarioDAO objUsuarioDAO = new UsuarioDAO();
                objUsuarioDAO.atualizarUsuario(objUsuarioDTO);
            }
        }
        else {
            DialogUtil.showInfo("Preencha todos os campos.");
        }

        listarUsuarios();
    }
    
    @FXML
    private void limpar(ActionEvent event) {
        txtNome.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        txtLogin.setText("");
    }
    
    @FXML
    private void listarUsuarios() {
        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        List<UsuarioDTO> listaUsuarios = objUsuarioDAO.selecionarUsuarios();
        Collections.sort(listaUsuarios, Comparator.comparingInt(UsuarioDTO::getId));
        ObservableList<UsuarioDTO> usuarios = FXCollections.observableArrayList(listaUsuarios);
        tblUsuario.setItems(usuarios);
    }
    
    @FXML
    private void carregarCampos() {
        UsuarioDTO objUsuarioDTO = (UsuarioDTO) tblUsuario.getSelectionModel().getSelectedItem();
        if (objUsuarioDTO != null) {
            txtNome.setText(objUsuarioDTO.getNome());
            txtEmail.setText(objUsuarioDTO.getEmail());
            txtSenha.setText(objUsuarioDTO.getSenha());
            txtLogin.setText(objUsuarioDTO.getLogin());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colSenha.setCellValueFactory(new PropertyValueFactory<>("senha"));
        colLogin.setCellValueFactory(new PropertyValueFactory<>("login"));
        
        btnAtualizar.setDisable(true);
        btnExcluir.setDisable(true);
        
        tblUsuario.setOnMouseClicked(event -> { 
           carregarCampos();
           btnAtualizar.setDisable(false);
           btnExcluir.setDisable(false);
        });

        listarUsuarios();
    }       
}