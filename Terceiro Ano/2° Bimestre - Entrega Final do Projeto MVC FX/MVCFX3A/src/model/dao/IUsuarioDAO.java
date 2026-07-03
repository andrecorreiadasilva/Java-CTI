package model.dao;

import java.util.List;
import model.dto.UsuarioDTO;

public interface IUsuarioDAO {
    void cadastrarUsuario(UsuarioDTO usuario);
    void atualizarUsuario(UsuarioDTO usuario);
    void excluirUsuario(int id);
    List<UsuarioDTO> selecionarUsuarios ();
}
