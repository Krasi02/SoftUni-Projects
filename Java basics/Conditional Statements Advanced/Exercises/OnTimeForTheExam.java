import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());
        int examTimeInMin = examHour * 60 + examMinute;
        int arrivalTimeInMin = arrivalHour * 60 + arrivalMinute;
        int diff = Math.abs(examTimeInMin - arrivalTimeInMin);
            System.out.println("Late");
            if (examTimeInMin < arrivalTimeInMin){
                if (diff >= 60) {
                    int hour = diff / 60;
                    int minute = diff % 60;
                    System.out.printf("%d:%02d hours after the start", hour, minute);
                } else {
                    System.out.printf("%d minutes after the start", diff);
                }
        }else if (examTimeInMin == arrivalTimeInMin || diff <= 30){
                System.out.println("On time");
                if (diff >= 1 && diff <= 30){
                    System.out.printf("%d minutes before the start",diff);
                }
            }else {
                System.out.println("Early");
                if (diff >= 60){
                    int hour = diff / 60;
                    int minute = diff % 60;
                    System.out.printf("%d:%02d hours before the start",hour,minute);
                }else {
                    System.out.printf("%d minutes before the start",diff);
                }
            }
    }
}
