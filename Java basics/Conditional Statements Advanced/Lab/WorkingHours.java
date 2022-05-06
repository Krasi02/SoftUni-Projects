import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nightHour = Integer.parseInt(scanner.nextLine());
        String dayOfTheWeek = scanner.nextLine();
        if (nightHour >= 10 && nightHour <= 18){
            switch (dayOfTheWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                default:
                    System.out.println("closed");
                    break;
            }
        }else {
            System.out.println("closed");
        }
    }
}
