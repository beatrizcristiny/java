import java.util.Scanner;
public class Ex1{
    public static void main(String [] args){
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Digite um número");
        int n = scanner.nextInt();

        String resultado = (n % 2 == 0)? "  par" : " ímpar";
        System.out.println("O número "+n+ " É "+resultado);



    }
}