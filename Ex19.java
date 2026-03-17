import java.util.Scanner;
public class Ex19{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int velocidade;
    int limite = 110;
    System.out.println("Digite a velocidade do seu veículo: ");
    velocidade = scanner.nextInt();
    if (velocidade <= limite){
        System.out.println("Você não tomou multa");
    }else{
        double diferenca = velocidade - limite;
        double porc = (diferenca / limite) * 100;
        if (porc <= 20){
            System.out.println("Você tomou uma multa leve");
        }else if(porc <= 50){
            System.out.println("Você tomou uma multa grave");
        } else {
            System.out.println("Você tomou uma multa gravissima + suspensão");
        }
    }

    }
}    
