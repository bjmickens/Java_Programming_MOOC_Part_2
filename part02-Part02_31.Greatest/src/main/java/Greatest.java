
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int biggest = number1; 
        if (number2 > biggest){
            biggest = number2;
        } 
        if (number3 > biggest) {
            biggest = number3;
        }

        return biggest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
