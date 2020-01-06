
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        int a,b;

        System.out.print("Type a number: ");
        a = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        b = Integer.parseInt(reader.nextLine());

        if(a>b)
            System.out.print("The bigger number of the two numbers given was: "+a);

        else
            System.out.print("The bigger number of the two numbers given was: "+b);
    }
}
