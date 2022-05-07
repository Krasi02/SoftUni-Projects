import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double sum = 0;
        switch (operator){
            case "+":
                sum += firstNumber + secondNumber;
                if (sum % 2 == 0){
                    System.out.printf("%.0f + %.0f = %.0f - even",firstNumber,secondNumber,sum);
                }else {
                    System.out.printf("%.0f + %.0f = %.0f - odd",firstNumber,secondNumber,sum);
                }
                break;
            case "-":
                sum += firstNumber - secondNumber;
                if (sum % 2 == 0){
                    System.out.printf("%.0f - %.0f = %.0f - even",firstNumber,secondNumber,sum);
                }else {
                    System.out.printf("%.0f - %.0f = %.0f - odd",firstNumber,secondNumber,sum);
                }
                break;
            case "*":
                sum += firstNumber * secondNumber;
                if (sum % 2 == 0){
                    System.out.printf("%.0f * %.0f = %.0f - even",firstNumber,secondNumber,sum);
                }else {
                    System.out.printf("%.0f * %.0f = %.0f - odd",firstNumber,secondNumber,sum);
                }
                break;
            case "%":
                sum += firstNumber % secondNumber;
                if (secondNumber == 0){
                    System.out.printf("Cannot divide %.0f by zero",firstNumber);
                }else {
                    System.out.printf("%.0f %% %.0f = %.0f",firstNumber,secondNumber,sum);
                }
            break;
            case "/":
                sum += firstNumber / secondNumber;
                if (secondNumber == 0){
                    System.out.printf("Cannot divide %.0f by zero",firstNumber);
                }else {
                    System.out.printf("%.0f / %.0f = %.2f",firstNumber,secondNumber,sum);
                }
                break;
        }
    }
}
