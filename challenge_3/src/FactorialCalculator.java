import java.util.Scanner;

public class FactorialCalculator {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número não deve ser negativo");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular seu fatorial: ");
        int number = scanner.nextInt();

        long result = factorial(number);

        System.out.println("Fatorial de " + number + " é: " + result);
    }
}
