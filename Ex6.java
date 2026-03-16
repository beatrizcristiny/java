import java.util.Scanner;
public class Ex6{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int ano;
        System.out.println("Digite um ano");
        ano = scanner.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("O ano é bissexto");
        }else{
            System.out.println("o ano não é bissexto");
        }
    }
}