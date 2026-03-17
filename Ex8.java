import java.util.Scanner;
public class Ex8{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        Double peso;
        Double altura;
        Double imc;
        System.out.println("Digite seu peso (Kg): ");
        peso = scanner.nextDouble();
        System.out.println("Digite sua altura (M): ");
        altura = scanner.nextDouble();
        imc = peso / (altura * altura);
        if (imc < 18.5){
            System.out.println("Você está abaixo do peso");
        } else if ( imc >= 18.5 && imc < 25){
            System.out.println("O seu peso é normal");
        }else if (imc >= 25 && imc < 30){
            System.out.println("Você está em sobrepeso");
        }else if (imc >= 30){
            System.out.println("Você está obeso");
        }
        String seuimce = (imc >= 18.5 && imc < 25)? " está dentro da faixa de peso saudável" : " está fora da faixa de peso saudável";
        System.out.println("Você" +seuimce);

    }
}