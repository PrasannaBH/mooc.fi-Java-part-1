import java.lang.Math.*;
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        int rad;
        double Circumference;
        System.out.print("Type the radius: ");
        rad = Integer.parseInt(reader.nextLine());

        Circumference = 2 * rad * Math.PI;

        System.out.print("Circumference of the circle: "+Circumference);
    }
}
