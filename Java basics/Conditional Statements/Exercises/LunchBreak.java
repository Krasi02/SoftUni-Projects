import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfSeries = scanner.nextLine();
        int episodeLength = Integer.parseInt(scanner.nextLine());
        int vacationLength = Integer.parseInt(scanner.nextLine());
        double lunchBreak = vacationLength / 8.0;
        double restTime = vacationLength / 4.0;
        double leftTime = vacationLength - (lunchBreak + restTime);
        double result = Math.abs(episodeLength - leftTime);
        if (episodeLength <= leftTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",nameOfSeries,Math.ceil(result));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameOfSeries,Math.ceil(result));
        }
    }
}
