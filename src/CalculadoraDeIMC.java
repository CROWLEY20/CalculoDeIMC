import java.util.Scanner;

public class CalculadoraDeIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        String pesoTexto = scanner.next().replace(",", ".");
        double peso = Double.parseDouble(pesoTexto);

        System.out.print("Digite sua altura (m): ");
        String alturaTexto = scanner.next().replace(",", ".");
        double altura = Double.parseDouble(alturaTexto);

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f - ", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Você está com o peso normal.");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }

        scanner.close();
    }
}