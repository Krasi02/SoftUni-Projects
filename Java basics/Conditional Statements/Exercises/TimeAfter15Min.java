import java.util.Scanner;

public class TimeAfter15Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int afterMin = minutes + 15;
        if (afterMin > 59){
            hours +=1;
            afterMin = (minutes + 15) - 60;
        }
        if (hours > 23){
            hours = 0;
        }
        if (afterMin < 10){
            System.out.printf("%d:0%d",hours,afterMin);
        }else {
            System.out.printf("%d:%d",hours,afterMin);
        }
        }
    }

