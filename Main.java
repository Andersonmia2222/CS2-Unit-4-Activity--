
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

   public static void main(String []args) throws IOException {
      // create file, scanner, and String[] OBJECTS 
      // use the format: ClassName objectName = new ClassName();
      File myFile = new File("pokemon.csv");
      Scanner scan = new Scanner (myFile);
      String[] pokemonLines = new String[10];
      // initalize a line counter 
      int i = 0;
      // loop through every line in FILE useing scanner methods
while (scan.hasNext() && (i < 10)){
  
// read in the next line from the file 
String currentLine = scan.nextLine();
// asign the line to be stored in the array
pokemonLines[i] = currentLine;
// print out that line from array 
System.out.println( pokemonLines[i] );
// increment line counter 
     i++;
      
}
   }
}
