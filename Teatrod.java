import java.util.Scanner;
public class Teatrod{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
         int opcao;
         int sala = 0;
         String[] nomedasala = {"Sala da abelhinha", "Sala colmeia", "Sala 2 amores", "Sala borboletas", "Sala das flores"};
         String[] nomedoespetac = {"Os conflitos", "A desordem", "Briga de casados", "A coleta", "As cores"};
         double[] ingressototal = {50.0, 60.0, 40.0, 80.0, 55.0};
         double[] ingressomeia = {25.0, 30.0, 20.0, 40.0, 27.5};
         String[] extitulo = {}
         String[] exenunciado = {}

         char [][][] lugares  = new char [5][12][12];
         for (sala = 0; sala < 5; sala++) {
             for (int linha = 0; linha < 12; linha++) {
                 for (int coluna = 0; coluna < 12 ; coluna++) {
                     lugares [sala][linha][coluna] = 'L';
                 }
             }
         }
         sala = 0;
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
                System.out.println("Salas disponíveis: ");
                for (int i = 0; i < 5 ; i++) {
                    System.out.println((i + 1) +" - "+ nomedasala[i]);
                    System.out.println(" O preço do ingresso total é : " +ingressototal[i]);
                    System.out.println(" O preço do ingresso meia é: " +ingressomeia[i]);
                    System.out.println(" O espetáculo é: " +nomedoespetac[i]);

                    
                }
                break;
                
            case 2:
                 System.out.println("Digite a sala que quer: ");
                 sala = scanner.nextInt();
                 if (sala < 1 || sala > 5) {
                     System.out.println("A sala não existe");
                     break;
                 }
                System.out.println("Reservando seu lugar");
                System.out.println("Digite a linha que quer: ");
                char linha2 = scanner.next().toUpperCase().charAt(0);
                System.out.println("Digite a coluna que quer: ");
                int coluna2 = scanner.nextInt();
               
                int l = linha2 - 'A';
                int c = coluna2 - 1;
                if(l >= 0 && l < 12 && c >= 0 && c < 12){
                if (lugares[sala - 1][l][c] == 'L') {
                    lugares[sala - 1][l][c] = 'R';
                    System.out.println("O lugar está reservado");
                }else {
                    System.out.println("O lugar já está ocupado");
                }}else{
                    System.out.println("Posição incorreta");
                }
                break;
            case 3:
                System.out.println("Comprando seu lugar");
                System.out.println("Digite a sala que deseja: ");
                sala = scanner.nextInt();
                if (sala < 1 || sala > 5) {
                    System.out.println("A sala não existe");
                    break;
                    }
                    System.out.println("Digite a linha que quer: ");
                      char linha3 = scanner.next().toUpperCase().charAt(0);
                      System.out.println("Digite a coluna que quer: ");
                      int coluna3 = scanner.nextInt();
                      int l3 = linha3 - 'A';
                      int c3 = coluna3 - 1;
                    if (lugares [sala - 1][l3][c3] == 'L') {
                        lugares[sala - 1][l3][c3] = 'X';
                        System.out.println(" O lugar é na sala " +nomedasala[sala - 1]+ " O espetaculo é: " +nomedoespetac[sala - 1]+ " O valor do ingresso é: " +ingressototal[sala - 1]);
                    }else if (lugares [sala - 1][l3][c3] == 'R') {
                        lugares[sala - 1][l3][c3] = 'X';
                        System.out.println(" O lugar é na sala " +nomedasala[sala - 1]+ " O espetaculo é: " +nomedoespetac[sala - 1]+ " O valor do ingresso é: " +ingressomeia[sala - 1]);
                    } else {
                        System.out.println("O lugar já está ocupado");
                    }
                break; 
            case 4:
                System.out.println("Cancelando sua reserva");
                 System.out.println("Digite a sala que deseja: ");
                sala = scanner.nextInt();
                if (sala < 1 || sala > 5) {
                    System.out.println("A sala não existe");
                    break;
                    }
                    System.out.println("Digite a linha que quer: ");
                      char linha4 = scanner.next().toUpperCase().charAt(0);
                      System.out.println("Digite a coluna que quer: ");
                      int coluna4 = scanner.nextInt();
                      int l4 = linha4 - 'A';
                      int c4 = coluna4 - 1;
                      if (lugares[sala - 1][l4][c4] == 'R') {
                           lugares[sala -1][l4][c4] = 'L';
                           System.out.println("O lugar foi cancelado o valor do estorno é: " +ingressomeia[sala - 1]);
                      }else if (lugares[sala -1][l4][c4] == 'L') {
                        System.out.println("Não é possível cancelar algo que não existe");
                          
                      } else {
                          System.out.println("O lugar está ocupado");
                      }

