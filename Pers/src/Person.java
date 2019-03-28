public class Person {
    private String name;
    private String surname;
    public Person(String name, String surname) throws IllegalAccessError {
        if(name==null || surname==null){
            throw new IllegalArgumentException();

        }
        this.name=name;
        this.surname=surname;
    }
    public String getFullName(){
        return name+ " "+ surname;
    }

    public static void main(String[] args) {

    }
}


