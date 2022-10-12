
import java.time.*;
import java.time.format.*;
public class Main {
   
     public static void main(String[] args) {
    LocalDate myDate = LocalDate.now();
    System.out.println(myDate);

    DateTimeFormatter myTime = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String formattedDate = myDate.format(myTime);
        System.out.println(formattedDate);
    }
}