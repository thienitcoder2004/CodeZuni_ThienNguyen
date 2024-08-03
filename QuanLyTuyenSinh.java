import java.util.Scanner;

public class QuanLyTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập điểm 3 môn
        System.out.println("Moi ban nhap diem mon thu nhat");
        float diem1 = sc.nextFloat();
        System.out.println("Moi ban nhap diem mon thu hai");
        float diem2 = sc.nextFloat();
        System.out.println("Moi ban nhap diem mon thu ba");
        float diem3 = sc.nextFloat();

        // Loại bỏ 
        sc.nextLine();

        // Nhập khu vực
        System.out.println("Nhap khu vuc cua thi sinh:");
        System.out.println("A. Khu vuc A");
        System.out.println("B. Khu vuc B");
        System.out.println("C. Khu vuc C");
        System.out.println("X. Khong co khu vuc");
        String khuvuc = sc.nextLine();

        // Nhập đối tượng
        System.out.println("Nhap doi tuong cua thi sinh:");
        System.out.println("1. Doi tuong 1");
        System.out.println("2. Doi tuong 2");
        System.out.println("3. Doi tuong 3");
        System.out.println("0. Khong co doi tuong");
        String doituong = sc.nextLine();

        // Tính tổng điểm 3 môn
        float tongDiem = diem1 + diem2 + diem3;

        // Tính điểm ưu tiên khu vực
        switch (khuvuc) {
            case "A":
                tongDiem += 2.0;
                break;
            case "B":
                tongDiem += 1.0;
                break;
            case "C":
                tongDiem += 0.5;
                break;
            case "X":
                break;
            default:
                System.out.println("Vui long nhap khu vuc lai!");
                return;
        }

        // Tính điểm ưu tiên đối tượng
        switch (doituong) {
            case "1":
                tongDiem += 2.5;
                break;
            case "2":
                tongDiem += 1.5;
                break;
            case "3":
                tongDiem += 1.0;
                break;
            case "0":
                break;
            default:
                System.out.println("Vui long nhap doi tuong lai!");
                return;
        }

        // So sanh tong diem dau
        System.out.println("Moi ban nhap diem chuan");
        float diemChuan = sc.nextFloat();
        if (tongDiem >= diemChuan) {
            System.out.println("Ban da du diem dau " + tongDiem);
        }else{
            System.out.println("Ban khong du diem dau " + tongDiem);
        }
    }
}
