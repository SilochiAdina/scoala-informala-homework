import java.util.Arrays;

public class Stream3 {
    public static void main(String[] args) {
//        Arrays.asList("a1","a2","b1","b2","c2","c1")
//               .stream()
//                .parallelStream()
//                .findFirst()
//                .ifPresent(System.out::println);

//*************************************
/**
 * Generate new collections
 */

//        List<String >myList= Arrays.asList("a1","a2","b1","b2","c2","c1");
//
//        List<String> newList=myList
//                .stream()
//                .filter(s -> s.startsWith("c"))
//                .sorted()
//                .collect(Collectors.toList());


//*************************************


/**
 * Parallel stream – multiple threads used to perform the pipeline
 */

        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n ",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));

    }
}
