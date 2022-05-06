import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PeterBudget = Double.parseDouble(scanner.nextLine());
        int numberOfGraphicCards = Integer.parseInt(scanner.nextLine());
        int numberOfProcessors = Integer.parseInt(scanner.nextLine());
        int numberOfRam = Integer.parseInt(scanner.nextLine());
        double costOfTheGraphicCard = numberOfGraphicCards * 250;
        double costOfTheProcessor = numberOfProcessors * ((costOfTheGraphicCard* 0.35));
        double costOfTheRam = numberOfRam * ((costOfTheGraphicCard * 0.10));
        double totalSum = costOfTheGraphicCard + costOfTheRam + costOfTheProcessor;
        if (numberOfGraphicCards > numberOfProcessors){
            totalSum = totalSum * 0.85;
        }
        if (PeterBudget >= totalSum){
            System.out.printf("You have %.2f leva left!",PeterBudget - totalSum);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(PeterBudget - totalSum));
        }
    }
}
