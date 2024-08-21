public class FindN {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;

        while (sum <= 100000) {
            sum += n;
            n++;
        }

        // Mong anh/chị coi giúp em xem là em code sai chỗ nào mà nó không ra đúng yêu cầu 141 ạ
        System.out.println("So nho nhat thoa dieu kien la: " + (n - 1));
    }
}