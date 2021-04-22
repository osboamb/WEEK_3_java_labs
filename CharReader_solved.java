import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharReader_solved {
    public static void main( String[] args ) {


      try
      {
          FileReader reader = new FileReader( "alphabet.txt" );
          int endOfFile = 0;

          char c;

          while( endOfFile != -1 ){
            int read = reader.read();
            if( read == -1) {
              endOfFile = -1;
            } else {
              c = (char)read;
              System.out.print("" + c);
            }
          }
          reader.close();
      }
      catch( FileNotFoundException ex ) {
        System.out.println( "File not found" );
      }
      catch( IOException iex ) {
        System.out.println( "I/O Exception" );
      }

    }
}
