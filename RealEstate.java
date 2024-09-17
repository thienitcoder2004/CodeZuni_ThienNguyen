import java.util.Scanner;

public class RealEstate {
    protected String maGiaoDich;
    protected int ngay;
    protected int thang;
    protected int nam;
    protected float dongia;
    protected float dientich;
    protected float thanhtoan;

    public RealEstate() {
        this.ngay = 0;
        this.thang = 0;
        this.nam = 0;
        this.dientich = 0;
        this.thanhtoan = 0;
    }

    public RealEstate(String maGiaoDich, int ngay, int thang, int nam, float dongia, float dientich, float thanhtoan) {
        this.maGiaoDich = maGiaoDich;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.dongia = dongia;
        this.thanhtoan = thanhtoan;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public float getDientich() {
        return dientich;
    }

    public void setDientich(float dientich) {
        this.dientich = dientich;
    }

    public float getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(float thanhtoan) {
        this.thanhtoan = thanhtoan;
    }

    public void nhap(Scanner scan) {
        System.out.print("Nhap ma giao dich: ");
        this.maGiaoDich = scan.nextLine();
        do {
            System.out.print("Nhap ngay: ");
            this.ngay = Integer.parseInt(scan.nextLine());
        } while (this.ngay < 1 || this.ngay > 31);

        do {
            System.out.print("Nhap thang: ");
            this.thang = Integer.parseInt(scan.nextLine());
        } while (this.thang < 1 || this.thang > 12);

        do {
            System.out.print("Nhap nam: ");
            this.nam = Integer.parseInt(scan.nextLine());
        } while (this.nam < 1);

        do {
            System.out.print("Nhap dien tich: ");
            this.dientich = Integer.parseInt(scan.nextLine());
        } while (this.dientich < 1);

        do {
            System.out.print("Nhap so tien: ");
            this.thanhtoan = Integer.parseInt(scan.nextLine());
        } while (this.thanhtoan < 1);
    }

    public void xuat() {
        System.out.print("Ma giao dich: " + this.maGiaoDich
                + "\tNgay: " + this.ngay
                + "\tThang: " + this.thang
                + "\tNam: " + this.nam
                + "\tDien tich: " + this.dientich
                + "\tSo tien: " + this.thanhtoan);
    }

    public void tinhTongThanhToan() {
        this.thanhtoan = 0;
    }
}