import java.text.DecimalFormat;
import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;
        switch (month){
            case "May":
            case "October":
                studioPrice = nights * 50;   // studioPricePerNight - 50
                apartmentPrice = nights * 65; // ApartmentPricePerNight - 65
                if (nights > 7 && nights <= 14){
                    studioPrice = nights * (50 * 0.95);
                    apartmentPrice = nights * 65;
                }else if (nights > 14){
                    studioPrice = nights * (50 * 0.70);
                    apartmentPrice = nights * (65 * 0.90);
                }
                break;
            case "June":
            case "September":
                apartmentPrice = nights * 68.70; // studioPricePerNight - 68.70 
                studioPrice = nights * 75.20;    // ApartmentPricePerNight - 75.20
                if (nights > 14) {
                    studioPrice = nights * (75.20 * 0.80); 
                    apartmentPrice = nights * (68.70 * 0.90); 
                }
                break;
            case "July":
            case "August":
                studioPrice = nights * 76; // studioPrice - 76
                apartmentPrice = nights * 77; // ApartmentPricePerNight - 77
                if (nights > 14){
                    apartmentPrice = nights * (77 * 0.90);
                    studioPrice = nights * 76;
                    break;
                }
        }
        System.out.printf("Apartment: %.2f lv.\n",apartmentPrice);
        System.out.printf("Studio: %.2f lv.",studioPrice);
        }
    }

