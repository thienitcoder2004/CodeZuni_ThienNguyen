import java.util.Scanner;

public class bt3 {
    public static long getSum1ToN(int n){
        if(n == 1){
            return 1;
        }
        return n + getSum1ToN(n - 1);
    }

    public static float SumOfFracons(int n) {
        if (n == 1) {
            return 1;
        }
        return 1.0f * 1 / getSum1ToN(n) + SumOfFracons(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Vui long nhap n ( n >= 1 ): ");
            n = Integer.parseInt(scan.nextLine());
        } while (n <= 1);
        System.out.print("Vui long nhap x: ");
        float sum = SumOfFracons(n);
        System.out.print("Sum of fractons: " + sum);
    }
}
