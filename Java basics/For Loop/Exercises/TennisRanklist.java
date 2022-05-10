import java.util.Scanner;

public class TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int participatedTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        double points = 0;
        double wonTournaments = 0;
        for (int i = 0; i < participatedTournaments; i++) {
            String tournamentStages = scanner.nextLine();
            switch (tournamentStages){
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
                case "W":
                    points += 2000;
                    wonTournaments ++;
                    break;
            }
        } double averageWonPoints = points / participatedTournaments;
        double percentWonTournaments = (wonTournaments / participatedTournaments) * 100;
        System.out.printf("Final points: %.0f\n",points + startingPoints);
        System.out.printf("Average points: %.0f\n",Math.floor(averageWonPoints));
        System.out.printf("%.2f%%",percentWonTournaments);
    }
}
