package QLSV;

public class NhanVien {
    private String ten;
    private int maNV;
    private int ngaySinh;
    private String diaChi;
    private double luong;
    private double heSoLuong;
    private static final double LUONG_CO_BAN = 5000000; // Lương cơ bản

    // Constructor mặc định
    public NhanVien() {
        this.ten = "";
        this.maNV = 0;
        this.ngaySinh = 0;
        this.diaChi = "";
        this.heSoLuong = 1.0; // Mặc định hệ số lương là 1.0
    }

    // Constructor với tên nhân viên
    public NhanVien(String ten) {
        this.ten = ten;
        this.maNV = 0;
        this.ngaySinh = 0;
        this.diaChi = "";
        this.heSoLuong = 1.0;
    }

    // Constructor với tên và mã nhân viên
    public NhanVien(String ten, int maNV) {
        this.ten = ten;
        this.maNV = maNV;
        this.ngaySinh = 0;
        this.diaChi = "";
        this.heSoLuong = 1.0;
    }

    // Constructor với tên, mã nhân viên và ngày sinh
    public NhanVien(String ten, int maNV, int ngaySinh) {
        this.ten = ten;
        this.maNV = maNV;
        this.ngaySinh = ngaySinh;
        this.diaChi = "";
        this.heSoLuong = 1.0;
    }

    // Constructor với thông tin đầy đủ
    public NhanVien(String ten, int maNV, int ngaySinh, String diaChi, double heSoLuong) {
        this.ten = ten;
        this.maNV = maNV;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.heSoLuong = heSoLuong;
    }

    // Getter và Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        if (heSoLuong > 0) {
            this.heSoLuong = heSoLuong;
        }
    }

    public double getLuong() {
        return heSoLuong * LUONG_CO_BAN;
    }

    public static double getLuongCoBan() {
        return LUONG_CO_BAN;
    }

    @Override
    public String toString() {
        return  "Nhan vien = " + ten +
                "; Ma so = " + maNV +
                "; Ngay Sinh = " + ngaySinh +
                "; DiaChi = " + diaChi +
                "; Luong = " + getLuong();
    }
}
