import java.util.Scanner;

public class LietKeCacCapGTGanNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Vui long nhap vao so phan tu cua mang (n >= 2): ");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 2);

        int[] a = new int[n];

        nhapMang(a, sc);

        xuatMang(a);

        System.out.println("\nCac cap gia tri co khoang cach gan nhau nhat:");
        lietKeCacCapGanNhat(a);
    }

    // Hàm nhập mảng
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
    }

    // Hàm xuất mảng
    public static void xuatMang(int[] a) {
        System.out.print("Danh sach cac phan tu trong mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Hàm tìm khoảng cách gần nhau nhất
    public static int timKhoangCachGanNhat(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            int current = Math.abs(a[i] - a[i + 1]);
            if(current < min){
                min = current;
            }
        }
        return min;
    }

    // Hàm liệt kê các cặp có khoảng cách gần nhau nhất
    public static void lietKeCacCapGanNhat(int[] a) {
        int timkhoangcach = timKhoangCachGanNhat(a);
        for (int i = 0; i < a.length - 1; i++) {
            int current = Math.abs(a[i] - a[i + 1]);
            if(current == timkhoangcach){
                System.out.println("(" + a[i] + ", " + a[i + 1] + ")");
            }
        }
    }
}
