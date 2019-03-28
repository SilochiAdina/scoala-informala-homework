import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spanzuratoarea {


   private List<String> words= new ArrayList<>();
//    public void readWordsFormFile(String fileName) throws IOException{}

    private static String word = "C:\\Users\\Adina\\Desktop\\java\\words.txt";

//    private static String word =  words[(int) (Math.random() * words.length())];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;



    public static void main(String[] args) throws IOException {
        String words="C:\\Users\\Adina\\Desktop\\java\\words.txt";
        Scanner scanner = new Scanner(new File(word));

        Scanner sc = new Scanner(System.in);

        while (count < 7 && asterisk.contains("*")) {
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }

        if (asterisk.equals(newasterisk)) {
            count++;
             int lives = 10;
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }
}
