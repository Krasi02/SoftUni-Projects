import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (sum < 10000) {
            String command = scanner.nextLine();
            if ("Going home".equals(command)){
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                sum += stepsToHome;
                break;
            }else {
                int steps = Integer.parseInt(command);
                sum += steps;
            }
        }
        if (sum > 10000) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", sum - 10000);
        }else {
            System.out.printf("%d more steps to reach goal.",Math.abs(sum - 10000));
        }
    }
}
