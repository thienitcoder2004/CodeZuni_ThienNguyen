import java.util.ArrayList;
import java.util.Scanner;

public class ListDeal {
    protected ArrayList<RealEstate> listDeal;
    protected int soluongdatdai;
    protected float tongsotiendat;
    protected int soluongnha;
    protected float tongsotiennha;

    public int getSoluongdatdai() {
        return soluongdatdai;
    }

    public float getTongsotiendat() {
        return tongsotiendat;
    }

    public int getSoluongnha() {
        return soluongnha;
    }

    public float getTongsotiennha() {
        return tongsotiennha;
    }

    public ListDeal() {
        this.listDeal = new ArrayList<RealEstate>();
    }

    public void nhap(Scanner scan) {
        boolean flag = true;

        do {
            System.out.println("Vui long lua chon: ");
            System.out.println("1. Nhap loai dat: ");
            System.out.println("2. Nhap loai nha:");
            System.out.println("0. Thoat");
            int chon = Integer.parseInt(scan.nextLine());
            switch (chon) {
                case 1:
                    RealEstate loaidat = new RealEstate();
                    loaidat.nhap(scan);
                    this.listDeal.add(loaidat);
                    break;
                case 2:
                    RealEstate loainha = new HouseDeal();
                    loainha.nhap(scan);
                    this.listDeal.add(loainha);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Vui long nhap lai!");
                    break;
            }
        } while (flag);
    }

    public void xuat() {
        for (RealEstate deal : this.listDeal) {
            deal.xuat();
        }
    }

    // Tính tổng tất cả các hóa đơn nhà và đất
    public void tinhTatCaThanhToan() {
        for (RealEstate deal : this.listDeal) {
            deal.tinhTongThanhToan();
        }
    }

    // Đếm loại đất
    public void demLoaiDat() {
        this.soluongdatdai = 0;
        this.tongsotiendat = 0;
        for (RealEstate deal : this.listDeal) {
            if (deal instanceof LandDeal) {
                ++this.soluongdatdai;
                this.tongsotiendat += deal.getThanhtoan();
            }
        }
    }

    // Đếm loại nhà
    public void demLoaiNha() {
        this.soluongnha = 0;
        this.tongsotiennha = 0;
        for (RealEstate deal : this.listDeal) {
            if (deal instanceof HouseDeal) {
                ++this.soluongnha;
                this.tongsotiennha += deal.getThanhtoan();
            }
        }
    }

    // Tính trung bình giá trị đất
    public float tinhTrungBinh() {
        if (this.soluongdatdai == 0) {
            return 0; 
        }
        return this.tongsotiendat / (this.soluongdatdai * 1.0f);
    }

    // Danh sách giao dịch
    public void exportDeal(int thang, int nam) {
        System.out.println("Danh sach " + thang + "/" + nam);
        for (RealEstate deal : this.listDeal) {
            if (deal.thang == thang && deal.nam == nam) {
                deal.xuat();
            }
        }
    }
}
