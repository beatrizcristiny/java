import java.util.Scanner;
public class Ex4{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Double temperatura;
        System.out.println("Digite uma temperatura");
        temperatura = scanner.nextDouble();
        String clima = (temperatura < 15)? "Frio" : (temperatura >= 15 &&  temperatura <= 25)? "Agradavél" : (temperatura > 25)? "Quente" : "";
        System.out.println("A temperatura que digitou é " +clima);

    }
}