import java.util.Random;
import java.util.Scanner;

public class TimSoNguyenToCuoiCung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Vui lòng nhập vào số phần tử của mảng (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 2);

        int[] mang = taoMang(n);
        xuatMang(mang);

        int soNguyenToCuoiCung = timSoNguyenToCuoiCung(mang);
        if (soNguyenToCuoiCung == -1) {
            System.out.println("Mảng không có số nguyên tố.");
        } else {
            System.out.println("Số nguyên tố cuối cùng trong mảng là: " + soNguyenToCuoiCung);
        }
    }

    // Hàm tạo mảng ngẫu nhiên các số nguyên từ -1000 đến 1000
    public static int[] taoMang(int n) {
        Random rand = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(2001) - 1000; // Giá trị ngẫu nhiên từ -1000 đến 1000
        }
        return a;
    }

    // Hàm xuất mảng
    public static void xuatMang(int[] a) {
        for (int value : a) {
            System.out.print(value + "   ");
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

    // Hàm tìm số nguyên tố cuối cùng trong mảng
    public static int timSoNguyenToCuoiCung(int[] a) {
        int soNguyenToCuoiCung = -1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (laSoNguyenTo(a[i])) {
                soNguyenToCuoiCung = a[i];
                break;
            }
        }
        return soNguyenToCuoiCung;
    }
}
