
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negatives = 0;

        while(true){
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0){
                break;
            }
            
            if (input < 0){
                negatives += 1;
            }

            System.out.println(input);
        }

        System.out.println("Number of negative numbers: " + negatives);
    }
}
