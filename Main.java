
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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
//  for (int i = 0; i < 5; i++) {System.out.println(colors.get(i));}
//  System.out.println(colors.size());
//  System.out.println(colors.get(3));

Iterator<String> it = colors.iterator();
    // Print the first item

System.out.println(it.next());
 HashMap<String, String> livedCities = new HashMap<String, String>();

livedCities.put("Sheffield", "England");
livedCities.put("Hengelo", "Netherlands");
livedCities.put("Famagusta", "Cyprus");
livedCities.put("London","England");

System.out.println(livedCities);



    }
}