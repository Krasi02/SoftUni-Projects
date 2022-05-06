import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (dayOfTheWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")){
                    price += 2.50;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("apple")){
                    price += 1.20;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("orange")){
                    price += 0.85;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("grapefruit")){
                    price += 1.45;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("kiwi")){
                    price += 2.70;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("pineapple")){
                    price += 5.50;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("grapes")){
                    price += 3.85;
                    System.out.printf("%.2f", amount * price);
                }else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")){
                    price += 2.70;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("apple")){
                    price += 1.25;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("orange")){
                    price += 0.90;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("grapefruit")){
                    price += 1.60;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("kiwi")){
                    price += 3.00;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("pineapple")){
                    price += 5.60;
                    System.out.printf("%.2f", amount * price);
                }else if (fruit.equals("grapes")){
                    price += 4.20;
                    System.out.printf("%.2f", amount * price);
                }else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
    }
        }
    }

