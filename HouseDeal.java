import java.util.Scanner;

public class HouseDeal extends RealEstate {
    protected final int VIP = 1;
    protected final int THUONG = 2;

    protected String diaChi;
    protected int loaiNha;

    public HouseDeal() {
        super();
        this.diaChi = "";
        this.loaiNha = 0;
    }

    public HouseDeal(String maGiaoDich, int ngay, int thang, int nam, float dongia, float dientich, float thanhtoan, String diaChi, int loaiNha) {
        super(maGiaoDich, ngay, thang, nam, dongia, dientich, thanhtoan);
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public void nhap(Scanner scan) {
        super.nhap(scan);
        System.out.print("Nhap dia chi nha: ");
        this.diaChi = scan.nextLine();
        do {
            System.out.print("Nhap loai nha (1: VIP, 2: THUONG): ");
            this.loaiNha = Integer.parseInt(scan.nextLine());
        } while (this.loaiNha <= 1 || this.loaiNha >= 2);
    }

    @Override
    public void xuat() {
        if(this.loaiNha == THUONG){
            System.out.print("Thuong");
        }else{
            System.out.print("VIP");
        }
        System.out.print("\tKieu nha: " + this.loaiNha);
        super.xuat();
        System.out.print("\tDia chi nha: " + this.diaChi);
    }

    @Override
    public void tinhTongThanhToan() {
        if (this.loaiNha == THUONG) {
            this.thanhtoan = this.dientich * this.dongia;
        } else {
            this.thanhtoan = this.dientich * this.dongia * 0.9f;
        }
    }
}
