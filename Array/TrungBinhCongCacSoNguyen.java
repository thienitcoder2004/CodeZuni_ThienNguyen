import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void TrungBinhCongCacSoNguyen(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Vui long nhap vao so phan tu mang (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 2);

        int[] a = taoMang(n);
        xuatMang(a);

        double trungBinhCong = tinhTrungBinhCongSoNguyenTo(a);
        if (trungBinhCong != -1) {
            System.out.println("\nTrung binh cong cac so nguyen to trong mang: " + trungBinhCong);
        } else {
            System.out.println("\nKhong co so nguyen to nao trong mang");
        }
    }

    // Hàm tạo mảng ngẫu nhiên có giá trị
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
        System.out.println("Danh sach cac phan tu trong mang:");
        for (int i : a) {
            System.out.print(i + "   ");
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean kiemTraSoNguyenTo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hàm tính trung bình cộng các số nguyên tố trong mảng
    public static double tinhTrungBinhCongSoNguyenTo(int[] a) {
        int sum = 0;
        int dem = 0;
        for (int num : a) {
            if (kiemTraSoNguyenTo(num)) {
                sum += num;
                dem++;
            }
        }
        if (dem > 0) {
            return (double) sum / dem;
        } else {
            return -1; 
        }
    }
}
