import java.util.Scanner;
import java.util.Random;

public class TimViTriDuongNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Vui lòng nhập vào số phần tử của mảng (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 2);

        int[] mang = taoMang(n);
        xuatMang(mang);

        int viTriDuongNhoNhat = timViTriDuongNhoNhat(mang);
        if (viTriDuongNhoNhat == -1) {
            System.out.println("Mảng không có giá trị dương.");
        } else {
            System.out.println("Giá trị dương nhỏ nhất nằm ở vị trí: " + viTriDuongNhoNhat);
        }
    }
    // Hàm tạo mảng ngẫu nhiên
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
        for (int value : a) {
            System.out.print(value + "   ");
        }
        System.out.println();
    }
    // Tìm vị trí dương nhỏ nhất trong mảng
    public static int timViTriDuongNhoNhat(int[] a) {
        int viTri = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && (viTri == -1 || a[i] < a[viTri])) {
                viTri = i;
            }
        }
        return viTri;
    }
}
