import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int openTabs = Integer.parseInt(scanner.nextLine());
        int monthlySalary = Integer.parseInt(scanner.nextLine());
        int penaltyPrice = 0;
        for (int i = 0; i < openTabs; i++) {
            String openedSites = scanner.nextLine();
            switch (openedSites) {
                case "Facebook":
                    penaltyPrice += 150;
                    break;
                case "Instagram":
                    penaltyPrice += 100;
                    break;
                case "Reddit":
                    penaltyPrice += 50;
                    break;
            }
        }if (monthlySalary > penaltyPrice){
            System.out.println(monthlySalary - penaltyPrice);
        }else {
            System.out.println("You have lost your salary.");
        }
    }
}
