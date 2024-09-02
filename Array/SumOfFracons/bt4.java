import java.util.Scanner;

public class bt4 {
    public static int SumOfFracons(int n) {
        if (n / 10 == 0) {
            return 1;
        }
        return 1 + SumOfFracons(n / 10);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Vui long nhap n ( n >= 1 ): ");
            n = Integer.parseInt(scan.nextLine());
        } while (n <= 1);
        float sum = SumOfFracons(n);
        System.out.print("Amount of number characters: " + sum);
    }
}
