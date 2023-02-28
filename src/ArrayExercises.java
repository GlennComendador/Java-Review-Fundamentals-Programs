import java.util.Scanner;

public class ArrayExercises {

    public static void main(String[] args){

        //Writing Java Program that allows user to Enter 10 Numbers
        //1. The 10 Numbers will be added with each other for Sum
        //2. The 10 Numbers will be averaged
        //3. A Number will be removed from the Inputted 10 Numbers
        //4. Insert an Element in an Array
        //5. Minimum and Maximum Values of Element in an Array
        //6. Reverse contents inside an Array
        //7. Find Duplicates in the Array
        //8. Rotate Array Contents Clockwise

        //Scanner Initialization
        Scanner user_input = new Scanner(System.in);
        Scanner user_option = new Scanner(System.in);
        Scanner numberRemoval = new Scanner(System.in);
        Scanner numberInsert = new Scanner(System.in);
        Scanner index = new Scanner(System.in);
        Scanner rotate = new Scanner(System.in);

        //Array Initialization
        int[] arrayNumbers = new int[10];
        int[] increasedArray = new int[arrayNumbers.length + 1];
        int[] tempArray = new int[10];

        //Variable Initialization
        int sum = 0;
        int option;



        //Asking for Input
        System.out.print("Enter 10 Numbers: ");
        for(int i = 0; i < arrayNumbers.length; i++){
            arrayNumbers[i] = user_input.nextInt();
        }



        //User Option
        System.out.println("Press 1 for Sum of Numbers");
        System.out.println("Press 2 for Average of Numbers");
        System.out.println("Press 3 To Remove a Number");
        System.out.println("Press 4 To Insert an Element into the Array");
        System.out.println("Press 5 to Check the Smallest and Biggest Numbers");
        System.out.println("Press 6 to Reverse the Order of the Numbers");
        System.out.println("Press 7 to Find Duplicates");
        System.out.println("Press 8 to Rotate the Array Contents Clockwise");
        option = user_option.nextInt();



        switch(option){

            case 1:

                //Algorithm for Sum of Array Elements
                for(int i: arrayNumbers){
                    sum = sum + arrayNumbers[i];
                }

                //Printing of Answer
                System.out.println("The Sum of the 10 Numbers is " + sum);
                break;


            case 2:

                //Variable Initialization
                double average;

                //Algorithm for Sum of Array Elements
                for(int i: arrayNumbers){
                    sum = sum + arrayNumbers[i];
                }

                //Average Computation
                average = ((double) sum) / 10;

                //Printing of Answer
                System.out.println("The Average of the 10 Numbers is " + average);
                break;


            case 3:

                //Variable Initialization
                int remove, oldIndex;

                //Ask for the Index of the Number to be Removed
                System.out.print("Enter the index of the number to be removed: ");
                remove = numberRemoval.nextInt();

                //Algorithm for Removing an Element in the Array

                //Index Double-Checking
                if(remove > arrayNumbers.length){
                    System.out.println("No Numbers on that index");
                }
                else if (remove < 0){
                    System.out.println("Positive Numbers Only");
                }
                else{
                    //Removal of Element in an Array
                    for(oldIndex = remove; oldIndex < arrayNumbers.length - 1; oldIndex++){
                        arrayNumbers[oldIndex] = arrayNumbers[oldIndex + 1];
                    }

                    //Display New Array Contents
                    System.out.println("New Array Contents: ");

                    for(int i = 0; i < arrayNumbers.length - 1; i++){
                        //If not length - 1, it will still show duplicate of last number
                        //Only show the new array length and its contents
                        System.out.print(arrayNumbers[i]+" ");
                    }

                }
                break;


            case 4:

                //Variable Initialization
                int insert, indexToInsert;

                //Ask for Number to be Inserted
                System.out.println("Enter Number to be Inserted: ");
                insert = numberInsert.nextInt();

                //Ask where the Number should be inserted
                System.out.println("Enter What Index it should be Inserted: ");
                indexToInsert = index.nextInt();

                //Index Double-Checking
                if(indexToInsert > increasedArray.length || indexToInsert < 0){
                    System.out.println("Index Out of Bounds");
                }
                else {

                    //Algorithm for Inserting New Content to Array

                    //Copy Array Contents to Larger Temp Array
                    for(int i = 0; i < arrayNumbers.length; i++){
                        increasedArray[i] = arrayNumbers[i];
                    }

                    //Moving Current Array Elements to the Next Index
                    //Start from the End of the Array, move elements to the right first
                    //so that the index of the element to be inserted will be freed
                    for(oldIndex = increasedArray.length - 1; oldIndex > indexToInsert ; oldIndex--){
                        increasedArray[oldIndex] = increasedArray[oldIndex - 1];
                    }

                    //Insert New Content of Array
                    increasedArray[indexToInsert] = insert;

                    //Display New Array Contents
                    System.out.println("New Array Contents: ");
                    for(int j = 0; j < increasedArray.length; j++){
                        System.out.print(increasedArray[j]+" ");
                    }

                }
                break;


            case 5:

                //Variable Initialization for Comparison
                int minNumber = arrayNumbers[0];
                int maxNumber = arrayNumbers[0];

                //Algorithm for Find the Minimum Value
                for(int i = 1; i < arrayNumbers.length; i++){

                    if(arrayNumbers[i] < minNumber){
                        minNumber = arrayNumbers[i];
                    }

                }

                //Algorithm for Find the Maximum Value
                for(int j = 1; j < arrayNumbers.length; j++){

                    if(arrayNumbers[j] > maxNumber){
                        maxNumber = arrayNumbers[j];
                    }
                }

                //Output the Answer
                System.out.println("The Smallest Number is " + minNumber + " and the Largest Number is " + maxNumber);
                break;


            case 6:

                //Algorithm for Reversing the Array Contents
                for(int i = 0; i < arrayNumbers.length; i++){
                    tempArray[arrayNumbers.length - i - 1] = arrayNumbers[i];
                }

                //Display Reversed Array Contents
                System.out.println("Reversed Array Contents: ");
                for(int j = 0; j < tempArray.length; j++){
                    System.out.print(tempArray[j]+" ");
                }
                break;


            case 7:

                //Algorithm for Finding Duplicates
                for(int i = 0; i < arrayNumbers.length ; i++){

                    for(int j = i + 1; j < arrayNumbers.length; j++){

                        //Compare Current Element with Element next to it
                        if(arrayNumbers[i] == arrayNumbers[j]){
                            //Display Duplicate Array Contents
                            System.out.println(arrayNumbers[j] + " is a duplicate.");
                        }

                    }

                }

                break;


            case 8:

                //Variable Initialization
                int temp;
                int rotationNumber;

                System.out.print("Number of Rotations: ");
                rotationNumber = rotate.nextInt();


                //Algorithm for Rotating Array Contents Clockwise
                do{

                    temp= arrayNumbers[arrayNumbers.length - 1];

                    for(int i = arrayNumbers.length - 1; i > 0  ; i--){
                        arrayNumbers[i] = arrayNumbers[i - 1];
                    }

                    arrayNumbers[0] = temp;
                    rotationNumber--;

                } while (rotationNumber > 0);


                //Display Reversed Array Contents
                System.out.println("Clockwise Rotated Array Contents: ");
                for(int j = 0; j < arrayNumbers.length; j++){
                    System.out.print(arrayNumbers[j]+" ");
                }

                break;


            default:

                System.out.println("You may only enter numbers between 1 to 8");
                break;

        }
    }

}