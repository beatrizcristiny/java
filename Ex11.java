import java.util.Scanner;
public class Ex11{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        if (idade < 12){
            System.out.println("Você paga R$ 10,00");
        }else if (idade >= 12 && idade <= 60){
            System.out.println("Você paga R$ 20,00");
        }else if (idade>60){
            System.out.println("Você paga R$ 10,00 (meia)");
        }
    }
}