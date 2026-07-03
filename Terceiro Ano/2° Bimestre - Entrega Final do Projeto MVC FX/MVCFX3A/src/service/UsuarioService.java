package service;

import java.util.List;
import model.dao.UsuarioDAO;
import model.dto.UsuarioDTO;

public class UsuarioService implements IUsuarioService {
    private final UsuarioDAO dao = new UsuarioDAO();

    @Override
    public void cadastrarUsuario(UsuarioDTO usuario) {
        dao.cadastrarUsuario(usuario);
    }

    @Override
    public void atualizarUsuario(UsuarioDTO usuario) {
        dao.atualizarUsuario(usuario);
    }

    @Override
    public void excluirUsuario(int id) {
        dao.excluirUsuario(id);
    }

    @Override
    public List<UsuarioDTO> listarUsuarios() {
        return dao.selecionarUsuarios();
    }
}