import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {


    try	(
            BufferedReader r	=	new	BufferedReader(new FileReader("text.txt")))	{
        String	firstLine	=	r.readLine();
    }	catch	(IOException e)	{
        System.out.println("Cannot	read	first	line	from	text.txt:"	+	e.getMessage());
    }
}
}