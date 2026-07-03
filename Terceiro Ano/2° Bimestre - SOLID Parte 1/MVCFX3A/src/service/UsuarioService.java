package service;

import java.util.List;
import model.dao.UsuarioDAO;
import model.dto.UsuarioDTO;

public class UsuarioService {
    private final UsuarioDAO dao = new UsuarioDAO();

    public void cadastrarUsuario(UsuarioDTO usuario) {
        dao.cadastrarUsuario(usuario);
    }

    public void atualizarUsuario(UsuarioDTO usuario) {
        dao.atualizarUsuario(usuario);
    }

    public void excluirUsuario(int id) {
        dao.excluirUsuario(id);
    }

    public List<UsuarioDTO> listarUsuarios() {
        return dao.selecionarUsuarios();
    }
}