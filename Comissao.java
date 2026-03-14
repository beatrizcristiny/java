import java.util.Scanner;
public class Comissao{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double salariof;
        double comissao;
        double totalv;
        double salariofm;
        System.out.println("Digite seu salario fixo: ");
        salariof = scanner.nextDouble();
        System.out.println("Digite o tal de vendas: ");
        totalv = scanner.nextDouble();
        comissao = totalv * 0.05;
        salariofm = salariof + comissao;
        System.out.println("A comissão é de: "+comissao);
        System.out.println("O salário final é de: "+salariofm);


    }
}