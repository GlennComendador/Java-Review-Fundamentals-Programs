import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args){

        //Scanner Initialization
        Scanner userString = new Scanner(System.in);
        Scanner user_option = new Scanner(System.in);

        //Variable Initialization
        int option;
        char[] tempArray;



        //User Input
        System.out.print("Enter words, spaces, or numbers: ");
        String user_input = userString.nextLine();


        System.out.println("Press 1 to Know the Length of the Entered Texts.");
        System.out.println("Press 2 to Reverse the Contents of the Entered Texts.");
        option = user_option.nextInt();

        switch(option){

            case 1:

                //Initialization
                tempArray = user_input.toCharArray();
                int letters = 0, numbers = 0, spaces = 0, others = 0;

                //Checking of Numbers
                for(int i = 0; i < user_input.length(); i++){

                    if(Character.isDigit(tempArray[i])){
                        numbers++;
                    }
                    else if(Character.isAlphabetic(tempArray[i])){
                        letters++;
                    }
                    else if(Character.isSpaceChar(tempArray[i])){
                        spaces++;
                    }
                    else {
                        others++;
                    }

                }


                System.out.println("Letters: " + letters);
                System.out.println("Numbers: " + numbers);
                System.out.println("Spaces: " + spaces);
                System.out.println("Others: " + others);

                break;


            case 2:

                //Initialization
                String reversedWord = "";
                tempArray = user_input.toCharArray();

                //Algorithm for Reversing the Array Contents and putting it into String
                for(int i = tempArray.length - 1; i >= 0; i--){
                    reversedWord = reversedWord + tempArray[i];
                }

                //Printing the Results
                System.out.println("Reversed Contents: " +reversedWord);
                break;


            default:
                System.out.println("You may only enter 1 or 2");
                break;
        }

    }

}
