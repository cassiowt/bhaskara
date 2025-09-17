import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá bem vindo ao Calculadora de Bhaskara!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double[] raizes = Bhaskara.calcularRaizes(a, b, c);
        
        System.out.println("Resultado: " + raizes.length + " raízes encontradas." +
        "Valores:  " + Arrays.toString(raizes));

        scanner.close();
    }
}