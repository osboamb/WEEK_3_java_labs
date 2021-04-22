import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderTest {

    public static void main( String[] args ) {

        try {

            FileReader reader = new FileReader( "test.txt" );
            BufferedReader in = new BufferedReader( reader );

            int totalChars = 0;
            int noLines = 0;
            int smallestNoChars = 99999;
            int largestNoChars = 0;
            String s;
            while ( (s = in.readLine()) != null ) {
                StringBuffer line = new StringBuffer(s);
                if( line.length() < smallestNoChars ) {
                  smallestNoChars = line.length();
                }
                if( line.length() > largestNoChars ) {
                  largestNoChars = line.length();
                }
                noLines++;
                totalChars += line.length();
            }
            System.out.println( "Smallest number of characters on a line: " + smallestNoChars );
            System.out.println( "Largest number of characters on a line: " + largestNoChars );
            System.out.println( "Average characters on a line: " + (totalChars/noLines) );

            in.close();
        }
        catch ( FileNotFoundException e ) { // may be throw by new FileReader(...)
            System.out.println( e );
        }
        catch ( IOException e ) {  // may be thrown by readLine()
            System.out.println( e );
        }
    }

}
