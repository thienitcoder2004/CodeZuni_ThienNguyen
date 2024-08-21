import java.util.Random;
import java.util.Scanner;

public class ChoiOanTuXi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int PlayerWin = 0;
        int ComputerWin = 0;
        int roundsPlayed = 0;
        int maxRounds = 3;

        String[] choices = {"Kim", "Bao", "Keo"};

        while (roundsPlayed < maxRounds) {
            System.out.println("1. Kim");
            System.out.println("2. Bao");
            System.out.println("3. Keo");
            System.out.println("0. Nghi choi");

            int playerChoice = scanner.nextInt();

            if (playerChoice == 0) {
                break;
            }

            if (playerChoice < 1 || playerChoice > 3) {
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;
            System.out.println("AI chon " + choices[computerChoice - 1]);

            if (playerChoice == computerChoice) {
                System.out.println("Hai ben cung chon " + choices[playerChoice - 1] + "!");
            } else if ((playerChoice == 1 && computerChoice == 3) || 
                       (playerChoice == 2 && computerChoice == 1) || 
                       (playerChoice == 3 && computerChoice == 2)) {
                System.out.println("Nguoi choi chon " + playerChoice);
                PlayerWin++;
            } else {
                System.out.println("AI chon " + computerChoice);
                ComputerWin++;
            }

            roundsPlayed++;
        }

        System.out.println("Nguoi choi thang nhieu nhat:");
        System.out.println("Ty so la: Nguoi choi: " + PlayerWin + " ---- AI: " + ComputerWin);
        scanner.close();
    }
}
