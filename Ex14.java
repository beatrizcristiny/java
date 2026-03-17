import java.util.Scanner;
public class Ex14{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        Double n1;
        Double n2;
        Double n3;
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();
        System.out.println("Digite o terceiro número: ");
        n3 = scanner.nextDouble();

        String result = (n1 > n2 && n1 > n3) ? "o primeiro numero é maior"
                : (n2 > n1 && n2 > n3) ? "o segundo numero é maior"
                        : (n3 > n1 && n3 > n2) ? "o terceiro numero é maior" : "todos sao iguais";


    System.out.println(result);
        
    
    }
}