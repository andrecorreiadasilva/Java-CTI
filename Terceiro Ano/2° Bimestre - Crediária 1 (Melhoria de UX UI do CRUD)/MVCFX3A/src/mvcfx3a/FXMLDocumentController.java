package mvcfx3a;

import model.dao.UsuarioDAO;
import model.dto.UsuarioDTO;
import model.Conexao;
import java.net.URL;
import java.sql.SQLException;
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
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLDocumentController implements Initializable {
    @FXML 
    private Button btnCadastrar;
    @FXML 
    private Button btnAtualizar;
    @FXML 
    private Button btnExcluir;
    @FXML 
    private Button btnLimpar;
    
    @FXML 
    private TableView tblUsuario;
    
    @FXML 
    private TextField txtNome;
    @FXML 
    private TextField txtEmail;
    @FXML 
    private TextField txtSenha;
    @FXML 
    private TextField txtLogin;
    
    @FXML 
    private TableColumn<UsuarioDTO, Integer> colId;
    @FXML 
    private TableColumn<UsuarioDTO, String> colNome;
    @FXML 
    private TableColumn<UsuarioDTO, String> colEmail;
    @FXML 
    private TableColumn<UsuarioDTO, String> colSenha;
    @FXML 
    private TableColumn<UsuarioDTO, String> colLogin;
    
    
    public UsuarioDAO dao = new UsuarioDAO();
    public UsuarioDTO dto;
    
    @FXML
    private void cadastrar(ActionEvent event) {
        if(txtNome.getText() != "" && txtSenha.getText() != "" && txtEmail.getText() != "" && txtLogin.getText() != ""){
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
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Preencha todos os campos antes de cadastrar!");
            alert.showAndWait();
        }
        
        listarUsuarios();
    }
    
    @FXML
    private void atualizar(ActionEvent event) throws SQLException {
        if(txtNome.getText() != "" && txtSenha.getText() != "" 
           && txtEmail.getText() != "" && txtLogin.getText() != ""){
            String nome, email, senha, login;
            
            nome = txtNome.getText();
            senha = txtSenha.getText();
            email = txtEmail.getText();
            login = txtLogin.getText();
            
            dto.setNome(nome);
            dto.setSenha(senha);
            dto.setEmail(email);
            dto.setLogin(login);
            
            dao.atualizarUsuario(dto);
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Preencha todos os campos antes de atualizar!");
            alert.showAndWait();
        }
        
        listarUsuarios();
    }
    
    @FXML
    private void excluir(ActionEvent event) throws SQLException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmação de Exclusão");
        alert.setHeaderText(null);
        alert.setContentText("Certeza que deseja deletar o usuário " + dto.getNome() + "?");

        Optional<ButtonType> resultado = alert.showAndWait();
        if (resultado.isPresent() && resultado.get() == ButtonType.OK) {
            dao.deletarUsuario(dto.getId());
            
            btnExcluir.setDisable(true);
            btnAtualizar.setDisable(true);
            
            txtNome.setText("");
            txtEmail.setText("");
            txtSenha.setText("");
            txtLogin.setText("");
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
    
    
    private void listarUsuarios() {
        List<UsuarioDTO> listaUsuarios = dao.selecionarUsuarios();
        Collections.sort(listaUsuarios, Comparator.comparingInt(UsuarioDTO::getId));
        ObservableList<UsuarioDTO> usuarios = FXCollections.observableArrayList(listaUsuarios);
        tblUsuario.setItems(usuarios);
    }
    
    @FXML
    private void carregarCampos() {
        dto = (UsuarioDTO) tblUsuario.getSelectionModel().getSelectedItem();
        if (dto != null) {
         txtNome.setText(dto.getNome());
         txtEmail.setText(dto.getEmail());
         txtSenha.setText(dto.getSenha());
         txtLogin.setText(dto.getLogin());
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
