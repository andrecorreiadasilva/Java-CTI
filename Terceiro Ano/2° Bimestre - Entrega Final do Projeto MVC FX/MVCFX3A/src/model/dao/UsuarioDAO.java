package model.dao;

import model.dto.UsuarioDTO;
import model.Conexao;
import util.DialogUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO implements IUsuarioDAO {
    private static final Logger LOGGER = Logger.getLogger(UsuarioDAO.class.getName());
    
    @Override
    public void cadastrarUsuario(UsuarioDTO usuario) {
        String sql = "INSERT INTO usuario(nome, email, senha, login) "
                + "VALUES (?, ?, ?, ?)";
        
        try(Connection c = new Conexao().getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getLogin());
            ps.execute();
            DialogUtil.showInfo("Usuario adicionado!");
        } catch(SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao cadastrar o usuario", e);
            DialogUtil.showError("Erro ao cadastrar o usuario");
        }
    }
    
    @Override
    public void atualizarUsuario(UsuarioDTO usuario) {
        String sql = "UPDATE usuario SET nome = ?, email = ?, senha = ?, login = ? WHERE id = ?";

        try (Connection c = new Conexao().getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getLogin());
            ps.setInt(5, usuario.getId());
            ps.execute();
            DialogUtil.showInfo("Usuario atualizado!");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao atualizar o usuario", e);
            DialogUtil.showError("Erro ao atualizar o usuario");
        }
    }
    
    @Override
    public void excluirUsuario(int id) {
        String sql = "DELETE FROM usuario WHERE id = ?";
        
        try (Connection c = new Conexao().getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.execute();
            DialogUtil.showInfo("Usuario deletado!");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao deletar o usuario", e);
            DialogUtil.showError("Erro ao deletar o usuario");
        }
    }
    
    @Override
    public List<UsuarioDTO> selecionarUsuarios() {
        List<UsuarioDTO> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";

        try (Connection con = new Conexao().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                UsuarioDTO usuario = new UsuarioDTO();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setLogin(rs.getString("login"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar os usuarios", e);
            DialogUtil.showError("Erro ao carregar os usuarios");
        }

        return usuarios;
    }
}
