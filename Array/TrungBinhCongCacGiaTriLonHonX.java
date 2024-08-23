import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void TrungBinhCongCacGiaTriLonHonX(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Vui long nhap vao so phan tu mang (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 2);

        int[] a = taoMang(n);
        xuatMang(a);

        System.out.print("Vui long nhap gia tri x: ");
        int x = Integer.parseInt(scanner.nextLine());

        double trungBinhCong = tinhTrungBinhCongLonHonX(a, x);
        if (trungBinhCong != -1) {
            System.out.println("\nTrung binh cong cac gia tri lon hon " + x + " trong mang: " + trungBinhCong);
        } else {
            System.out.println("\nKhong co gia tri nao lon hon " + x + " trong mang");
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
        for (int value : a) {
            System.out.print(value + "   ");
        }
    }

    // Hàm tính trung bình cộng các giá trị lớn hơn x trong mảng
    public static double tinhTrungBinhCongLonHonX(int[] a, int x) {
        int sum = 0;
        int dem = 0;
        for (int num : a) {
            if (num > x) {
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
