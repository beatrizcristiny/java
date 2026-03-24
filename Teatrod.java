import java.util.Scanner;
public class Teatrod{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
         int opcao;

         char [][] lugares  = new char [12][12];
         for (int linha = 0; linha < 12; linha++){
            for (int coluna = 0; coluna < 12; coluna++){
                lugares[linha][coluna] = 'L';
            }
         }
         do {
             
         
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
          opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Entrando pra cadastrar a sala");
                break;
            case 2:
                System.out.println("Reservando seu lugar");
                System.out.println("Digite a linha que quer: ");
                char linha2 = scanner.next().toUpperCase().charAt(0);
                System.out.println("Digite a coluna que quer: ");
                int coluna2 = scanner.nextInt();
                int l = linha2 - 'A';
                int c = coluna2 - 1;
                if(l >= 0 && l < 12 && c >= 0 && c < 12){
                if (lugares[l][c] == 'L') {
                    lugares[l][c] = 'R';
                    System.out.println("O lugar está reservado");
                }else {
                    System.out.println("O lugar já está ocupado");
                }}else{
                    System.out.println("Posição incorreta");
                }
                break;
            case 3:
                System.out.println("Comprando seu lugar");
                break;
            case 4:
                System.out.println("Cancelando sua resrrva");
                break;
            case 5:
                System.out.println("O mapa da sala");
                for (int linha = 0; linha < 12; linha++) {
                    char lLinha = (char) ('A' + linha);
                    System.out.print(lLinha + "");
                for (int coluna = 0; coluna < 12; coluna++) {
                    char comolugar = lugares[linha][coluna];
                    String letra = (comolugar == 'L')? "[ ]": (comolugar == 'R')? "[R]" : "[X]";
                    System.out.print(letra + " "); 
                  }     
                  System.out.println(); 
                }
                break;
            case 6:
                System.out.println("Relatorio financeiro");
                break;
            case 7:
                System.out.println("Menu de exercícios");
                break;
            case 8:
                System.out.println("Saindo.."); 
                break;
            default:
                System.out.println("Escolha uma opçao de 1 a 8");/* default é o else do switch*/ 
        }
        } while (opcao != 8);

    }
}