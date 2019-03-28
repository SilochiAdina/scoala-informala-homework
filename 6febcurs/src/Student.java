public class Student extends Persoana {

    public Student(String name, String CNP) {
        super(name, CNP);
    }

    @Override
    public int compareTo(Persoana o) {
        return super.compareTo(o);
    }


    @Override
    public void run() {
        System.out.println("Student ["+name+"] is running.");
    }
}
