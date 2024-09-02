import java.util.Scanner;

public class SumPow {
    public static long SumOfFracons(int x, int n) {
        if (n == 1) {
            return x;
        }
        return (long) Math.pow(x, n) + SumOfFracons(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Vui long nhap n ( n >= 1 ): ");
            n = Integer.parseInt(scan.nextLine());
        } while (n <= 1);
        int x;
        System.out.print("Vui long nhap x: ");
        x = Integer.parseInt(scan.nextLine());
        long sum = SumOfFracons(n, x);
        System.out.print("Sum of fractons: " + sum);
    }
}
