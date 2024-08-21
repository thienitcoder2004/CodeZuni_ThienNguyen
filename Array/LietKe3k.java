import java.util.Scanner;

public class LietKe3k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui long nhap vao so phan tu mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] a = nhapMang(n, sc);

        xuatMang(a);

        if (coPhanTu3k(a)) {
            System.out.println("Danh sach cac gia tri co dang 3^k: ");
            inCacPhanTu3k(a);
        } else {
            System.out.println("Khong danh sach cac gia tri co dang 3^k: ");
        }
    }

    // Hàm nhập mảng
    public static int[] nhapMang(int n, Scanner sc) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    // Hàm xuất mảng
    public static void xuatMang(int[] a) {
        System.out.print("Danh sach cac phan tu trong mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Hàm kiểm tra một số có dạng 3^k không
    public static boolean laLuyThuaCua3(int x) {
        if (x <= 1) return false;
        while (x % 3 == 0) {
            x /= 3;
        }
        return x == 1;
    }

    // Hàm kiểm tra trong mảng có phần tử nào là lũy thừa của 3 không
    public static boolean coPhanTu3k(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (laLuyThuaCua3(a[i])) {
                return true;
            }
        }
        return false;
    }

    // Hàm in các phần tử có dạng 3^k trong mảng
    public static void inCacPhanTu3k(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (laLuyThuaCua3(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}
