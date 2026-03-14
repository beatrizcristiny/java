import java.util.Scanner;
public class Conversor{
public static void main (String[] args ){
    Scanner scanner =  new Scanner(System.in);
    double precod;
    double cotacao;
    double emreal;
    System.out.println(" Digite o preço do produto em dolares: ");
    precod = scanner.nextDouble();
    System.out.println("Digite a cotação do dolar: ");
    cotacao = scanner.nextDouble();
    emreal = precod * cotacao;
    System.out.println("O valor em reais é: "+emreal);
}    
}
