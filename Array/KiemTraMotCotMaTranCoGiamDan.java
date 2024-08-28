import java.util.Scanner;

public class KiemTraMotCotMaTranCoGiamDan {
    public static int MIN = -50;
    public static int MAX = 50;

    // Nhập số dòng
    public static int nhapDong(Scanner scan) {
        int n;
        do {
            System.out.print("Vui lòng nhập số dòng: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    // Nhập số cột
    public static int nhapCot(Scanner scan) {
        int n;
        do {
            System.out.print("Vui lòng nhập số cột: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    // Nhập ma trận
    public static int[][] nhapMaTran(int soCot, int soDong, Scanner scan) {
        int[][] a = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        return a;
    }

    // Xuất ma trận
    public static void xuatMaTran(int[][] a, int soCot, int soDong) {
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Hàm kiểm tra một cột ma trận có giảm dần
    public static boolean kiemTraMotCotMaTranCoGiamDan(int[][] a, int cot, int soDong) {
        for (int i = 1; i < soDong; i++) {
            if (a[i][cot] >= a[i - 1][cot]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soDong = nhapDong(scan);
        int soCot = nhapCot(scan);

        int[][] a = nhapMaTran(soCot, soDong, scan);
        System.out.println("Danh sach ma tran 2 chieu: ");
        xuatMaTran(a, soCot, soDong);

        while (true) {
            System.out.print("Vui nhap vao vi tri cot can kiem tra tu 0 den " + (soCot - 1) + ": ");
            int cot = Integer.parseInt(scan.nextLine());

            boolean flag = kiemTraMotCotMaTranCoGiamDan(a, cot, soDong);

            if (flag) {
                System.out.println("Cot " + cot + " la cot giam dan");
            } else {
                System.out.println("Cot " + cot + " không phai cot giam dan");
            }

            System.out.print("Ban co muon kiem tra tiep khong? Nhan 0 de tiep tuc: ");
            if (Integer.parseInt(scan.nextLine()) == 0) {
                break;
            }
        }
    }
}
