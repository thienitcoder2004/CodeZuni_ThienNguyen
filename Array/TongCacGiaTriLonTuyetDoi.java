import java.util.Random;
import java.util.Scanner;

public class TongCacGiaTriLonTuyetDoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Vui long nhap vao so phan tu mang (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 2);

        int[] a = taoMang(n);
        xuatMang(a);

        System.out.println("\nTong cac gia tri lon hon tri tuyet doi cua gia tri dung lien sau trong mang: " + tongGiaTriLonHonTriTuyetDoiSau(a));
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
        System.out.println();
    }

    // Hàm kiểm tra giá trị lớn hơn trị tuyệt đối của giá trị đứng liền sau nó trong mảng
    public static boolean kiemTraGiaTriLonHonTriTuyetDoiSau(int[] a, int index) {
        if (index < a.length - 1) {
            return a[index] > Math.abs(a[index + 1]);
        }
        return false;
    }

    // Hàm tính tổng các giá trị lớn hơn trị tuyệt đối của giá trị đứng liền sau nó trong mảng
    public static int tongGiaTriLonHonTriTuyetDoiSau(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (kiemTraGiaTriLonHonTriTuyetDoiSau(a, i)) {
                sum += a[i];
            }
        }
        return sum;
    }
}
