import java.util.Map;

public class HashMap {

    public static void main(String[] args) {
      Map<String,Persoana> hmap = new java.util.HashMap<>();

          hmap.put("Porecla3", new Somer("Ioana","22521"));
          hmap.put("Porecla1", new Angajat("Vasile","225218"));
          hmap.put("Porecla3", new Student("Gheo","5889546"));

        hmap.get("Porecla1").run();
        hmap.get("Porecla3").run();

for (String key:hmap.keySet()){

}
    }




    }
