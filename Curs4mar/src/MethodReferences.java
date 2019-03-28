import java.util.Arrays;
import java.util.List;

public class MethodReferences {

//    private  String myCoustomName;
//
//    public MethodReferences(String myCoustomName) {
//        this.myCoustomName = myCoustomName;
//    }

    public static void printStuffStatic (String stuff){
        System.out.println("printStuffStatic==="+stuff);
    }
    public static void main(String[] args) {

       List<String>names= Arrays.asList("Maria","Irina","Ion", "Patricia");
    names.forEach(MethodReferences::printStuffStatic);
    }
}
