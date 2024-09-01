import java.util.Random;
import java.util.Scanner;

public class TimViTriSoNguyenToCuoiCung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Nhập số phần tử của mảng, n >= 2
        do {
            System.out.print("Vui lòng nhập vào số phần tử của mảng (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 2);

        double[] mang = taoMang(n);
        xuatMang(mang);

        int viTriSoNguyenToCuoiCung = timViTriSoNguyenToCuoiCung(mang);
        if (viTriSoNguyenToCuoiCung == -1) {
            System.out.println("Mảng không có số nguyên tố.");
        } else {
            System.out.println("Vị trí " + viTriSoNguyenToCuoiCung + " là vị trí số nguyên tố cuối cùng trong mảng.");
        }
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

    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    // Hàm tìm vị trí số nguyên tố cuối cùng trong mảng số thực
    public static int timViTriSoNguyenToCuoiCung(double[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            // Chuyển đổi số thực thành số nguyên
            int giaTri = (int) a[i];
            if (a[i] == giaTri && laSoNguyenTo(giaTri)) {
                return i;
            }
        }
        return -1;
    }
}
