import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui long nhap so n vao");

        int n = sc.nextInt();
        long giaithua = 1;
        if(n == 0 || n == 1){
            return;            
        }else{
            for(int i = 2; i <= n; i++){
                giaithua *= i;
            }
            System.out.println("Giai thua cua " + n + "! la: " + giaithua);
        }
    }
}
