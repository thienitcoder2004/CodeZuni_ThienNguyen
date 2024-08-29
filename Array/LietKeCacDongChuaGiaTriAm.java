import java.util.Scanner;

public class LietKeCacDongChuaGiaTriAm {
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
    public static int[][] nhapMaTran(int soCot, int soDong, Scanner scan) {
        int a[][] = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
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

    // Hàm liệt kê các dòng có chứa giá trị âm trong ma trận
    public static void LKCacDongChuaGiaTriAm(int[][] a, int soDong, int soCot) {
        boolean flag = true;
        for (int i = 0; i < soDong; i++) {
            flag = false;
            for (int j = 0; j < soCot; j++) {
                if (a[i][j] < 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Dong " + i + " co chua gia tri am");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soDong = nhapDong(scan);
        int soCot = nhapCot(scan);

        int a[][] = nhapMaTran(soCot, soDong, scan);
        System.out.println("Danh sach mang 2 chieu: ");
        xuatMaTran(a, soCot, soDong);
        LKCacDongChuaGiaTriAm(a, soDong, soCot);
    }
}
