import java.util.ArrayList; 
import java.util.Scanner; 

public class ReverseInputs {
    public static void main (String[] args){

        ArrayList<String> storage = new ArrayList<String>(); //new ArrayList object 

        Scanner myText = new Scanner(System.in); //new scanner object
        System.out.print("Please enter text. Enter a blank line when you are finished: ");

        String text = myText.nextLine();
        storage.add(text);
        String rev = new StringBuffer(storage.get(0)).reverse().toString();
        
        System.out.println("Your input reversed: " + rev);


        
        //while (storage.size() > count) {
            //System.out.println(storage.get(count));
            //count ++;
       // }


    }
}