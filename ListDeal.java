import java.util.ArrayList;
import java.util.Scanner;

public class ListDeal {
    protected ArrayList<RealEstate> listDeal;
    protected int soluongDatDai;
    protected float tongSoTienDat;
    protected int soluongNha;
    protected float tongSoTienNha;

    public ListDeal() {
        this.listDeal = new ArrayList<>();
    }

    public int getSoluongDatDai() {
        return soluongDatDai;
    }

    public float getTongSoTienDat() {
        return tongSoTienDat;
    }

    public int getSoluongNha() {
        return soluongNha;
    }

    public float getTongSoTienNha() {
        return tongSoTienNha;
    }

    public void nhap(Scanner scan) {
        boolean flag = true;

        while (flag) {
            System.out.println("Vui long lua chon:");
            System.out.println("1. Nhap loai dat");
            System.out.println("2. Nhap loai nha");
            System.out.println("0. Thoat");
            int chon = Integer.parseInt(scan.nextLine());

            switch (chon) {
                case 1:
                    RealEstate loaiDat = new LandDeal();
                    loaiDat.nhap(scan);
                    this.listDeal.add(loaiDat);
                    break;
                case 2:
                    RealEstate loaiNha = new HouseDeal();
                    loaiNha.nhap(scan);
                    this.listDeal.add(loaiNha);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Vui long nhap lai!");
                    break;
            }
        }
    }

    public void xuat() {
        for (RealEstate deal : this.listDeal) {
            deal.xuat();
            System.out.println();
        }
    }

    // Tỉnh tổng số doanh thu
    public void tinhTatCaThanhToan() {
        for (RealEstate deal : this.listDeal) {
            deal.tinhTongThanhToan();
        }
    }

    // Đếm loại đất
    public void demLoaiDat() {
        this.soluongDatDai = 0;
        this.tongSoTienDat = 0;
        for (RealEstate deal : this.listDeal) {
            if (deal instanceof LandDeal) {
                ++this.soluongDatDai;
                this.tongSoTienDat += deal.getThanhtoan();
            }
        }
    }

    // Đếm loại nhà
    public void demLoaiNha() {
        this.soluongNha = 0;
        this.tongSoTienNha = 0;
        for (RealEstate deal : this.listDeal) {
            if (deal instanceof HouseDeal) {
                ++this.soluongNha;
                this.tongSoTienNha += deal.getThanhtoan();
            }
        }
    }

    // Tính trung bình tiền đất
    public float tinhTrungBinh() {
        if (this.soluongDatDai == 0) {
            return 0; 
        }
        return this.tongSoTienDat / this.soluongDatDai;
    }

    // Danh sách thời gian giao dịch
    public void exportDeal(int thang, int nam) {
        System.out.println("Danh sach " + thang + "/" + nam);
        for (RealEstate deal : this.listDeal) {
            if (deal.getThang() == thang && deal.getNam() == nam) {
                deal.xuat();
                System.out.println();
            }
        }
    }
}
