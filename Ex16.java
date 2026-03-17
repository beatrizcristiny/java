import java.util.Scanner;
public class Ex16{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        Double n;
        System.out.println("Digite um número: ");
        n = scanner.nextDouble();
        String resultado = (n % 3 == 0 && n % 5 == 0)? "é mutiplo de 3 e 5 " : (n % 3 == 0)? "é mutiplo de 3" : (n % 5 == 0)? "é mutiplo de 5" : (n % 3 != 0 && n % 5 != 0)? "não é mutiplo de 3 e 5" : "";
        System.out.println("O número " +resultado);
    }
}