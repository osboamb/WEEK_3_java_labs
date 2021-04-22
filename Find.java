import java.io.File; //File class
import java.io.FileNotFoundException;
import java.util.Scanner; //Scanner can be used to read text files 

public class Find { 
    public static void main (String[] args) {
        
        String findWord = args[0];

        try {
            File myFilms = new File("bestpicturefilms.txt");
            Scanner myReader = new Scanner(myFilms);
            
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                
                if (data.contains(findWord)) {
                     System.out.println(data);
                }
                   
            }

             myReader.close();
           } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
        }
    }