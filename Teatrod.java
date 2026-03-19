import java.util.Scanner;
public class Teatrod{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("*******BEM VINDO AO TEATRO DEVISATE*******");
        System.out.println(" 1- Cadastro da sala");
        System.out.println(" 2- Reservar um lugar");
        System.out.println(" 3- Comprar um lugar");
        System.out.println(" 4- Cancelar um lugar");
        System.out.println(" 5- Exibir o mapa de sala");
        System.out.println(" 6- Relatório financeiro");
        System.out.println(" 7- Menu de exercicios");
        System.out.println(" 8- Sair");
        
        System.out.println("Escolha uma opção DE 1 a 8: ");
         int opcao = scanner.nextInt();
        if (opcao > 8 || opcao < 1){
            System.out.println("Erro: Escolha opções apenas de 1 a 8");
        }

    }
}