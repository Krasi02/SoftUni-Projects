import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = scanner.nextDouble();
        double price = area * 7.61;
        double discount = price * 0.18;
        double result = price - discount;
        System.out.printf("The final price is: %f lv.%n"+"The discount is: %f lv.",result,discount);
    }
}
