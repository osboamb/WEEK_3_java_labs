
import java.util.Scanner;
import java.util.Vector;

public class ReverseInputs {
	public static void main( String args[]){

		Vector <String> stor = new Vector <String>();

		Scanner in = new Scanner(System.in);
		System.out.print("PLEASE ENTER TEXT. ENTER A BLANK LINE WHEN YOU ARE FINISHED:  " + "\n");
		String line = in.nextLine(); // don;t need this if you use in.hasNextLine() instead in the while loop below
		//int linelength= lines.length();

		while(line.length()  != 0 ){
			stor.add( new StringBuffer(line).reverse().toString() );
			line = in.nextLine();
		}

		System.out.print("YOUR REVERSED INPUT:  " + "\n");

		for( int i = 0; i < stor.size(); i ++ ){
			System.out.println( stor.get(i) );
		}
		
	}
}
