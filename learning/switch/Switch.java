import java.util.Scanner;

public class Switching {
    public static void main(String[] args) {
// default always goes into the bottom!
 Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a command");
        String text = sc.nextLine();
        
        switch(text) {
            case "start":
            System.out.println("Machine started");
            break;
            case "stop":
            System.out.println("Machine stopped");
            break;
            default:
            System.out.println("Invalid command");
            
        }

    }
}