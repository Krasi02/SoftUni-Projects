import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int counter = 0;
        int poor = 0;
        double sum = 0;

        while(counter < 12){
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if(currentGrade >= 4.00){
                sum += currentGrade;
            }else{
                ++poor;
                if(poor == 2 ){
                    System.out.printf("%s has been excluded at %d grade", name, counter);
                    break;
                }
            }
            counter++;
        }if (counter == 12){
            double sum1 = sum /12;
            System.out.printf("%s graduated. Average grade: %.2f", name, sum1);
        }
    }
}
