import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String > dictionary = new HashMap<>();
        try{

            File file = new File("src/testFile");
            Scanner read = new Scanner(file);
            while (read.hasNextLine()){
                String txt = read.nextLine();
                String newTextA = txt.split(",")[0];
                String newTextB = txt.split(",")[1];
                dictionary.put(newTextA, newTextB);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        Scanner read = new Scanner(System.in);
        System.out.println("Enter a word to lookup!");
        String word = read.nextLine();
        if(dictionary.get(word)!=null){
            System.out.println("Word: "+ word + "\nDefinition: " + dictionary.get(word));
        }
        else {
            System.out.println("Word Not Found");
        }

    }
}
