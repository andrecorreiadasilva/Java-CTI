package service;

import java.util.List;
import model.dto.UsuarioDTO;

public interface IUsuarioService {
    void cadastrarUsuario (UsuarioDTO usuario);
    void atualizarUsuario (UsuarioDTO usuario);
    void excluirUsuario (int id);
    List<UsuarioDTO> listarUsuarios ();
}
