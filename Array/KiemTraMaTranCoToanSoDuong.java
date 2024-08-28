import java.util.Scanner;

public class KiemTraMaTranCoToanSoDuong {

    public static int MIN = -50;
    public static int MAX = 50;

    // Nhập số dòng
    public static int nhapDong(Scanner scan) {
        int n;
        do {
            System.out.print("Vui long nhap so dong: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    // Nhập số cột
    public static int nhapCot(Scanner scan) {
        int n;
        do {
            System.out.print("Vui long nhap so cot: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    // Nhập ma trận
    public static int[][] nhapMaTran(int soCot, int soDong, Scanner scan){
        int a[][] = new int[soDong][soCot];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("a[" + i + "] [" + j + "] = ");
                a[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        return a;
    }

    // Xuất ma trận
    public static void xuatMaTran(int a[][], int soCot, int soDong) {
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(a[i][j] + "  "); // in một dòng
            }
            System.out.println(""); // xuống dòng
        }
    }

    // Hàm kiểm tra ma trận có toàn số dương hay không
    public static void KiemTraMaTranCoToanSoDuong(int a[][], int soCot, int soDong){
        boolean toanSoDuong = true;
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (a[i][j] <= 0) {
                    toanSoDuong = false;
                    break;
                }
            }
        }
        if (toanSoDuong) {
            System.out.println("Ma tran la ma tran toan duong");
        } else {
            System.out.println("Ma tran la ma tran khong toan duong");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soDong = nhapDong(scan);
        int soCot = nhapCot(scan);

        int a[][] = nhapMaTran(soCot, soDong, scan);
        System.out.println("Danh sach mang 2 chieu: ");
        xuatMaTran(a, soCot, soDong);
        KiemTraMaTranCoToanSoDuong(a, soCot, soDong);
    }
}
