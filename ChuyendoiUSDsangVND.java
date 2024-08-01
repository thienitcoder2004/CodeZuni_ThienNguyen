import java.util.Scanner;

public class ChuyendoiUSDsangVND{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        double VND = 23500.0;
        System.out.println("Doi tien USD => VND");
        System.out.print("Vui long nhap so USD can doi: ");
        double USD = sc.nextDouble();
        double VND_result = USD * VND;
        System.out.print("So tien VND sau khi doi: " + VND_result + " vnd");    
    }
}
