import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/**
 * flatMap
 */
public class F1Team {

    String name;
    HashSet<String> drivers;

    public F1Team(String name, String...drivers) {
        this.name = name;
        this.drivers = new HashSet<>(Arrays.asList(drivers));
    }

static List<F1Team> f1Teams=Arrays.asList(
        new F1Team("Ferrari","Sebastian Vettel","Kimi Raikonnen"),
        new F1Team("McLaren Honda", "Stoffel Vandoorne", "Fernando Alonso","Jensen Button"),
        new F1Team("Mercedes","Lewis Hamilton","Valtteri Bottas"));

    public static void main(String[] args) {
        f1Teams.stream().flatMap(f1Team -> {
            System.out.println("Team: \n"+f1Team.name);
            return f1Team.drivers.stream();
        }).forEach(driver-> System.out.println("   "+driver));
    }

    }

