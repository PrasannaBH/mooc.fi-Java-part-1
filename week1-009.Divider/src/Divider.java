
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        int a,b;
        double result;
        System.out.print("Type a number: ");
        a = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        b = Integer.parseInt(reader.nextLine());

        result = (double)a / b;

        System.out.print("Division: "+a+" / "+b+" = "+result);
    }
}