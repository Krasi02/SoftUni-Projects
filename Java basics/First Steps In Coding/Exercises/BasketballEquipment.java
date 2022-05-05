import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yearlyPriceBasketballTraining = Double.parseDouble(scanner.nextLine());
        double priceBasketballSneakers = yearlyPriceBasketballTraining - (yearlyPriceBasketballTraining * 0.40);
        double priceBasketballClothes = priceBasketballSneakers - (priceBasketballSneakers * 0.20);
        double priceBasketballBalls = priceBasketballClothes / 4;
        double priceBasketballAccessories = priceBasketballBalls / 5;
        double totalPriceForTheEquipment = priceBasketballAccessories + priceBasketballSneakers + priceBasketballClothes
         + priceBasketballBalls + yearlyPriceBasketballTraining;
        System.out.println(totalPriceForTheEquipment);
    }
}
