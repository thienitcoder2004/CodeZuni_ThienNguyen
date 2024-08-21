import java.util.Scanner;

public class FunctionWaitYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap so tien gui (tr) vao");
        double tiengui = sc.nextDouble();
        
        System.out.println("Vui long nhap so tien mong muon (tr) vao");
        double tienmongmuon = sc.nextDouble();

        System.out.println("Vui long nhap lai suat gui (%) tu 0 - 100 vao");
        double laisuat = sc.nextDouble();

        double year = 0;

        while(tiengui < tienmongmuon){
            double lai =  tiengui * (laisuat / 100);
            tiengui += lai;
            year++;
        }

        System.out.print("So nam doi cho la: " + year);
    }
}