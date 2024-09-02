import java.util.Scanner;

public class bt6 {
    public static double SumOfFracons(int n) {
        if (n == 1) {
            return 1;
        }
        return Math.sqrt(n + SumOfFracons(n - 1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Vui long nhap n ( n >= 1 ): ");
            n = Integer.parseInt(scan.nextLine());
        } while (n <= 1);
        double sum = SumOfFracons(n);
        System.out.print("Sum of square root: " + sum);
    }
}
