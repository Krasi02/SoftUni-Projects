import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingScore = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;
        if (startingScore <= 100) {
            bonusPoints += 5;
        }else if (startingScore > 100 & startingScore <= 1000){
                bonusPoints = startingScore * 0.20;
        }else if (startingScore > 1000){
            bonusPoints = startingScore * 0.10;
        }
        if (startingScore % 2 == 0){
            bonusPoints += 1;
        }else if (startingScore % 5 == 0){
            bonusPoints += 2;
        }
        System.out.printf("%.1f",bonusPoints);
        System.out.printf("%n%.1f",bonusPoints + startingScore);
    }
}
