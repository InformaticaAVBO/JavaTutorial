package F_File;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class ScriviFile {

    public static void main( String[] args ) {

        String filename = "F_File/File.txt";
        File f = new File(filename);
        try {
            PrintWriter pw = new PrintWriter(f);
            for (int i = 0; i < 10; i++) {
                pw.printf( "Estrazione numero %d --> %.2f\n", i+1, Math.random()*10 );
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERRORE: " + e.getMessage());
        }

    }

}
