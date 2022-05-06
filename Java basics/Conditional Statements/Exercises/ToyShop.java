import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForTheTrip = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzles = Integer.parseInt(scanner.nextLine());
        int numberOfDolls = Integer.parseInt(scanner.nextLine());
        int numberOfTeddyBears = Integer.parseInt(scanner.nextLine());
        int numberOfMinions = Integer.parseInt(scanner.nextLine());
        int numberOfTrucks = Integer.parseInt(scanner.nextLine());
        double puzzlePrice = 2.60;
        double dollPrice = 3;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;
        int allToysCount = numberOfDolls + numberOfMinions + numberOfPuzzles + numberOfTrucks + numberOfTeddyBears;
        double costOfTheToys = (numberOfPuzzles * puzzlePrice) + (numberOfDolls * dollPrice)
                + (numberOfTeddyBears * teddyBearPrice) + (numberOfMinions * minionPrice) + (numberOfTrucks * truckPrice);
        if (allToysCount >= 50){
            costOfTheToys = costOfTheToys - (costOfTheToys * 0.25);
        }
        double rent =(costOfTheToys * 0.10);
        double profit = costOfTheToys - rent;
        if (priceForTheTrip <= profit){
            System.out.printf("Yes! %.2f lv left.",profit - priceForTheTrip);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(profit - priceForTheTrip));
        }
    }
}
