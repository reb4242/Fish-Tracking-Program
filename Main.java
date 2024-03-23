
/**
 * This program allows users to enter weights of the fish and look for specific data.
 *
 * @author (Rebecca)
 * @version (May.8th/23)
 */
import java.util.Scanner;
public class RebeccaFishyAssignment4{
    public static void main(String[] args){
        //declare variables
        int intNumber;
        byte bytOption = 0, bytFlag = 0;
        
        //declare scanner
        Scanner Input = new Scanner(System.in);
        
        //intro
        System.out.println("Welcome to the Fish Tracking Program!");
        System.out.println("This program is for the purposes of monitering the health of a lake.");
        
        System.out.println();
        
        //input number of fish
        System.out.println("Please enter the total number of fishes.");
        intNumber = Input.nextInt();
        
        //declare array
        int[] Weights = new int[intNumber];
        
        System.out.println();
        
        //input weights of fish
        System.out.println("Please enter the weights of the fishes in grams below.");
        //try {
            for (int i = 0; i < intNumber; i++){
                System.out.print("Weight: ");
                Weights[i] = Input.nextInt();
            }
        //} catch (Exception e){
            System.out.println("Please enter a valid integer value!");
        //}
        
        System.out.println();
        
        //show menu
        while (bytFlag == 0){
            System.out.println("Menu: ");
            System.out.println("1 - print out a list of weights of all the fish");
            System.out.println("2 - search fishes are over a certain weight");
            System.out.println("3 - exit");
            System.out.println();
            
            try {
                System.out.println("Please enter the option you would like to procede with.");
                bytOption = Input.nextByte();
            } catch (Exception e){
                System.out.println("Something went wrong! ");
            }
            
            //exucate operation
            switch (bytOption) {
                case 1: ListOfWeights(Weights, intNumber); break;
                case 2: WeightSearch(Input, Weights, intNumber); break;
                case 3: bytFlag = 1;
                System.out.println("Thank you for using the Fist Traking Program!");
                default: System.out.println("Please enter a valid integer value!");
            }
            
            System.out.println();
        }
    }
    public static void ListOfWeights(int[] Weights, int intNumber){
        //intro
        System.out.println("List of all weights: ");
        
        for (int i = 0; i < intNumber; i++){
            System.out.println(Weights[i]);
        }
    }
    public static void WeightSearch(Scanner Input, int[] Weights, int intNumber){
        //declare variable
        int intSearch = 0;
        
        //input certain weight
        System.out.println("What weight would you like to search for?");
        try {
            intSearch = Input.nextInt();
        } catch (Exception e){
            System.out.println("Please enter a valid integer value!");
        }
        
        //output all weights above intSearch
        for (int i = 0; i < intNumber; i++){
            if (Weights[i] > intSearch){
                System.out.println(Weights[i]);
            }
        }
    }
}
