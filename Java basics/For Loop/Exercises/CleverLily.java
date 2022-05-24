import java.util.Scanner;

public class SmartLiLi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceMachine = Double.parseDouble(scanner.nextLine());
        int price = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int money = 0;
        int allMoney = 0;
        int brotherCount = 0;
        for (int i = 1; i <= age; i++){
            if (i % 2 !=0){
                sum++;
            }else {
                money = money + 10;
                allMoney = allMoney + money;
                brotherCount++;
            }
        }
        int totalSum = allMoney + (sum * price);
        int result = totalSum - brotherCount;
        double diff = Math.abs(result - priceMachine);
        if (result >= priceMachine){
            System.out.printf("Yes! %.2f",diff);
        }else {
            System.out.printf("No! %.2f",diff);
        }
    }
}
