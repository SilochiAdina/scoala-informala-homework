import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Ex1 {
    public static void main(String[] args) {
        final IntPredicate isPrime = n -> {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        IntStream.range(1, 100)
                .filter(isPrime)
                .forEach(System.out::println);

    }
}
