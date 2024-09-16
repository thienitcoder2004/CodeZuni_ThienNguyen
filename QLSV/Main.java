package QLSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CongTy congTy = new CongTy();
        DanhSachNhanVien danhSachNhanVien = new DanhSachNhanVien();
        congTy.nhapDanhSachNhanVien();

        int chon = Integer.parseInt(scanner.nextLine());
        System.out.println("Menu:");
        System.out.println("Chon 1: Xuat toan bo thong tin nhan vien");
        System.out.println("Chon 2: Xuat tong tien luong nhan vien");
        System.out.println("Chon 3: Xuat nhan vien co luong cao nhat");
        System.out.print("---> Chon : " + chon);
        switch (chon) {
            case 1:
                congTy.xuatDanhSachNhanVien();
                break;
            case 2:
                danhSachNhanVien.tinhTongLuong();
                break;
            case 3:
                System.out.println("Nhan vien co luong cao nhat la: ");
                congTy.thongKe();
                break;
            default:
                System.out.println("Vui long nhap lai!");
                break;
        }

    }
}
