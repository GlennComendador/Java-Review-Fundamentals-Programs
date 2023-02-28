import java.util.*;
//Used to use input function

public class BMICalculator {

    public static void main(String[] args){

        //Body Mass Index (BMI).

        //The formula is BMI = kg / m2
        //kg = weight in kilograms
        //m2 = height in meters squared

        System.out.println("BMI Calculator");

        //Add Function to Ask for User Input
        Scanner user_input = new Scanner (System.in);
        float weight = 0f;
        float height = 0f;
        //Initialize

        System.out.println("Please enter your weight in kilograms: ");
        weight = user_input.nextFloat();
        //Ask for Weight Input

        System.out.println("Please enter your height in meters: ");
        height = user_input.nextFloat();
        //Ask for Height Input

        float bmi = weight / (height*height);
        //Formula to Compute BMI

        System.out.println("Your BMI is " +bmi);
        //Output BMI Result

        //If your BMI is less than 18.5, it falls within the underweight range.
        //If your BMI is 18.5 to 24.9, it falls within the Healthy Weight range.
        //If your BMI is 25.0 to 29.9, it falls within the overweight range.
        //If your BMI is 30.0 or higher, it falls within the obese range.
    }
}
