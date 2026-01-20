import java.util.Scanner;
import java.io.IOException;
import java.nio.file.*;
public class readingScores {
    public static void main(String[] args)throws Exception{
        Scanner file = new Scanner(Path.of("ScoreSave.txt"));
        //checking for a line below current line
        while(file.hasNext()){
            //assign the current line to a variable
            String line = file.nextLine();
            //print the variable
            System.out.println(line);
        }
        file.close();
    }
}
