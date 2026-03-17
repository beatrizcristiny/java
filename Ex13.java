import java.util.Scanner;
public class Ex13{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int mes;
        System.out.println("Digite um mês: ");
        mes = scanner.nextInt();
        switch (mes){
            case 1:
                System.out.println(" Janeiro- Verão");
                break;
            case 2:
                System.out.println("Fevereiro- Verão");
                break;
            case 3:
                System.out.println(" Março- Verão / Outono");
                break;
            case 4:
                System.out.println("Abril- Outono");
                break;
            case 5:
                System.out.println("Maio- Outono");
                break;
            case 6:
                System.out.println("Junho- Outono / Inverno");
                break;
            case 7:
                System.out.println("Julho- Inverno");
                break;
            case 8:
                System.out.println("Agosto- Inverno");
                break;
            case 9:
                System.out.println("Setembro- Inverno / Primavera");
                break;
            case 10:
                System.out.println("Outubro- Primavera");
                break;
            case 11:
                System.out.println("Novembro- Primavera");
                break;
            case 12:
                System.out.println("Dezembro- Primavera/ verão");
                break;  
        }
    }
}