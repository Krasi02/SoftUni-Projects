import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double totalPoints = count;
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            Double scale = Double.parseDouble(scanner.nextLine());
            double currentPoints = (name.length() * scale) / 2;
            if (totalPoints < 1250){
                totalPoints = totalPoints + currentPoints;
            }
            }
            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
            } else {
                double diff = 1250.5 - totalPoints;
                System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
            }
        }

    }


