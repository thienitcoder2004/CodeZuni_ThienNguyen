import java.util.Scanner;

public class RecursiveSum {
    public static float SumOfFracons(int n) {
        if (n == 1) {
            return (1.0f) * 1 / (1 * 2);
        }
        return (1.0f) * 1 / (n * (n + 1)) + SumOfFracons(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.println("Vui long nhap n ( n >= 1 ): ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);

        float sumFracons = SumOfFracons(n);
        System.out.println("Sum of fractons: " + sumFracons);
    }
}
