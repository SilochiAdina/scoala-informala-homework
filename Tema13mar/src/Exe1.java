import java.io.*;
import java.util.List;


public class Exe1 {

    public  static final String fileIn = "C:\\Users\\Adina\\Desktop\\java\\tema.csv";
    public  static final String fileOut="C:\\Users\\Adina\\Desktop\\java\\tema1.csv";

    public static void writeInFile(List<String> namesList) {

            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fileOut, true), "utf-8")))
            {
                for(String name : namesList){
                    System.out.println(name);
                    writer.write(name);
                    ((BufferedWriter) writer).newLine();
                    // newLine - to go to the next line
                }

                writer.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error! File was not found");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public static void deleteContent(){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileOut);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



}

