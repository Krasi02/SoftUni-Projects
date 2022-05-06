import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double clothPriceForOneWorker = Double.parseDouble(scanner.nextLine());
        double priceForTheEnvironment = filmBudget * 0.10;
        double priceForTheClothes = workers * clothPriceForOneWorker;
        if(workers > 150){
            priceForTheClothes = priceForTheClothes - (priceForTheClothes * 0.10);
        }
        double totalPriceForTheFilm = priceForTheClothes + priceForTheEnvironment;
        if (filmBudget >= totalPriceForTheFilm){
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.",filmBudget - totalPriceForTheFilm);
        }else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.",Math.abs(filmBudget - totalPriceForTheFilm));
        }
    }
}
