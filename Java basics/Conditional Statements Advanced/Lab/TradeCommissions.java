import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double amountOfSales = Double.parseDouble(scanner.nextLine());
        double percentage = 0;
        if (amountOfSales >= 0 && amountOfSales <= 500) {
            switch (town) {
                case "Sofia":
                    percentage += 5;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                case "Varna":
                    percentage += 4.5;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                case "Plovdiv":
                    percentage += 5.5;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (amountOfSales > 500 && amountOfSales <= 1000) {
            switch (town) {
                case "Sofia":
                    percentage += 7;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                case "Varna":
                    percentage += 7.5;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                case "Plovdiv":
                    percentage += 8;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (amountOfSales > 1000 && amountOfSales <= 10000) {
            switch (town) {
                case "Sofia":
                    percentage += 8;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                case "Varna":
                    percentage += 10;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                case "Plovdiv":
                    percentage += 12;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (amountOfSales > 10000){
            switch (town) {
                case "Sofia":
                    percentage += 12;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                case "Varna":
                    percentage += 13;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                case "Plovdiv":
                    percentage += 14.5;
                    System.out.printf("%.2f",amountOfSales * (percentage / 100));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }else {
            System.out.println("error");
        }
    }
}




