import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    // System.out.println("enter a number: ");
    
    // int value = sc.nextInt();
    
    // while(value != 5) {
    //       System.out.println("enter a number: ");
    //  value = sc.nextInt();
    // } instead of these 3 lines of code we do dowhile loop
int value = 5;
        do {
            System.out.println("enter a number: ");
            value = sc.nextInt();
        } while (value != 5);
        System.out.println("Got 5!");
    }
}