import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListDeal listDeal = new ListDeal();

        while (true) {
            System.out.println("Vui long chon giao dich:");
            System.out.println("1. Nhap dat hoac nha");
            System.out.println("2. Xuat dat hoac nha");
            System.out.println("3. Dem loai nha");
            System.out.println("4. Dem loai dat");
            System.out.println("5. Tinh trung binh dat");
            System.out.println("6. Thoi gian giao dich");
            System.out.println("0. Thoat");
            System.out.print("Vui long chon: ");

            int chon;
            try {
                chon = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e);
                continue;
            }

            switch (chon) {
                case 1:
                    listDeal.nhap(scan);
                    break;
                case 2:
                    listDeal.xuat();
                    break;
                case 3:
                    listDeal.demLoaiNha();
                    System.out.println("So luong nha: " + listDeal.getSoluongNha());
                    System.out.println("Tong so tien nha: " + listDeal.getTongSoTienNha());
                    break;
                case 4:
                    listDeal.demLoaiDat();
                    System.out.println("So luong dat: " + listDeal.getSoluongDatDai());
                    System.out.println("Tong so tien dat: " + listDeal.getTongSoTienDat());
                    break;
                case 5:
                    System.out.println("Trung binh gia tri dat: " + listDeal.tinhTrungBinh());
                    break;
                case 6:
                    System.out.print("Nhap thang: ");
                    int thang;
                    while (true) {
                        try {
                            thang = Integer.parseInt(scan.nextLine());
                            if (thang >= 1 && thang <= 12) break;
                            System.out.print("Vui long nhap lai");
                        } catch (NumberFormatException e) {
                            System.out.print(e);
                        }
                    }

                    System.out.print("Nhap nam: ");
                    int nam;
                    while (true) {
                        try {
                            nam = Integer.parseInt(scan.nextLine());
                            if (nam > 0) break;
                            System.out.print("Vui long nhap lai");
                        } catch (NumberFormatException e) {
                            System.out.print(e);
                        }
                    }

                    listDeal.exportDeal(thang, nam);
                    break;
                case 0:
                    scan.close();
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                    break;
            }
        }
    }
}
