import java.util.Scanner;
public class Ex5{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Double n1;
        Double n2;
        int operacao;
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();
        System.out.println(" 1 Soma");
        System.out.println(" 2 Subtração");
        System.out.println(" 3 Mutiplicação");
        System.out.println(" 4 Divisão");
        operacao = scanner.nextInt();
        switch (operacao){
            case 1:
                    System.out.println(n1 + n2);
                break;
            case 2:
                    System.out.println(n1 - n2);
                break;
            case 3:
                    System.out.println(n1 * n2);
                break;
            case 4:
                    System.out.println(n1 / n2);
              
        }
    }
}
