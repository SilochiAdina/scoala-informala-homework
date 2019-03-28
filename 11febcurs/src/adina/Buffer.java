package adina;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader in=null;
        BufferedReader out=null;

        Charset charset = Charset.forName("UTF8");
        try (
                BufferedReader reader = Files.newBufferedReader(Paths.get("in.txt"), charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.println("IOException: " + x);
        }
    }
}