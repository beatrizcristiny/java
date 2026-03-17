import java.util.Scanner;
public class Ex18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Digite um número de 1 a 10: ");
        n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println(" o número 1 em romano é I");
                break;
             case 2:
                System.out.println(" o número 2 em romano é II");
                break;
             case 3:
                System.out.println(" o número 3 em romano é III");
                break;
             case 4:
                System.out.println(" o número 4 em romano é IV");
                break;
             case 5:
                System.out.println(" o número 5 em romano é V");
                break;
             case 6:
                System.out.println(" o número 6 em romano é VI");
                break;
             case 7:
                System.out.println(" o número 7 em romano é VII");
                break;
             case 8:
                System.out.println(" o número 8 em romano é VIII");
                break;
             case 9:
                System.out.println(" o número 9 em romano é IX");
                break;
             case 10:
                System.out.println(" o número 10 em romano é X");
                break;

                
    }

    if (n > 10 || n < 1){
        System.out.println("Valores apenas de 1 a 10 digite novamente");
    }
}
}