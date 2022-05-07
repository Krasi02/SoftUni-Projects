import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayStaying = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();
        double price = 0;
        switch (roomType){
            case "room for one person":
               price = (dayStaying - 1) * 18;
               break;
            case "apartment":
                price = 25;
                if (dayStaying < 10){
                    price = (dayStaying - 1) * (price * 0.70);
                }else if (dayStaying > 15){
                    price = (dayStaying - 1) * (price * 0.50);
                }else {
                    price = (dayStaying - 1) * (price * 0.65);
                }
                break;
            case "president apartment":
                price = 35;
                if (dayStaying < 10){
                    price = (dayStaying - 1) * (price * 0.90);
                }else if (dayStaying > 15){
                    price = (dayStaying - 1) * (price * 0.80);
                }else {
                    price = (dayStaying - 1) * (price * 0.85);
                }
                break;
        }if (rating.equals("positive")){
            price = price + (price * 0.25);
            System.out.printf("%.2f",price);
        }else {
            price = price * 0.90;
            System.out.printf("%.2f",price);
        }
    }
}

