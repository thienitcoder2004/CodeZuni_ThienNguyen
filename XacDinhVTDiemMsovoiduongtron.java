import java.util.Scanner;

public class XacDinhVTDiemMsovoiduongtron {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Xac Dinh toa do diem M");
        System.out.print("Vui long nhap toa do x cua tam duong tron: ");
        float x = sc.nextFloat();
        System.out.print("Vui long nhap toa do y cua tam duong tron: ");
        float y = sc.nextFloat();
        System.out.print("Vui long nhap ban kinh cua duong tron: ");
        float r = sc.nextFloat();
        System.out.print("Vui long nhap toa do x cua diem M: ");
        float xM = sc.nextFloat();
        System.out.print("Vui long nhap toa do y cua diem M: ");
        float yM = sc.nextFloat();
        
        double khoangcach = Math.pow((xM - x), 2) + Math.pow((yM - y), 2);
        double rBinhPhuong = Math.pow(r, 2);
        
        if (khoangcach < rBinhPhuong){
            System.out.println("Diem M nam trong duong tron");
        } else if (khoangcach == rBinhPhuong){
            System.out.println("Diem M nam tren duong tron");
        } else {
            System.out.println("Diem M nam ngoai duong tron");
        }
    }
}
