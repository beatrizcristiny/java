import java.util.Scanner;
public class Ex20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p1;
        String p2;
        System.out.println("Primeiro jogador: pedra, papel ou tesoura? ");
        p1 = scanner.nextLine();
        System.out.println("Segundo jogador: pedra, papel ou tesoura? ");
        p2 = scanner.nextLine();
       System.out.println(
        p1.equals(p2)? "O jogo empatou" :
        ((p1.equals("pedra") && p2.equals("tesoura")) ||
        (p1.equals("papel") && p2.equals("pedra")) ||
        (p1.equals("tesoura") && p2.equals("papel")))? "O primeiro jogador ganhou" : "O segundo jogador ganhou");
       
        
        
    }
}