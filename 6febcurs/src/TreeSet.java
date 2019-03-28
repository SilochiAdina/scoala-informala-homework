import java.util.HashSet;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Persoana> persoane = new HashSet<Persoana>();

        persoane.add(new Angajat("Ion", "12345"));
        persoane.add(new Angajat("Adrian", "1920502846"));
        persoane.add(new Angajat("Maria", "23415"));
        persoane.add(new Angajat("Ana", "2876345"));
        persoane.add(new Angajat("Ana", "2876345"));

        for (Persoana p : persoane) {
            p.run();
        }
    }
}

