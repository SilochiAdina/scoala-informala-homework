import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Persoana> pers= new LinkedList<>();
        List<Persoana>persoanaList= (List)pers;

        pers.add(new Angajat("Ion","59554"));
        pers.add(new Somer("Maria", "565689"));
        persoanaList.get(0).run();

        pers.poll().run();
        persoanaList.get(0);
        persoanaList.remove(0);



    }
}
