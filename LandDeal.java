import java.util.Scanner;

public class LandDeal extends RealEstate {
    protected int loaiDat;
    protected int A;
    protected int B;
    protected int C;

    protected float DEAL_A = 1.5f;

    public LandDeal() {
        super();
    }

    public LandDeal(String maGiaoDich, int ngay, int thang, int nam, float dongia, float dientich, float thanhtoan,
            int loaiDat, int A, int B, int C) {
        super(maGiaoDich, ngay, thang, nam, dongia, dientich, thanhtoan);
        this.loaiDat = loaiDat;
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    @Override
    public void nhap(Scanner scan) {
        super.nhap(scan);
        do {
            System.out.print("Nhap loai dat: ");
            this.loaiDat = Integer.parseInt(scan.nextLine());
        } while (this.loaiDat < 1 || this.loaiDat > 3);
    }

    @Override
    public void xuat() {
        System.out.print("Loai Dat: ");
        if (this.loaiDat == A) {
            System.out.print("A\t\t");
        } else if (this.loaiDat == B) {
            System.out.print("B\t\t");
        } else {
            System.out.print("C\t\t");
        }
        super.xuat();
        System.out.println("\n");
    }

    @Override
    public void tinhTongThanhToan(){
        if(this.loaiDat == 1){
            this.thanhtoan = this.dientich * this.dongia * DEAL_A;
        }else{
            this.thanhtoan = this.dientich * this.dongia;
        }
    }
}
