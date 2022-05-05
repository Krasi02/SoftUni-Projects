import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthCentimeters = Integer.parseInt(scanner.nextLine());
        int widthCentimeters = Integer.parseInt(scanner.nextLine());
        int heightCentimeters = Integer.parseInt(scanner.nextLine());
        double percentOccupiedSpace = Double.parseDouble(scanner.nextLine());
        double volumeOfTheAquarium = lengthCentimeters * widthCentimeters * heightCentimeters;
        double volumeInLiters = volumeOfTheAquarium / 1000;
        double percentageOccupied = percentOccupiedSpace / 100;
        double neededLiters = volumeInLiters * (1 - percentageOccupied);
        System.out.println(neededLiters);
    }
}
