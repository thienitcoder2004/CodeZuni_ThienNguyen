import java.util.Scanner;

public class TinhGTTB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 5;
        System.out.println("Tinh trung binh nam so nhap: ");
        for(int i = 1; i <= n; i++){
            System.out.print("Vui long nhap so thu " + i + ": ");
            int nhap = sc.nextInt();
            sum += nhap;
        }        
        int gttb = sum / n;
        System.out.println("Trung binh cua nam so nhap la: " + gttb);
    }
}