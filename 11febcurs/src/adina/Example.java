package adina;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {


        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("in.txt");
            out = new FileOutputStream("out.txt");
            int val;
            while ((val = in.read()) != -1) {
                out.write(val);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}