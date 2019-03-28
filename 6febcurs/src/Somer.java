public class Somer extends Persoana {

    public Somer(String name, String CNP) {
        super(name, CNP);
    }

    @Override
    public int compareTo(Persoana o) {
        return super.compareTo(o);
    }

    @Override
    public void run() {
        System.out.println("Somer ["+name+"] is running.");
    }
}