                break;
            case 5:
                System.out.println("O mapa da sala");
                System.out.println("Digite a sala que deseja: ");
                sala = scanner.nextInt();
                if(sala < 1 || sala > 5){
                    System.out.println("A sala não existe");
                }
                System.out.println("SALA: " +nomedasala[sala - 1]);
                System.out.println("ESPETÁCULO: " +nomedoespetac[sala - 1]);
                for (int linha = 0; linha < 12; linha++) {
                    char lLinha = (char) ('A' + linha);
                    System.out.print(lLinha + "");
                for (int coluna = 0; coluna < 12; coluna++) {
                    char comolugar = lugares[sala - 1][linha][coluna];
                    String letra = (comolugar == 'L')? "[ ]": (comolugar == 'R')? "[R]" : "[X]";
                    System.out.print(letra + " "); 
                  }
                  System.out.println(); 
                }    
                  int livres = 0;
                  int reservadas = 0;
                  int ocupadas = 0;
                  for (int linha = 0; linha < 12; linha++){
                    for(int coluna = 0; coluna < 12; coluna++){
                        if (lugares[sala - 1][linha][coluna] == 'L') 
                        livres++;
                        else if (lugares[sala - 1][linha][coluna] == 'R')
                          reservadas++;  
                         else 
                             ocupadas++;
                        
                    }
                  }
                  System.out.println("[ ] Livre                [R] Reservada               [X] Ocupada");
                  System.out.println("Livres: "  +livres+    "Reservadas: "  +reservadas+     "Ocupadas: "  +ocupadas);
                break;
            case 6:
                System.out.println("Relatorio financeiro");
                System.out.println("Digite a sala que deseja: ");
                sala = scanner.nextInt();
                if (sala < 1 || sala > 5) {
                    System.out.println("A sala não existe");
                  break;
                }
                int livres2 = 0;
                int reservadas2 = 0;
                int ocupadas2 = 0;
                for (int linha = 0; linha < 12; linha++){
                    for(int coluna = 0; coluna < 12; coluna++){
                        if(lugares[sala - 1][linha][coluna] == 'L')livres2++;
                        else if (lugares[sala - 1][linha][coluna] == 'R') reservadas2++;
                        else ocupadas2++;
                    }
                }
                double totalarrecadado = ocupadas2 * ingressototal[sala - 1];
                double totalreservas = reservadas2 * ingressomeia[sala - 1];
                double receitap = totalarrecadado + (reservadas2 * ingressomeia[sala - 1]);
                double receitamax = totalarrecadado + (reservadas2 * ingressomeia[sala - 1]) + (livres2 * ingressototal[sala - 1]);

                System.out.println("Total de cadeiras livres: " +livres2);
                System.out.println("Total de cadeeiras reservadas: " +reservadas2);
                System.out.println("Total arrecadado: " +totalarrecadado);
                System.out.println("Total em reservas: " +totalreservas);
                System.out.println("Receita potencial: " +receitap);
                System.out.println("Receita máxima: " +receitamax);
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
