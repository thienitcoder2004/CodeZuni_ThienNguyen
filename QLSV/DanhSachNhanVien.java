package QLSV;

import java.util.ArrayList;
import java.util.List;

public class DanhSachNhanVien {
    private List<NhanVien> listNV = new ArrayList<>();

    public void nhapNhanVien(NhanVien nv) {
        listNV.add(nv);
    }

    public void xuatNhanVien() {
        for (NhanVien nv : listNV) {
            System.out.println(nv);
        }
    }

    public double tinhTongLuong() {
        double tongLuong = 0;
        for (NhanVien nv : listNV) {
            tongLuong += nv.getLuong();
        }
        return tongLuong;
    }

    public NhanVien xuatNhanVienLuongCaoNhat() {
        if (listNV.isEmpty()) {
            return null;
        }

        NhanVien nvLuongCaoNhat = listNV.get(0);
        for (NhanVien nv : listNV) {
            if (nv.getLuong() > nvLuongCaoNhat.getLuong()) {
                nvLuongCaoNhat = nv;
            }
        }
        return nvLuongCaoNhat;
    }
}
