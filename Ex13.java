import java.util.Scanner;
public class Ex13{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int mes;
        System.out.println("Digite um mês: ");
        mes = scanner.nextInt();
        switch (mes){
            case 1:
                System.out.println("Verão");
                break;
            case 2:
                System.out.println("Verão");
                break;
            case 3:
                System.out.println("Verão");
                break;
            case 4:
                System.out.println("Outono");
                break;
            case 5:
                System.out.println("Outono");
                break;
            case 6:
                System.out.println("Outono");
                break;
            case 7:
                System.out.println("Inverno");
                break;
            case 8:
                System.out.println("Inverno");
                break;
            case 9:
                System.out.println("Inverno");
                break;
            case 10:
                System.out.println("Primavera");
                break;
            case 11:
                System.out.println("Primavera");
                break;
            case 12:
                System.out.println("Primavera/ verão");
                break;  
        }
    }
}