import java.util.Scanner;
public class Ex2{
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    Double n;
    Double d;
    System.out.println("Digite um número");
    n = scanner.nextDouble();
    System.out.println("Digite outro número");
    d = scanner.nextDouble();
    
    Double resultado = (n > d)? n : d;
    System.out.println("O maior número é " +resultado);

    }
    
}