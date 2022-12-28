package exercises;
import java.util.Scanner;

public class MilesDriven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double driven = input.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        Double gallonsUsed = input.nextDouble();


        Double milesPerGallon = driven / gallonsUsed;
        System.out.println("Your gas mileage is " + milesPerGallon + " miles per gallon.");
    }
}
