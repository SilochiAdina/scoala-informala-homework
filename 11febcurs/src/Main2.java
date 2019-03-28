import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main2 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Person p1 = new Person("", "");
        Person p2 = new Person("", "");
        p1.FirstName = "Ana";
        p2.FirstName = "Ion";

        try {
            FileOutputStream fos = new FileOutputStream("files");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);
        } catch (java.lang.Exception e) {
            System.out.println("error");
        }

    }
}