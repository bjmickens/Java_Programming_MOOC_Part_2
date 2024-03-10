
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int numbers = 0;
        int sum = 0;

        while (true){
            input = Integer.valueOf(scanner.nextLine());

            if (input == 0){
                break;
            }

            if (input > 0){
                sum += input; 
                numbers += 1; 
            }
        }
        
        if (numbers <= 0){
            System.out.println("Cannot calculate average");
        } else {
            double average = (double) sum / numbers; 
            System.out.println(average);
        }
    }
}
