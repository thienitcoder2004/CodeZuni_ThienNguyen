import java.util.Random;
import java.util.Scanner;

public class TimViTriGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Nhập số phần tử của mảng, n >= 2
        do {
            System.out.print("Vui lòng nhập vào số phần tử của mảng (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 2);

        double[] array = taoMang(n);
        xuatMang(array);
        int minIndex = findMinIndex(array);
        System.out.println("Vị trí của giá trị nhỏ nhất trong mảng: " + minIndex);
    }

    // Hàm tạo mảng ngẫu nhiên các số thực có giá trị từ -1000 đến 1000
    public static double[] taoMang(int n) {
        Random rand = new Random();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextDouble() * 2000 - 1000; // Giá trị ngẫu nhiên từ -1000 đến 1000
        }
        return a;
    }

    // Hàm xuất mảng
    public static void xuatMang(double[] a) {
        for (double value : a) {
            System.out.print(value + "   ");
        }
        System.out.println(); 
    }

    // Hàm tìm vị trí của giá trị nhỏ nhất trong mảng
    public static int findMinIndex(double[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
