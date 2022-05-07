import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectionsType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double premiere = 12.00;
        double normal = 7.50;
        double discount = 5.00;
        switch (projectionsType){
            case "Premiere":
                price = premiere * (rows * columns);
                System.out.printf("%.2f leva",price);
                break;
            case "Normal":
                price = normal * (rows * columns);
                System.out.printf("%.2f leva",price);
                break;
            case "Discount":
                price = discount * (rows * columns);
                System.out.printf("%.2f leva",price);
                break;
        }
    }
}
