import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pers {
    private String CNP;
    private String name;
    private String surname;

    public Pers(String name, String surname, String CNP) {
        this.name = name;
        this.surname = surname;
        this.CNP=CNP;

    }



    public static void main(String[] args) {
  /**      Pers[] myPers = new Pers[3];
        myPers[0] = new Student("Ana", "Popescu");
        myPers[1] = new Employee("Ioana", "Vasilescu");
        myPers[2] = new Unemployed("Vasile", "Grigorescu");

        for (int i = 0; i < myPers.length; i++) {
            System.out.println("myPers["+i+"]="+myPers[i]);
        }
*/
        List<Pers> myList=new ArrayList<>();
        myList.add(new Student("Ana", "Popescu","2960208045358"));
        myList.add(new Employee("Vasilescu","Ion","1925263589425"));
        myList.add(new Unemployed("Vasile","Ionescu","1925263589425"));

        for(Pers pers: myList){
            pers.run();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pers)) return false;
        Pers pers = (Pers) o;
        return CNP.equals(pers.CNP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CNP);
    }

    public static void run() {
    }



}

