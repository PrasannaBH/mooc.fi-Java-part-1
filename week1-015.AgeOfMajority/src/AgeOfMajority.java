
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        int age;

        // Accepting age from user
        System.out.print("How old are you? ");
        age = Integer.parseInt(reader.nextLine());

        // Checking condition if use is 18 or above
        if (age >= 18)
            System.out.print("You have reached the age of majority!");
        else
            System.out.print("You have not reached the age of majority yet!");
    }
}
