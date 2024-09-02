import java.util.Scanner;

public class TinhTong1chiaN {
    public static double calculateS(int n) {
        // Điều kiện dừng: nếu n = 1, trả về 1
        if (n == 1) {
            return 1.0;
        }
        // Gọi đệ quy cho n-1 và cộng thêm 1/n
        return 1.0 / n + calculateS(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        double result = calculateS(n);
        System.out.println("S(" + n + ") = " + result);

    }
}
