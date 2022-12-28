package exercises;
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        Double length = input.nextDouble();
        System.out.println("What is the width of your rectangle?");
        Double width = input.nextDouble();

        Double area = length * width;
        System.out.println("Your rectangle's area is " + area);

    }
}
