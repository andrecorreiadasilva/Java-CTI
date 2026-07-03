package model.dao;

import model.dto.UsuarioDTO;
import model.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    public void cadastrarUsuario(UsuarioDTO usuario) {
        String sql = "INSERT INTO usuario(nome, email, senha, login) "
                + "VALUES (?, ?, ?, ?)";
        
        try(Connection c = new Conexao().getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getLogin());
            ps.execute();
            System.out.println("Usuario adicionado!");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
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
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuarios;
    }
    
    public void atualizarUsuario(UsuarioDTO usuario) {
        String sql = "UPDATE usuario SET nome = ?, email = ?, senha = ?, login = ? WHERE id = ?";

        try (Connection c = new Conexao().getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getLogin());
            ps.setInt(5, usuario.getId());
            ps.execute();
            System.out.println("Usuario atualizado!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deletarUsuario(int id) {
        String sql = "DELETE FROM usuario WHERE id = ?";
        
        try (Connection c = new Conexao().getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Usuario deletado!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
