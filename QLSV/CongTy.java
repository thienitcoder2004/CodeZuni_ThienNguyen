package QLSV;

import java.time.LocalDate;
import java.util.Scanner;

public class CongTy {
    private DanhSachNhanVien objDSNV = new DanhSachNhanVien();

    public void nhapDanhSachNhanVien() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên:");
        int soLuong = scan.nextInt();
        scan.nextLine();  // Ăn dòng còn lại

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập tên nhân viên:");
            String ten = scan.nextLine();
            System.out.println("Nhập mã nhân viên:");
            int maNV = scan.nextInt();
            scan.nextLine();  // Ăn dòng còn lại
            System.out.println("Nhập ngày sinh (yyyy-mm-dd):");
            int ngaySinh = scan.nextInt();
            System.out.println("Nhập địa chỉ:");
            String diaChi = scan.nextLine();
            System.out.println("Nhập hệ số lương:");
            double heSoLuong = scan.nextDouble();
            scan.nextLine();  // Ăn dòng còn lại

            NhanVien nv = new NhanVien(ten, maNV, ngaySinh, diaChi, heSoLuong);
            objDSNV.nhapNhanVien(nv);
        }
    }

    public void xuatDanhSachNhanVien() {
        objDSNV.xuatNhanVien();
    }

    public void thongKe() {
        System.out.println("Tổng tiền lương của tất cả nhân viên: " + objDSNV.tinhTongLuong());
        NhanVien nvLuongCaoNhat = objDSNV.xuatNhanVienLuongCaoNhat();
        if (nvLuongCaoNhat != null) {
            System.out.println("Nhân viên có lương cao nhất: " + nvLuongCaoNhat);
        } else {
            System.out.println("Danh sách nhân viên trống.");
        }
    }
}
