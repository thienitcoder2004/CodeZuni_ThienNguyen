import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Vui long nhap vao so phan tu mang ( n > 2, n chan ): ");
            n = scanner.nextInt();
        } while (n % 2 != 0);

        // Tạo và xuất mảng
        int[] array = nhapMang(n);
        System.out.println("Danh sach cac phan tu trong mang:");
        xuatMang(array);

        // Nhập x và y
        System.out.print("\nx =  ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();

        // Liệt kê các số chẵn trong đoạn [x, y]
        lietkesochan(array, x, y);
        
    }

    // Hàm nhập n và tạo mảng
    public static int[] nhapMang(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(201) - 100;  // Giá trị trong đoạn [-100, 100]
        }
        return arr;
    }

    // Hàm xuất mảng
    public static void xuatMang(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Hàm liệt kê các số chẵn trong mảng thuộc đoạn [x, y]
    public static void lietkesochan(int[] arr, int x, int y) {
        for (int num : arr) {
            if (num % 2 == 0 && num >= x && num <= y) {
                System.out.println(num + " ");
            }
        }
    }

}

