import java.util.Scanner;

public class DrawTrigle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui long nhap so tang cua tam giac vao: ");
        int n = sc.nextInt();
        
        // Tam giác đặc
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // Tam giác rỗng
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                if(i == 1 || i == n || j == 1 || j == 2 * i - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
