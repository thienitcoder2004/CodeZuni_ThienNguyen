import java.util.Scanner;

public class TinhTongCacPhanTuChan {
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

    // Hàm tổng các phần tử chẵn 
    public static long TongCacPhanTuChan(int a[][], int soCot, int soDong) {
        long sum = 0;
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (a[i][j] % 2 == 0) { 
                    sum += a[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soDong = nhapDong(scan);
        int soCot = nhapCot(scan);

        int a[][] = nhapMaTran(soCot, soDong, scan);
        System.out.println("Danh sach mang 2 chieu: ");
        xuatMaTran(a, soCot, soDong);

        System.out.println("Tong cua cac gia tri so chan trong mang 2 chieu la: " + TongCacPhanTuChan(a, soCot, soDong));
    }
}
