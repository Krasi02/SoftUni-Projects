import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenDishes = Integer.parseInt(scanner.nextLine());
        int fishDishes = Integer.parseInt(scanner.nextLine());
        int vegetarianDishes = Integer.parseInt(scanner.nextLine());
        double priceChickenDish = 10.35;
        double priceFishDish = 12.40;
        double priceVegetarianDish = 8.15;
        double priceForDelivery = 2.50;
        double totalPriceChickenDishes = chickenDishes * priceChickenDish;
        double totalPriceFishDishes = fishDishes * priceFishDish;
        double totalPriceVegetarianDishes = vegetarianDishes * priceVegetarianDish;
        double totalPriceDishes = totalPriceChickenDishes + totalPriceFishDishes + totalPriceVegetarianDishes;
        double priceOfDessert = totalPriceDishes * 0.20;
        double totalPriceForThePurchase = totalPriceDishes + priceOfDessert + priceForDelivery;
        System.out.println(totalPriceForThePurchase);

    }
}
