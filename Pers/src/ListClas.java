import java.util.ArrayList;
import java.util.List;

public class ListClas {
    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();
        myList.add("First tElement");
        myList.add("Another Element");
        myList.add("Another Element");
        myList.remove("Another Element");

        for(int i=0;i<myList.size();i++){
            String element= myList.get(i);
            System.out.println(myList.get(i));
        }
        System.out.println("----");

        for(String element:myList){
    System.out.println(element);
}
    }
}






