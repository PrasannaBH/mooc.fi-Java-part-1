
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        String temp;
        while(true){
            System.out.print("Type the password: ");
            temp = reader.nextLine();
            if(temp.equals(password)){
                System.out.println("Right!");
                System.out.println("The secret is: Hope you get a good JOB");
                break;

            }
            else
                System.out.println("Wrong!");

        }
    }
}
