import java.util.Scanner;

public class LandDeal extends RealEstate {
    protected final int LOAI_A = 1;
    protected final int LOAI_B = 2;
    protected final int LOAI_C = 3;

    protected int loaiDat;

    protected final float DEAL_A = 1.5f;

    public LandDeal() {
        super();
    }

    public LandDeal(String maGiaoDich, int ngay, int thang, int nam, float dongia, float dientich, float thanhtoan, int loaiDat) {
        super(maGiaoDich, ngay, thang, nam, dongia, dientich, thanhtoan);
        this.loaiDat = loaiDat;
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public void nhap(Scanner scan) {
        super.nhap(scan);
        do {
            System.out.print("Nhap loai dat (1: A, 2: B, 3: C): ");
            this.loaiDat = Integer.parseInt(scan.nextLine());
        } while (this.loaiDat < 1 || this.loaiDat > 3);
    }

    @Override
    public void xuat() {
        if(this.loaiDat == LOAI_A){
            System.out.print("A");
        }else if(this.loaiDat == LOAI_B){
            System.out.print("B");
        }else{
            System.out.print("C");
        }
        System.out.print("\tLoai Dat: " + this.loaiDat);
        super.xuat();
        System.out.println();
    }

    @Override
    public void tinhTongThanhToan() {
        if (this.loaiDat == LOAI_A) {
            this.thanhtoan = this.dientich * this.dongia * DEAL_A;
        } else {
            this.thanhtoan = this.dientich * this.dongia;
        }
    }
}
