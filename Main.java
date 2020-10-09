import java.util.Scanner;

/**
 *This program sorts the users two number in acsending order
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user for the two numbers
    System.out.println("Please enter the 2 values for the array");

    //creaets array for the two numbers
    int usersNumbers[] = new int[2];
    //for loop to allow user to input
    for(int i = 0; i < usersNumbers.length; i++){
      usersNumbers[i] = input.nextInt();
    }
    
    //variable to compare too
    int comparer = 0;

    //for loop to sort numbers
    for (int i = 0; i < usersNumbers.length; i++){
      //loops to swap numbers if neccesary
      for (int j = 0; i < usersNumbers.length; i++){
        if (usersNumbers[i] > usersNumbers[j]){
          //makes comparer equal to larger number
          comparer = usersNumbers[i];
          //makes larger number equal to smalles number
          usersNumbers[i] = usersNumbers[j];
          //makes the smallest number the comparer thus being the largest
          usersNumbers[j] = comparer;
        }
        
      }
      
    }
      //for loop that prints the previous numbers in correct order
    for (int i = 0; i < usersNumbers.length - 1; i++){
      //prints numbers in acsending order
      System.out.println("Your numbers in ascending order are " + (usersNumbers[usersNumbers.length - 1]) + " and " + usersNumbers[i]);
      }
      

  }
}
