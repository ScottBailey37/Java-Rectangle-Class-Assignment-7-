//<RectangleTest.java> -- Test file to test class Rectangle's capabilities.
//CSIS 212-<D03>
//<Citations if necessary> -- None

package assignment_7_csis212;
import java.util.Scanner;
/**
 *
 * @author Scott
 */
public class RectangleTest {

    /**
     * @param args the command line arguments
     */
    
    // Declare const variables
    private static final int SETLENGTH = 1;
    private static final int SETWIDTH = 2;
    private static final int EXIT = 3;
    
    // Declare object variables
    static Rectangle rect = new Rectangle();
    static Scanner input = new Scanner(System.in); 
    static String userInput=""; 
    
    public static void main(String[] args) {
        // Print student name and assignment number
        System.out.println("Scott Bailey – Assignment 7\n");        
            
        // Holds float value of user supplied string to test against
        float rectSize=0;
        
        // Print the default rectangle information and menu
        printRectangle();
        printMenu();

        // Loop until user wants to exit (number 3)
        while (true){            
            // Has user entered an integer value?
            if (input.hasNextInt()){
                
                // Yes, get it
                userInput = input.next();
                
                // See what menu choice they entered
                switch (Integer.parseInt(userInput))
                {                
                    // User wants to set rectangle length
                    case SETLENGTH:
                        System.out.print("Enter Length: ");                       
                        try{        
                            // Get a float object of the user's string 
                            rectSize = Float.valueOf(input.next());
                            
                            // Don't allow negatives, zero, or 20 and above
                            if (rectSize <= 0.0 || rectSize >=20.0){
                                throw new IllegalArgumentException();
                            }else{
                                // User entered correct value, set rectangle length
                                rect.setLength(rectSize);
                                
                                // Show rectangle info to reflect change in length
                                printRectangle();
                                printMenu();                                
                            } 
                        }catch(IllegalArgumentException e){
                            System.out.println("** Length and width must be >0.0 and <20.0. **"); 
                            System.out.print("Choice: ");
                        }
                        break;
                    // User wants to set rectangle width    
                    case SETWIDTH:
                        System.out.print("Enter Width: ");
                        try{       
                            // Get a float object of the user's string 
                            rectSize = Float.valueOf(input.next());
                            
                            // Don't allow negatives, zero, or 20 and above
                            if (rectSize <= 0.0 || rectSize >=20.0){
                                throw new IllegalArgumentException();
                            }else{
                                // User entered correct value, set rectangle width
                                rect.setWidth(rectSize);

                                // Show rectangle info to reflect change in width
                                printRectangle();
                                printMenu();
                            } 
                        }catch(IllegalArgumentException e){
                            System.out.println("** Length and width must be >0.0 and <20.0. **"); 
                            System.out.print("Choice: ");
                        }
                        break;
                    case EXIT:
                        return; // Exit loop
                    default:
                        System.out.println(("** Invalid choice. Choose 1-3. **"));
                        System.out.print("Choice: ");
                }
            }else{ // No integer value entered
                System.out.println(("** Invalid choice. Choose 1-3. **"));
                System.out.print("Choice: ");
                userInput = input.next(); // Halt loop and allow user to enter another choice
            }
        }       
    }
    
    // Prints the rectangle object's info (length, width, perimeter, and area)
    static void printRectangle(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Rectangle \tLength \tWidth \tPerimeter \tArea");
        System.out.printf("\t\t%.3f\t%.3f\t%.3f\t\t%.3f%n", rect.getLength(), rect.getWidth(), rect.Perimeter(), rect.Area());
        System.out.println("---------------------------------------------------------");        
    }
    
    // Prints the menu
    static void printMenu(){ 
        System.out.println("1. Set Length");
        System.out.println("2. Set Width");
        System.out.println("3. Exit");
        System.out.print("Choice: ");
    }
}
