import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FivesWriter {
    public static void main( String[] args ) {

      try {
        FileWriter writer = new FileWriter( "times5.txt" );
        PrintWriter out = new PrintWriter( writer );
        for( int i = 5; i <= 60; i += 5 ){
          out.println( i );
        }
        out.close();
      }
      catch ( IOException e ) {
        System.out.println( e );
      }

    }
}
