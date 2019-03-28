import java.util.Objects;

public class Test {
    private String name;

    public Test () {
        this.name = "no name";
    }
    public Test (String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Test test = (Test) obj;
        return Objects.equals(name, test.name);
    }


    public static void main(String[] args) {
        Test t =new Test("Daniel");
        Test t1=new Test ("Daniel");
        System.out.println(t.equals(t1));


    }
}


