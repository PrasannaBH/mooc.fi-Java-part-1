
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String user,pass;
        // Accepting username and password

        System.out.print("Type your username: ");
        user = reader.nextLine();

        System.out.print("Type your password: ");
        pass = reader.nextLine();

        //Chcking String comparision using .equals()

        if(user.equals("alex") && pass.equals("mightyducks"))
            System.out.print("You are now logged into the system!");

        else if(user.equals("emily") && pass.equals("cat"))
            System.out.print("You are now logged into the system!");

        else
            System.out.print("Your username or password was invalid!");
    }
}
