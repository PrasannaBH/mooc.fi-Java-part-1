import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int  a,b;
        //Accepting values from user
        System.out.print("Type the first number: ");
        a = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        b = Integer.parseInt(reader.nextLine());

        // Checking codition to find Greater Number
        if (a > b) {
            System.out.print("Greater number: " + a);
        }
        else if (a < b) {
            System.out.print("Greater number: " + b);
        }
        else {
            System.out.print("The numbers are equal!");
        }


    }
}
