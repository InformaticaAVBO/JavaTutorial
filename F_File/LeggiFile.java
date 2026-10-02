package F_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeggiFile {

    public static void main( String[] args ) {

        String filename = "F_File/File.txt";
        try {
            Scanner sc = new Scanner( new File(filename) );
            while ( sc.hasNext() ) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERRORE: " + e.getMessage());
        }

    }

}
