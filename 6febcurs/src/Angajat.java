public class Angajat extends Persoana {

    public Angajat(String name, String CNP) {
        super(name, CNP);
    }

    @Override
    public int compareTo(Persoana o) {
        return super.compareTo(o);
    }

    @Override
    public void run() {
        System.out.println("Angajat ["+name+"] is running.");

    }

}
