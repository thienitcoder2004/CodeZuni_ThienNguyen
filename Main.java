import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListDeal listDeal = new ListDeal();

        System.out.println("Vui long chon giao dich");
        System.out.println("1. Nhap dat hoac nha: ");
        System.out.println("2. Xuat dat hoac nha: ");
        System.out.println("3. Dem loai nha: ");
        System.out.println("4. Dem loai dat:");
        System.out.println("5. Tinhh trung binh dat: ");
        System.out.println("6. Thoi gian giao dich:");
        System.out.println("Vui long chon: ");

        int chon = Integer.parseInt(scan.nextLine());
        switch (chon) {
            case 1:
                listDeal.nhap(scan);
                break;
            case 2:
                listDeal.xuat();
                break;
            case 3:
                listDeal.demLoaiDat();
                System.out.println("Dem loai dat: " + listDeal.getSoluongdatdai());
                System.out.println("Tong so tien dat: " + listDeal.getTongsotiendat());
            case 4:
                listDeal.demLoaiNha();
                System.out.println("Dem loai nha: " + listDeal.getSoluongnha());
                System.out.println("Tong so tien nha: " + listDeal.getTongsotiennha());
            case 5:
                System.out.println("Tinh trung binh dat: " + listDeal.tinhTrungBinh());
                break;
            case 6:
                int thang, nam;
                do {
                    System.out.println("Nhap ngay: ");
                    thang = Integer.parseInt(scan.nextLine());
                } while (thang < 1 && thang > 31);

                do {
                    System.out.println("Nhap thang: ");
                    nam = Integer.parseInt(scan.nextLine());
                } while (nam < 1);
            default:
                break;
        }
    }
}
