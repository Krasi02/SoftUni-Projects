import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());
        int countBadGrades = 0;
        double averageScore = 0;
        int numberOfProblems = 0;
        boolean isFailed = true;
        String lastProblem = "";
        while (countBadGrades < badGrades){
            String problem = scanner.nextLine();
            if ("Enough".equals(problem)){
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4){
                countBadGrades++;
            }
            averageScore += grade;
            numberOfProblems++;
            lastProblem = problem;
        }
        if (isFailed){
            System.out.printf("You need a break, %d poor grades.", badGrades);
        }else {
            System.out.printf("Average score: %.2f%n", averageScore / numberOfProblems);
            System.out.printf("Number of problems: %d%n",numberOfProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
