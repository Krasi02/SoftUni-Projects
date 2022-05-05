import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int termOfTheDeposit = Integer.parseInt(scanner.nextLine());
        double yearlyInterestRate = Double.parseDouble(scanner.nextLine());
        double interestRate = depositSum * (yearlyInterestRate / 100);
        double interestRateMonthly = interestRate / 12;
        double totalSum = depositSum + (termOfTheDeposit * interestRateMonthly);
        System.out.println(totalSum);
    }
}
