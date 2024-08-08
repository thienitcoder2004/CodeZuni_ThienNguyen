import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui long nhap so n vao:");
        int n = sc.nextInt();

        System.out.println("Vui long nhap so x vao:");
        double x = sc.nextDouble();

        double sum = 0;
        double current = x;

        for (int i = 1; i <= n; i++) {
            sum += current;
            current *= x;
        }

        System.out.printf("Tong cua n = %d và x = %.2f la: %.2f%n", n, x, sum);
    }
}
