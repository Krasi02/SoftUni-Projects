import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupBudget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfFishers = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (season) {
            case "Spring":
                price += 3000;
                if (numberOfFishers % 2 == 0) {
                    price = price * 0.95;
                }
                break;
            case "Summer":
            case "Autumn":
                price += 4200;
                if (numberOfFishers % 2 == 0 && season.equals("Summer")) {
                    price = price * 0.95;
                }
                break;
            case "Winter":
                price += 2600;
                if (numberOfFishers % 2 == 0){
                    price = price * 0.95;
                }
                break;
        }if (numberOfFishers <= 6){
            price = price * 0.90;
        }else if (numberOfFishers > 7 && numberOfFishers <= 11){
            price = price * 0.85;
        }else {
            price = price * 0.75;
        }
        if (groupBudget >= price){
            System.out.printf("Yes! You have %.2f leva left.",groupBudget - price);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(groupBudget - price));
        }
    }
}
