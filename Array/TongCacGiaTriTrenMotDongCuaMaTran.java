import java.util.Scanner;

public class TongCacGiaTriTrenMotDongCuaMaTran {
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

    // Hàm tính tổng các giá trị trên một dòng của ma trận
    public static void TongCacGiaTriTrenMotDong(int a[][], int soDong, int soCot) {
        for (int i = 0; i < soCot; i++) {
            long sum = 0;
            for(int j=0;j<soDong;j++){
                sum += a[i][j];
            }
            System.out.println("Tong cac gia tri dong " + i + " = "+ sum);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soDong = nhapDong(scan);
        int soCot = nhapCot(scan);

        int a[][] = nhapMaTran(soCot, soDong, scan);
        System.out.println("Danh sach mang 2 chieu: ");
        xuatMaTran(a, soCot, soDong);
        TongCacGiaTriTrenMotDong(a, soDong, soCot);
    }
}
