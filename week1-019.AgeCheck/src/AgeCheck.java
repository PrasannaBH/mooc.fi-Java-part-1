
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age;
        // Accept age from user
        System.out.print("How old are you? ");
        age =  Integer.parseInt(reader.nextLine());

        // Checking conditions for possible age

        if(age >= 0 && age<= 120)
            System.out.print("Ok");
        else
            System.out.print("Impossible!");

    }
}
