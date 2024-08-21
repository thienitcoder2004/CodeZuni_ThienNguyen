import java.util.Scanner;

public class NhapMang{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = nhapMang(n,sc);
        xuatMang(arr);
    }

    public static int[] nhapMang(int n, Scanner sc){
        int a[] = new int[n];
        System.out.println("Nhap mang: ");
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void xuatMang(int a[]){
        System.out.println("Xuat mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}