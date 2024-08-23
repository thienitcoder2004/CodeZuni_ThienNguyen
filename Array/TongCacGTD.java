import java.util.Random;
import java.util.Scanner;

public class TongCacGTD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int n;
        do {
            System.out.print("Vui long nhap vao so phan tu mang (n > 1): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 1);
    
        int[] a = TaoMang(n);
        System.out.println("Danh sach cac phan tu trong mang:");
        for (int num : a) {
            System.out.print(num + "     ");
        }
        System.out.println();
        
        System.out.println("\nTong cac so trong mang co gia tri lon hon 0 la: " + tong(a));
    }

    // Hàm tạo mảng ngẫu nhiên có giá trị
    public static int[] TaoMang(int n) {
        Random rand = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(2001) - 1000; // Giá trị ngẫu nhiên từ -1000 đến 1000
        }
        return a;
    }

    public static double tong(int[] a){
        double sum = 0;
        for (int i : a) {
            if(i > 0){
                sum += i;
            }
        }
        return sum;
    }
}
