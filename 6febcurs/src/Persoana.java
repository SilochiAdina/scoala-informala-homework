public abstract class Persoana implements Comparable<Persoana>{

    public String name;
    public String CNP;

    public Persoana(String name, String CNP) {
        this.name = name;
        this.CNP = CNP;
    }

    public abstract void run();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Persoana persoana = (Persoana) o;

        return CNP != null ? CNP.equals(persoana.CNP) : persoana.CNP == null;
    }

    @Override
    public int hashCode() {
        return CNP != null ? CNP.hashCode() : 0;
    }

@Override
    public int compareTo(Persoana o) {
        if(o==null) return 1;
        int result =name.compareTo(o.name);
        System.out.println(name+"----"+o.name);
        System.out.println("result:"+result);
        return name.compareTo(o.name)*-1;
    }
}
