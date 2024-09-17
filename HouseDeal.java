import java.util.Scanner;

public class HouseDeal extends RealEstate{
    protected int VIP =  1;
    protected int THUONG = 2;

    protected  String DiaChi;
    protected int loainha;

    public HouseDeal(){
        super();
        this.DiaChi = "";
        this.loainha = 0;
    }

    public HouseDeal(String maGiaoDich, int ngay, int thang, int nam, float dongia, float dientich, float thanhtoan, String DiaChi, int loainha){
        super(maGiaoDich, ngay, thang, nam, dongia, dientich, thanhtoan);
        this.DiaChi = DiaChi;
        this.loainha = loainha;
    }

    public String getDiaChi() {
        return DiaChi;
    }
    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
    public int getLoainha() {
        return loainha;
    }
    public void setLoainha(int loainha) {
        this.loainha = loainha;
    }

    @Override
    public void nhap(Scanner scan){
        super.nhap(scan);
        System.out.print("Nhap dia chi nha: ");
        this.DiaChi = scan.nextLine();
        do {
            System.out.print("Nhap loai nha");
            this.loainha = Integer.parseInt(scan.nextLine());
        } while (this.loainha < 1|| this.loainha > 3);
    }

    @Override
    public void xuat(){
        System.out.print("Kieu nha: \t" + this.loainha);
        if(this.loainha == THUONG){
            System.out.print("Thuong\t");
        }else{
            System.out.print("VIP\t");
        }
        super.xuat();
        System.out.print("\t\tDia chi nha: " + this.DiaChi);
    }

    @Override
    public void tinhTongThanhToan(){
        if(this.loainha == 1){
            this.thanhtoan = this.dientich * this.dongia;
        }else{
            this.thanhtoan = this.dientich * this.dongia * 0.9f;
        }
    }
}
