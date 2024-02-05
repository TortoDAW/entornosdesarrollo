import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args){
        System.out.println("Hola Mundo");

        String dateTime = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a")
        .format(LocalDateTime.now());

        System.out.println(dateTime);
    }
}
