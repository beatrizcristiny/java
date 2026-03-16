import java.util.Scanner;
public class Ex7{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Double l1;
        Double l2;
        Double l3;
        System.out.println("Digite o primeiro lado: ");
        l1 = scanner.nextDouble();
         System.out.println("Digite o segundo lado: ");
        l2= scanner.nextDouble();
         System.out.println("Digite o terceiro lado: ");
        l3 = scanner.nextDouble();
        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1){
            System.out.println("É possivel formar um triângulo"); 
            if (l1 == l2 && l2 == l3){
            System.out.println("É um triângulo equilátero");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("É um triângulo isóceles");
        } else{
            System.out.println("É um triângulo escaleno");
        }

        } else{
            System.out.println("Não é possivel formar o triângulo");
        }
       



    }
}