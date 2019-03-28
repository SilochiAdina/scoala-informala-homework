import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            String readLine;
            List<String> nameList = new ArrayList<String >();
            String month = "12";

            Exe1.deleteContent();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(Exe1.fileIn))) {
                while ((readLine = bufferedReader.readLine()) != null) {

                    String[] lineValues = readLine.split(",");
                    String[] dateOfBirth = lineValues[2].split("/");
                    if(month.equals(dateOfBirth[1])) {
                        nameList.add(lineValues[0] + " " + lineValues[1]);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error.");
                e.printStackTrace();
            }

            if(!nameList.isEmpty()) {
                Collections.sort(nameList);
                Exe1.writeInFile (nameList);
            }
        }
    }
