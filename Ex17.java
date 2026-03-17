import java.util.Scanner;
public class Ex17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double vcompra;
        double desconto = 0;
        Double valord;
        System.out.println("Digite o valor da sua compra: ");
        vcompra = scanner.nextDouble();
        if (vcompra > 500) {
            desconto = vcompra * 0.20;
            System.out.println("Desconto de 20%");
        } else if (vcompra >= 200 && vcompra <= 500){
            desconto = vcompra * 0.10;
            System.out.println("O desconto é de 10%");
        }else if(vcompra < 200){
            System.out.println("Sem desconto");
        }
        valord = vcompra - desconto;
        System.out.println("O preço após o desconto é de: " +valord);
    }
}