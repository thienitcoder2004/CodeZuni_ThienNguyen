import java.util.Random;
import java.util.Scanner;

public class TimViTriChanDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Nhập số phần tử của mảng, n >= 2
        do {
            System.out.print("Vui lòng nhập vào số phần tử của mảng (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 2);

        int[] array = taoMang(n);
        xuatMang(array);

        int evenIndex = TimViTriDauTienChan(array);
        if (evenIndex != -1) {
            System.out.println("Vị trí của giá trị chẵn đầu tiên trong mảng: " + evenIndex);
        } else {
            System.out.println("Mảng không có giá trị chẵn.");
        }
    }

    // Hàm tạo mảng ngẫu nhiên các số nguyên có giá trị từ -1000 đến 1000
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

    // Hàm tìm vị trí của giá trị chẵn đầu tiên trong mảng
    public static int TimViTriDauTienChan(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { 
                return i;
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy giá trị chẵn
    }
}
