import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int amountOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (flowerType){
            case "Roses":
                price = 5 * amountOfFlowers;
                if (amountOfFlowers > 80){
                    price = price * 0.90;
                }
                break;
            case "Dahlias":
                price = 3.80 * amountOfFlowers;
                if (amountOfFlowers > 90){
                    price = price * 0.85;
                }
                break;
            case "Tulips":
                price = 2.80 * amountOfFlowers;
                if (amountOfFlowers > 80){
                    price = price * 0.85;
                }
                break;
            case "Narcissus":
                price = 3 * amountOfFlowers;
                if (amountOfFlowers < 120){
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = 2.50 * amountOfFlowers;
                if (amountOfFlowers < 80){
                    price = price + (price * 0.20);
                }
                break;
        }if (budget > price){
            System.out.printf("Hey, you have a great garden with %d and %.2f leva left",amountOfFlowers,budget - price);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more",Math.abs(budget - price));
        }
    }
}
