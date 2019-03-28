import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<Persoana> persoane = new ArrayList<>();

        persoane.add(new Angajat("Ion", "12345"));
        persoane.add(new Somer("Maria", "23415"));
        persoane.add(new Student("Ana", "2876345"));
        persoane.add(new Student("Ana", "2876345"));

        for (Persoana p : persoane) {
            p.run();
        }
    }
}
