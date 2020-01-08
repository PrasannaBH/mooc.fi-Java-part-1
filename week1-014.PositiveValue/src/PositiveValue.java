
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:

        int a;

        // Accepting Number from user

        System.out.print("Type a number: ");
        a = Integer.parseInt(reader.nextLine());

        // Checking if number is positive

        if (a > 0)
            System.out.print("The number is positive.");

        else
            System.out.print("The number is not positive.");

    }
}
