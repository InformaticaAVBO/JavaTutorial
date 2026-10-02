package F_File;
/*
* Programma con esempi di scrittura su file di testo
*/

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFormattedNumbers {

    public static void main( String[] args ) {
        File f = new File("F_File/WriteFormattedNumers.txt");
        try {
            PrintWriter scrittore = new PrintWriter( f );
            for (int i=0; i<10; i++ ) {
                scrittore.printf( "%05.2f\t%05.2f\n", Math.random()*100, Math.random()*100 );
            }
            scrittore.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
