import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")) {
            double number = Double.parseDouble(input);
            if (number < 0){
                System.out.printf("Invalid operation!%n");
                break;
            }
                System.out.printf("Increase: %.2f%n",number);
                sum += number;
                input = scanner.nextLine();
            }
        System.out.printf("Total: %.2f%n",sum);
        }
    }
