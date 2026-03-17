import java.util.Scanner;
public class Ex10{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int n;
        System.out.println("Digite um número: ");
        n = scanner.nextInt();
        String oqe = (n > 0)? "Positivo" :
                     (n < 0)? "Negativo" :
                     "Zero";
      System.out.println("O número é " +oqe);               
    } 
}