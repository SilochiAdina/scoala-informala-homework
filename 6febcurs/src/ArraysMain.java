public class ArraysMain {

    public static void main(String[] args) {

        Persoana[] persoane = new Persoana[3];

        persoane[0] = new Angajat("Ion", "12345");
        persoane[1] = new Student("Maria", "23415");
        persoane[2] = new Somer("Ana", "2876345");

        for (int i = 0; i < persoane.length; i++) {
            persoane[i].run();
        }
    }
}
