
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = Integer.valueOf(scanner.nextInt());

        System.out.print("Enter second number: ");
        int number2 = Integer.valueOf(scanner.nextInt()); 

        System.out.println(Math.sqrt(number1 + number2));

    }
}
