
import java.util.Scanner;

public class HelloFriend {

    public static void main(String[] args) {
        // legge dalla tastiera il nome dell'utente
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Hi, what's your name: ");
        String name = tastiera.nextLine();
        System.out.println("Hello my friend " + name);
    }
}
