import java.util.Scanner;

public class TongCacChuSoHangChucLaNam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;
        do {
            System.out.print("Vui long nhap vao so phan tu mang (n >= 2): ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 2);
        
        int[] a = new int[n];

        nhapMang(a, scanner);
        xuatMang(a);

        System.out.println("Tong cac so co hang chuc bang 5 trong mang: " + tongSoHangChucBang5(a));
        System.out.println("Tong cac chu so cua cac so co hang chuc bang: " + tongChuSoHangChucBang5(a));
    }

    // Hàm nhập mảng
    public static void nhapMang(int[] a, Scanner scanner) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    // Hàm xuất mảng
    public static void xuatMang(int[] a) {
        System.out.println("Danh sach cac phan tu trong mang:");
        for (int value : a) {
            System.out.print(value + "     ");
        }
        System.out.println();
    }

    // Hàm kiểm tra số có hàng chục bằng 5
    public static boolean kiemTraHangChucBang5(int num) {
        int hangChuc = (num / 10) % 10;
        return hangChuc == 5;
    }

    // Hàm tính tổng các chữ số của một số
    public static int tongCacChuSo(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Hàm tính tổng các chữ số của các số có hàng chục bằng 5 trong mảng
    public static int tongChuSoHangChucBang5(int[] a) {
        int sum = 0;
        for (int num : a) {
            if (kiemTraHangChucBang5(num)) {
                sum += tongCacChuSo(num);
            }
        }
        return sum;
    }

    // Hàm tính tổng các số có hàng chục bằng 5 trong mảng
    public static int tongSoHangChucBang5(int[] a) {
        int sum = 0;
        for (int num : a) {
            if (kiemTraHangChucBang5(num)) {
                sum += num;
            }
        }
        return sum;
    }
}
