
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;

public class Main {
   
 public static void main(String[] args) {
    LocalDate myDate = LocalDate.now();
    System.out.println(myDate + " unformated date");

    DateTimeFormatter myTime = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String formattedDate = myDate.format(myTime);
    System.out.println(formattedDate + " formatted date");
 
 ArrayList<String> colors = new ArrayList<String>();
 colors.add("red");
 colors.add("green");
 colors.add("blue");
 colors.add("yellow");
 colors.add("magenta");
 colors.add("cyan");
 for (int i = 0; i < 5; i++) {System.out.println(colors.get(i));}
 System.out.println(colors.size());
    }
}