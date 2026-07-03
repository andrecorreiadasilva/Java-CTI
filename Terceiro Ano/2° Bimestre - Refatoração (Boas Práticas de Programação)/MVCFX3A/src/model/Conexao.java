package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.UsuarioDAO;
import util.DialogUtil;

public class Conexao {
    static String stringconexao = "jdbc:postgresql://localhost:5432/DBMVC3A";
    static String usuario = "postgres";
    static String senha = "ctibauru";
    private static final Logger LOGGER = Logger.getLogger(UsuarioDAO.class.getName());
    
    public Connection getConnection() {
        DialogUtil dialog = new DialogUtil();
        try {
            return DriverManager.getConnection(stringconexao, usuario, senha);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Falha na conexao", e);
            dialog.showError("Falha na conexao");
            throw new RuntimeException(e.getMessage());
        }
    }
}
