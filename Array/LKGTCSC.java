import java.util.Scanner;

public class LKGTCSC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Vui long nhap vao so phan tu mang (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 2);

        int[] a = new int[n];

        TaoMang(a, scanner);
        XuatMang(a);

        // Kiểm tra và liệt kê các giá trị có chữ số đầu tiên là số chẵn trong mảng
        if (KTChuSoDauChan(a)) {
            LietKeSoDauChan(a);
        } else {
            System.out.println("Khong co gia tri nao trong mang");
        }
    }

    // Hàm nhập mảng
    public static void TaoMang(int[] a, Scanner scanner) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    // Hàm xuất mảng
    public static void XuatMang(int[] a) {
        System.out.println("Danh sach cac phan tu trong mang: ");
        for (int value : a) {
            System.out.print(value + "  ");
        }
    }

    // Hàm kiểm tra chữ số đầu tiên của một số có là số chẵn
    public static boolean KTChuSoDauLaChan(int num) {
        while (num >= 10) {
            num /= 10; 
        }
        return num % 2 == 0; 
    }

    // Hàm kiểm tra trong mảng có số nào có chữ số đầu tiên là số chẵn 
    public static boolean KTChuSoDauChan(int[] a) {
        for (int i : a) {
            if (KTChuSoDauLaChan(i)) {
                return true;
            }
        }
        return false;
    }

    // Hàm liệt kê các số có chữ số đầu tiên là số chẵn trong mảng
    public static void LietKeSoDauChan(int[] a) {
        System.out.println("\nDanh sach cac gia tri co chu so dau tien la so chan dau:");
        for (int num : a) {
            if (KTChuSoDauLaChan(num)) {
                System.out.print(num + "   ");
            }
        }
    }
}
