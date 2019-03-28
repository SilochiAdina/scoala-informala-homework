import java.util.LinkedHashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Persoana> persoane = new LinkedHashSet<>();

        persoane.add(new Angajat("Ion", "12345"));
        persoane.add(new Somer("Adrian", "1920502846"));
        persoane.add(new Somer("Maria", "23415"));
        persoane.add(new Student("Ana", "2876345"));
        persoane.add(new Student("Ana", "2876345"));

        for (Persoana p : persoane) {
            p.run();
        }
    }
}
