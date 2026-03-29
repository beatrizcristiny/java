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
         String[] extitulo = {"Par ou ímpar", "Maior de dois números", "Aprovação escolar", "Classificação de temperatura", "Calculadora simples", "Ano bissexto", "Triângulo valido", "IMC", "Dia da semana", "Positivo, negativo ou zero", "Ingresso de cinema", "Nota por conceito", "Estação do ano", "Maior de três números", "Verificador de login", "Múltiplo de 3 e 5", "Desconto em compra", "Número romano", "Velocidade e multa", "Pedra, papel e tesoura"};
         String[] exenunciado = {"Verifique se um número é par ou ímpar", "Receba dois números e mostre o maior", "Leia a média de um aluno (0 a 10) e exiba aprovadose média >=7, recuperação se media >=5 e <7 e reprovado se média <5", "Leia a temperatura em gaus celsius e classifique: abaixo de 15 graus = frio, entre 15 e 25 graus = agradável e acima de 25 graus = quente", "Leia dois números e um operador (+, -. *, /) e realize a operação correspondente", "Leia um ano e informe se ele é bissexto ou não", "Leia três lados e verifique se formam um triângulo válido, se sim indentifique se é: equilátero, isóceles ou escaleno", "Leia o peso em kg e a altura em metros, calcule o IMC e indentifique IMC < 18.5 = abaixo do peso, se 18.5 <= IMC < 25 = peso normal, se 25<= IMC <30 = sobrepeso e IMC >= 30 = obesidade e por fim diga se está dentro ou fora do peso", "Leia um número de 1 a 7 e exiba o nome do dia da semana correspondente, e para qualquer outro número digitado exiba dia inválido", "Leia um número e informe se ele é positivo, negativo ou zero", "Uma sala de cinema cobra: para menores de 12 anos = 10,00, entre 12 e 60 anos = 20,00 e acima de 60 anos = 10,00, leia a idade e exiba o valor do ingresso", "Leia uma nota de 0 a 10 e exiba: 9 a 10 = A, 7 a 8 = B, 5 a 6 = C, 0 a 4 = D", "Leia o número do mês e exiba a estação do ano correspondente (considerando o hemisfério sul)", "Leia três números e exiba o maior deles e trate o caso de empate", "Defina um usuário e senha fixos no código, leia o usuário e senha digitados e exiba: acesso permitido ou acesso negado", "Leia um número e informe se: é múltiplo de 3 e 5 simultaneamente, se é mútiplo de 3 apenas, se é só múltiplo de 5 e se não é míltiplo de nenhum", "Uma loja da o desconto conforme o valor da compra: acima de 500 reais é 20% de desconto, entre 200 e 500 reais é 10% de desconto e abaixo de 200 reais é sem desconto. Leia o valor e exiba quanto ficou no final após o desconto", "Leia um número de 1 a 10 e exiba seu equivalente em algarismo romano", "Leia a velocidade de um veículo e o limite da via: se dentro do limite é sem multa, se é ate 20% acima é multa leve, se é entre 20% e 50% acima é uma multa grave e se for acima de 50% é uma multa gravissima + a suspensão", "Leia a escolha de dois jogadores (pedra papel ou tesoura) e determine quem venceu ou se houve empate e exiba o resultado no final."};

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
                    break;
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
                System.out.println("Total de cadeiras ocupadas: " +ocupadas2);
                System.out.println("Total arrecadado: " +totalarrecadado);
                System.out.println("Total em reservas: " +totalreservas);
                System.out.println("Receita potencial: " +receitap);
                System.out.println("Receita máxima: " +receitamax);
                break;
            case 7:
               
                int paginaAtual = 0;
                int intensPorPagina = 7;
                int totalExercicios = 20;
                int totalPaginas = (int) Math.ceil((double) totalExercicios / intensPorPagina);
                String opcaoo;
                do {
                    int inicio = paginaAtual * intensPorPagina;
                    int fim = Math.min(inicio + intensPorPagina, totalExercicios);
                   System.out.println("Menu de exercícios");
                   for (int i = inicio; i < fim ; i++) {
                       System.out.println((i + 1) + " - " + extitulo[i]);
                   }
                   if (paginaAtual > 0) System.out.println("A - Página anterior");
                   if (paginaAtual < totalPaginas - 1) System.out.println("P - Proxíma página");
                   System.out.println("V - Voltar ao menu inicial");
                   System.out.println("Escolha: ");
                   opcaoo = scanner.next().toUpperCase();
                   if (opcaoo.equals("P") && paginaAtual < totalPaginas - 1) paginaAtual++;
                   else if (opcaoo.equals("A") && paginaAtual > 0)paginaAtual--;
                   else if (!opcaoo.equals("V")){
                    int n = Integer.parseInt(opcaoo) - 1;
                    if (n >= 0 && n < totalExercicios){
                        System.out.println(extitulo[n]);
                        System.out.println(exenunciado[n]);
                    }
                   }
                       
                   
                } while (!opcaoo.equals("V"));
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
