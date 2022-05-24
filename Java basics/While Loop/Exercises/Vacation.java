import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VacationCost = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int spendingCounter = 0;
        while (availableMoney < VacationCost && spendingCounter < 5){
            String command = scanner.nextLine();
            double Money = Double.parseDouble(scanner.nextLine());
            daysCounter++;
            if ("save".equals(command)){
                availableMoney += Money;
                spendingCounter = 0;
            }else if ("spend".equals(command)){
                availableMoney -= Money;
                spendingCounter += 1;
                if (availableMoney < 0){
                    availableMoney = 0;
                }
            }
        }if (spendingCounter == 5){
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }else if (availableMoney >= VacationCost){
            System.out.printf("You saved the money for %d days.",daysCounter);
        }

    }
}
