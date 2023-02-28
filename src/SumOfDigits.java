import java.util.*;

public class SumOfDigits {

    public static void main(String[] args){

        //Variable Initialization
        int input;
        int sum = 0;

        //User Input Initialization
        Scanner user_input = new Scanner(System.in);

        //User Input
        System.out.print("Enter a Number: ");
        input = user_input.nextInt();

        //Sum of Digits Operation
        while (input != 0){
            sum = sum + input % 10;
            input = input / 10;
        }

        //Output the Sum of Digits
        System.out.println("The Sum of Digits is " +sum);
    }
}
