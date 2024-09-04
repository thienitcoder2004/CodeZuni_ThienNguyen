import java.util.Scanner;

public class Sort {
    // Constants for generating random numbers
    static final int MIN = -100;
    static final int MAX = 100;

    // Hàm nhập số lượng
    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.print("Vui long nhap n > 0: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }

    // Hàm nhập mảng
    public static int[] nhapMang(Scanner scan, int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }

    // Hàm tạo mảng
    public static int[] taoMang(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = MIN + (int) ((Math.random() * (MAX - MIN + 1)));
        }
        return a;
    }

    // Hàm xuất mảng
    public static void xuatMang(int[] a) {
        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    // Hàm sắp xếp nổi bọt
    public static int[] InterchangeSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    // Hàm sắp xếp chèn
    public static int[] InsertionSort(int[] a) {
        int pos, x;
        for (int i = 1; i < a.length; i++) {
            x = a[i];
            pos = i - 1;
            while (pos >= 0 && a[pos] > x) {
                a[pos + 1] = a[pos];
                --pos;
            }
            a[pos + 1] = x;
        }
        return a;
    }

    // Hàm nối mảng A và B
    public static int[] NoiMang(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int posB = b.length - 1;
        int posA = a.length - 1;
        for (int i = 0; i < c.length; i++) {
            while (posA >= 0 && posB >= 0) {
                if (b[posB] > a[posA]) {
                    c[i++] = b[posB--];
                } else {
                    c[i++] = a[posA--];
                }
            }
            if (posA != -1) {
                c[i] = a[posA--];
            } else {
                c[i] = b[posB--];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Nhập mảng A
        System.out.println("Nhap mang A: ");
        int nA = nhapN(scan);
        int[] a = nhapMang(scan, nA);

        // Nhập mảng B
        System.out.println("Nhap mang B: ");
        int nB = nhapN(scan);
        int[] b = nhapMang(scan, nB);

        // Xuất mảng A và B
        System.out.println("Mang A: ");
        xuatMang(a);

        System.out.println("Mang B: ");
        xuatMang(b);

        // Nối mảng A và B
        int[] c = NoiMang(a, b);

        // Xuất mảng sau khi nối
        System.out.println("Mang C (sau khi noi mang A va B): ");
        xuatMang(c);
    }
}
