
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a;
        // Accepting points from user
        System.out.print("Type the points [0-60]: ");
        a = Integer.parseInt(reader.nextLine());

        // Checking conditions to ive Grade
         if (a >= 0 && a < 30)
             System.out.print("Grade: failed");
         else if (a >= 30 && a < 35)
             System.out.print("Grade: 1");
         else if (a >= 35 && a < 40)
             System.out.print("Grade: 2");
         else if (a >= 40 && a < 45)
             System.out.print("Grade: 3");
         else if (a >= 45 && a < 50)
             System.out.print("Grade: 4");
         else if (a >= 50 && a < 60)
             System.out.print("Grade: 5");

    }
}
