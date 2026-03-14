import java.util.Scanner;
public class Totalven{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        double precouni;
        int quantidade;
        double total;
        System.out.println("Digite o preço do produto: ");
        precouni = scanner.nextDouble();
        System.out.println("Digite a quantidade: ");
        quantidade = scanner.nextInt();

        total = precouni * quantidade;
        System.out.println("O total a ser pago é: " +total);

    }
}