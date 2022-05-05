import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededAmountOfNylon = Integer.parseInt(scanner.nextLine());
        int neededAmountOfPaint = Integer.parseInt(scanner.nextLine());
        int amountOfPaintThinner = Integer.parseInt(scanner.nextLine());
        int hoursToFinishTheWork = Integer.parseInt(scanner.nextLine());
        double nylonPrice = 1.50;
        double paintPrice = 14.50;
        double paintThinnerPrice = 5.00;
        double pricePlasticBags = 0.40;
        double totalPriceNylon = (neededAmountOfNylon + 2) * nylonPrice;
        double totalPricePaint = (neededAmountOfPaint + (neededAmountOfPaint * 0.10)) * paintPrice;
        double totalPricePaintThinner = amountOfPaintThinner * paintThinnerPrice;
        double totalPriceForAllMaterials = totalPriceNylon + totalPricePaint + totalPricePaintThinner + pricePlasticBags;
        double priceForTheWorkers = (totalPriceForAllMaterials * 0.30) * hoursToFinishTheWork;
        double finalPrice = totalPriceForAllMaterials + priceForTheWorkers;
        System.out.println(finalPrice);
    }
}
