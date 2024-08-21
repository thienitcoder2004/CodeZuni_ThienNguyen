import java.util.Scanner;

public class SumOneNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so nguyen duong lon hon 0:");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Vui long nhap lai!");
        }else{
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.print("Tong cac so be hon " + n + " la: " + sum);
        }
    }
}