import java.util.Scanner;
public class Ex12{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        Double nota;
        System.out.println("Digite uma nota: ");
        nota = scanner.nextDouble();
        if (nota >= 9 && nota <= 10) {
            System.out.println("A");
        }else if (nota >= 7 && nota <= 8) {
            System.out.println("B");
        }else if (nota >= 5 && nota <= 6) {
            System.out.println("C");
        }else if (nota >= 0 && nota <= 4)  {
            System.out.println("D");
        }   
    }
}