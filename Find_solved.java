import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Find {
    public static final String CASE_OPTION = "-i";
    
    public static void main( String[] args ) {
        //
        // Process command line arguments
        boolean caseSensitive = true;
        String findWord = null;
        String filePath = null;
        
        if( args.length == 2 ) {
            findWord = args[0];
            filePath = args[1];
        }
        else if( args.length == 3 ) {
            if( !args[0].equals(CASE_OPTION) ) {
                System.out.println( "Unknown option: " + args[0] );
                System.exit(1);
            }
                
            caseSensitive = false;
            findWord = args[1];
            filePath = args[2];
        }
        
        //
        // Find and print all matching lines in the file
        try {
            File fileIn = new File( filePath );
            Scanner in = new Scanner( fileIn );
            
            String line;
            while( in.hasNextLine() ) {
                line = in.nextLine();
                if( caseSensitive ) {
                    if( line.contains( findWord ) )
                        System.out.println( line );
                }
                else {
                    if( line.toUpperCase().contains( findWord.toUpperCase() ) )
                        System.out.println( line );
                }
            }
            
            in.close();
        }
        catch( FileNotFoundException ex ) {
            System.out.println( "File not found" );
        }
    }
}