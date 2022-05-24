import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        int checkedBooks = 0;
        boolean Found = false;
        String input = scanner.nextLine();
        while (!input.equals("No More Books")){
            if (input.equals(bookName)){
                Found = true;
                break;
            }
            checkedBooks++;
            input = scanner.nextLine();
            }
        if (Found){
            System.out.printf("You checked %d books and found it.",checkedBooks);
        }else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", checkedBooks);
        }
        }
    }
