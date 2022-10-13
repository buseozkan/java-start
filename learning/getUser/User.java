import java.util.Scanner;

public class User {
    public static void main(String[] args) {

// Create scanner object
        Scanner input = new Scanner(System.in);

// Output the prompt 
        System.out.println("Enter the name of the user:");

// Wait for the user to enter a line of text
        String name = input.nextLine();
        
// tell them what they have entered
        System.out.println("You have entered: " + name );
    }
}