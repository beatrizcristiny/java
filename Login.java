import java.util.Scanner;

public class Login{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome;
        String cargo;
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite o cargo que você exerce: ");
        cargo = scanner.nextLine();
        System.out.println("Bem vindo ao Sistema Comercial " +nome+ " Seu acesso como " +cargo+ " foi realizado com sucesso.");
        scanner.close();
    }
}