import java.util.Random;
import java.util.Scanner;

public class LKCSL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int n;
        do {
            System.out.print("Vui long nhap vao so phan tu mang (n > 1): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 1);
    
        int[] a = TaoMang(n);
        System.out.println("Danh sach cac phan tu trong mang:");
        for (int num : a) {
            System.out.print(num + "     ");
        }
        System.out.println();
    
        // Kiểm tra và liệt kê các giá trị có toàn chữ số lẻ trong mảng
        if (KTGT(a)) {
            LietKeSoLe(a);
        } else {
            System.out.println("Khong co gia tri nao trong mang co toan chu so le");
        }
    }

    // Hàm tạo mảng ngẫu nhiên có giá trị
    public static int[] TaoMang(int n) {
        Random rand = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(2001) - 1000; // Giá trị ngẫu nhiên từ -1000 đến 1000
        }
        return a;
    }

    // Hàm kiểm tra một giá trị có toàn chữ số lẻ
    public static boolean KTMGTTCSL(int sl) {
        sl = Math.abs(sl); // Bỏ dấu âm nếu có
        while (sl > 0) {
            int current = sl % 10;
            if (current % 2 == 0) {
                return false; 
            }
            sl /= 10;
        }
        return true; 
    }

    // Hàm kiểm tra có giá trị nào trong mảng có toàn chữ số lẻ
    public static boolean KTGT(int[] a) {
        for (int num : a) {
            if (KTMGTTCSL(num)) {
                return true; 
            }
        }
        return false;
    }

    // Hàm liệt kê các giá trị có toàn chữ số lẻ trong mảng
    public static void LietKeSoLe(int[] a) {
        System.out.println("Cac gia tri co toan chu so le trong mang:");
        for (int num : a) {
            if (KTMGTTCSL(num)) {
                System.out.print(num + "    ");
            }
        }
    }
}
