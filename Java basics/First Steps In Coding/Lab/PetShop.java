import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());
        double cost = dog * 2.5;
        double cost2 = cat * 4;
        double result = cost + cost2;
        System.out.print(+ result + " lv");
    }
}
