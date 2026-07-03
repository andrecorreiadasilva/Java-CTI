package validator;

import model.dto.UsuarioDTO;

public interface IUsuarioValidator {
    boolean validarUsuario(UsuarioDTO usuario);
}