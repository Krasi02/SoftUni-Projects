import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPenPackages = Integer.parseInt(scanner.nextLine());
        int numberOfMarkersPackages = Integer.parseInt(scanner.nextLine());
        int litersInCleaningChemical = Integer.parseInt(scanner.nextLine());
        Double discount = Double.parseDouble(scanner.nextLine());
        double pricePenPackage = 5.80;
        double priceMarkerPackage = 7.20;
        double literChemical = 1.20;
        double totalPricePenPackages = numberOfPenPackages * pricePenPackage;
        double totalPriceMarkerPackages = numberOfMarkersPackages * priceMarkerPackage;
        double totalPriceChemical = litersInCleaningChemical * literChemical;
        double totalOfTheMaterials = totalPriceChemical + totalPriceMarkerPackages + totalPricePenPackages;
        double totalWithDiscount = totalOfTheMaterials - (totalOfTheMaterials * (discount / 100));
        System.out.println(totalWithDiscount);

    }
}
