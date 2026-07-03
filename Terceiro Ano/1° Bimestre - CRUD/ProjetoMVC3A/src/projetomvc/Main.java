package projetomvc;

import java.util.Scanner;
import model.Conexao;
import model.dto.UsuarioDTO;
import model.dao.UsuarioDAO;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Conexao con = new Conexao();
        con.getConnection();
        
        UsuarioDTO u = new UsuarioDTO();
        u.setNome("Rogério");
        u.setLogin("rogerio");
        u.setSenha("1234");
        u.setEmail("rogerionj@gmail.com");
        
        new UsuarioDAO().cadastrarUsuario(u);
        
        
        new UsuarioDAO().selecionarUsuario();
        
        
        System.out.println("Digite o ID do usuario que deseja atualizar: ");
        int id = scanf.nextInt();
        
        scanf.nextLine();
        
        System.out.println("Digite o nome do usuario: ");
        u.setNome(scanf.nextLine());
        
        System.out.println("Digite o login do usuario: ");
        u.setLogin(scanf.nextLine());
        
        System.out.println("Digite a senha do usuario: ");
        u.setSenha(scanf.nextLine());
        
        System.out.println("Digite o email do usuario: ");
        u.setEmail(scanf.nextLine());
        
        new UsuarioDAO().atualizarUsuario(u, id);
        
        
        System.out.println("Digite o ID do usuario que deseja deletar: ");
        id = scanf.nextInt();
        
        new UsuarioDAO().deletarUsuario(id);
    }
}