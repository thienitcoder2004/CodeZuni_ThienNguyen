import java.util.Random;
import java.util.Scanner;

public class TimGiaTriGanXNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Nhập số phần tử của mảng, n >= 2
        do {
            System.out.print("Vui lòng nhập vào số phần tử của mảng (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 2);

        // Tạo mảng số thực
        double[] mang = taoMang(n);
        xuatMang(mang);

        // Nhập giá trị x từ bàn phím
        System.out.print("Nhập giá trị x: ");
        double x = Double.parseDouble(scanner.nextLine());

        // Tìm giá trị trong mảng gần giá trị x nhất
        double giaTriGanXNhat = timGiaTriGanXNhat(mang, x);
        System.out.println("Giá trị trong mảng gần giá trị x nhất là: " + giaTriGanXNhat);
    }

    // Hàm tạo mảng ngẫu nhiên số thực từ -1000 đến 1000
    public static double[] taoMang(int n) {
        Random rand = new Random();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextDouble() * 2000 - 1000; // Giá trị ngẫu nhiên từ -1000 đến 1000
        }
        return a;
    }

    // Hàm xuất mảng
    public static void xuatMang(double[] a) {
        for (double value : a) {
            System.out.printf("%.2f   ", value);
        }
        System.out.println();
    }

    // Hàm tìm giá trị gần x nhất trong mảng
    public static double timGiaTriGanXNhat(double[] a, double x) {
        double giaTriGanXNhat = a[0];
        double khoangCachMin = Math.abs(a[0] - x);

        for (int i = 1; i < a.length; i++) {
            double khoangCachHienTai = Math.abs(a[i] - x);
            if (khoangCachHienTai < khoangCachMin) {
                khoangCachMin = khoangCachHienTai;
                giaTriGanXNhat = a[i];
            }
        }
        return giaTriGanXNhat;
    }
}
