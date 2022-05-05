import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allPagesInTheBook = Integer.parseInt(scanner.nextLine());
        int pagesReadPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDaysToReadTheBook = Integer.parseInt(scanner.nextLine());
        int totalTimeToReadTheBook = allPagesInTheBook / pagesReadPerHour;
        int requiredHoursPerDay = totalTimeToReadTheBook / numberOfDaysToReadTheBook;
        System.out.println(requiredHoursPerDay);
    }
}
