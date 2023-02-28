import java.util.*;

public class DisplayPrimeNumber {

    public static void main(String[] args){

        //Writing a Java Program to Display Prime Numbers from 1 to N

        System.out.println("PRIME NUMBER IDENTIFIER");

        //User Input Initialization
        Scanner user_input = new Scanner(System.in);

        //Initialization
        String primeNumbers = "";
        int num = 0;

        //User Input
        System.out.print("Enter a Number: ");
        int n = user_input.nextInt();

        //Prime Number Verifier
        for (int i = 1; i <= n; i++){
            //Loop For How Many Numbers Will be Checked if Prime
            int counter = 0;

            for(num = i; num >= 1; num--){

                if(i % num == 0){
                    counter++;
                }
            }

            if (counter == 2){
                //If Counter Reaches to ONLY 2, It means it only has Two Factors
                // Appending the prime Numbers to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.print("Prime Numbers from 1 to " +n + " are: " +primeNumbers);
    }
}