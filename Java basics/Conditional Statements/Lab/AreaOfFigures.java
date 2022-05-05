import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String form = scanner.nextLine();
        if (form.equals("square")){
            double sideLength = Double.parseDouble(scanner.nextLine());
            double faceOfSquare = sideLength * sideLength;
            System.out.println(faceOfSquare);
        }else if (form.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            double faceOfRectangle = sideA * sideB;
            System.out.println(faceOfRectangle);
        }else if (form.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            double faceOfCircle = (radius * radius)  * Math.PI;
            System.out.println(faceOfCircle);
        }else if (form.equals("triangle")){
            double sideLength = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double faceOfTriangle = (sideLength * height) / 2;
            System.out.println(faceOfTriangle);
        }
    }
}
