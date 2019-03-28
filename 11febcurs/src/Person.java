import java.io.Serializable;

public class Person implements Serializable {
    String FirstName;
    String LastName;

    transient private Thread myThread;

    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", myThread=" + myThread +
                '}';
    }
//
//    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in);
//        Person p1 = new Person("","");
//        Person p2 = new Person("","");
//       p1.FirstName="Ana";
//       p2.FirstName="Ion";
//
//        try {
//            FileOutputStream fos = new FileOutputStream("files");
//
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(p1);
//            oos.writeObject(p2);
//        }
//        catch (java.lang.Exception e){
//            System.out.println("error");
//        }

    }
