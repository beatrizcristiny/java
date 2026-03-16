import java.util.Scanner;
public class Ex3{
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    Double media;
    System.out.println("Digite sua média de 0 a 10");
    media = scanner.nextDouble();
    if (media > 10 || media < 0){
        System.out.println("Erro: O valor mínimo que pode se digitar é 0 e o máximo 10.");
    } else{
    String situacao = (media >= 7)? "Aprovado" : (media >= 5 && media < 7)? "Recuperação" : "Reprovado";
    System.out.println("A situação do aluno é " +situacao);
    }
}
}