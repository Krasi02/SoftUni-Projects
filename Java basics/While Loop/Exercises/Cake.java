import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int cakePiece = length * width;
        int getPiece = 0;
        String command = "";

        while (cakePiece >= 0) {
            command = scanner.nextLine();

            if (command.equals("STOP")) {
                System.out.printf("%d pieces are left.", cakePiece);
                break;
            } else {
                getPiece = Integer.parseInt(command);
                cakePiece = cakePiece - getPiece;
            }
        }if (!command.equals("STOP"))
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePiece));
    }
}
