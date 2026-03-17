import java.util.Scanner;
public class Ex15{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        String senhaF = "12345";
        String emailF = "Bia";
        System.out.println("Digite seu usuario: ");
        String email = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        String acesso = (emailF.equals(email) && senhaF.equals(senha)) ? "Acesso liberado" : "Acesso negado";
        System.out.println(acesso);


    }
}