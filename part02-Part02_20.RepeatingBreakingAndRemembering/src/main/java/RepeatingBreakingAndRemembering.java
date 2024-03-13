
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int number = 0;
        int sum = 0;
        int total = 0;
        double average = 0;
        int even = 0; 
        int odd = 0;
        
        while (number != -1){
            number = Integer.valueOf(scanner.nextLine());
            if (number != -1){
                sum += number;
                total++;
                average = (double) sum / total;
                if (number % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + total);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
