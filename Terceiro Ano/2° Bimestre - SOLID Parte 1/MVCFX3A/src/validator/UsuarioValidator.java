package validator;

import java.util.ArrayList;
import java.util.List;
import util.DialogUtil;
import model.dto.UsuarioDTO;

public class UsuarioValidator {

    public static boolean validarUsuario(UsuarioDTO usuario) {
        List<Validador<String>> validadores = new ArrayList<>();

        validadores.add(new CampoObrigatorioValidador("Nome", usuario.getNome()));
        validadores.add(new CampoObrigatorioValidador("E-mail", usuario.getEmail()));
        validadores.add(new CampoObrigatorioValidador("Senha", usuario.getSenha()));
        validadores.add(new CampoObrigatorioValidador("Login", usuario.getLogin()));
        validadores.add(new EmailValidador(usuario.getEmail()));

        for (Validador<String> validador : validadores) {
            if (!validador.validar(validador.getValor())) {
                DialogUtil.showWarning(validador.getMensagemErro());
                return false;
            }
        }
        return true;
    }
}