import java.util.Scanner;

public class SumOfMultiplesCalculator {

    public static int sumOfMultiples(int current, int number) {
        if (current >= number) {
            return 0;
        }

        int sum = 0;
        if (current % 3 == 0 || current % 5 == 0) {
            sum = current;
        }

        return sum + sumOfMultiples(current + 1, number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para somar os múltiplos de 3 e 5 abaixo dele:");
        int limit = scanner.nextInt();

        int result = sumOfMultiples(1, limit);

        System.out.println("A soma dos múltiplos é: " + result);

        scanner.close();
    }
}
