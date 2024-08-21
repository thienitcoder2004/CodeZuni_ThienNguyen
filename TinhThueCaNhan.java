import java.util.Scanner;

public class TinhThueCaNhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten nguoi nop thue: ");
        String ten = sc.nextLine();

        System.out.println("Nhap vao tong thu nhap trong nam trieu dong: ");
        double tongThuNhap = sc.nextDouble();

        System.out.println("Nhap vao so nguoi phu thuoc: ");
        int soNguoiPhuThuoc = sc.nextInt();

        double thuNhapChiuThue = tongThuNhap - 4 - soNguoiPhuThuoc * 1.6;

        // Tính thuế thu nhập cá nhân
        double thue = 0;

        if (thuNhapChiuThue > 0) {
            // Đến 60 từ 5%
            if (thuNhapChiuThue <= 60) {
                thue = thuNhapChiuThue * 0.05;
            } else
            // Trên 60 đến 120 từ 10%
            if (thuNhapChiuThue <= 120) {
                thue = 60 * 0.05 + (thuNhapChiuThue - 60) * 0.10;
            } else
            // Trên 120 đến 210 từ 15%
            if (thuNhapChiuThue <= 210) {
                thue = 60 * 0.05 + 60 * 0.10 + (thuNhapChiuThue - 120) * 0.15;
            } else
            // Trên 210 đến 384 từ 20%
            if (thuNhapChiuThue <= 384) {
                thue = 60 * 0.05 + 60 * 0.10 + 90 * 0.15 + (thuNhapChiuThue - 210) * 0.20;
            } else
            // Trên 384 đến 624 từ 25%
            if (thuNhapChiuThue <= 624) {
                thue = 60 * 0.05 + 60 * 0.10 + 90 * 0.15 + 174 * 0.20 + (thuNhapChiuThue - 384) * 0.25;
            } else
            // Trên 624 đến 960 từ 30%
            if (thuNhapChiuThue <= 960) {
                thue = 60 * 0.05 + 60 * 0.10 + 90 * 0.15 + 174 * 0.20 + 240 * 0.25 + (thuNhapChiuThue - 624) * 0.30;
            } else {
                thue = 60 * 0.05 + 60 * 0.10 + 90 * 0.15 + 174 * 0.20 + 240 * 0.25 + 336 * 0.30
                        + (thuNhapChiuThue - 960) * 0.35;
            }
        }

        System.out.println("So thue " + ten + "phai nop la " + thue + " trieu dong");
    }
}
