import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class IterateTask {

  public static List<Integer> evenNumbers(int startingNumber, int count) {
    return Stream.iterate(startingNumber, index -> index + 1)
        .peek(n -> System.out.println("number generated: - " + n))
        .filter(n -> (n % 2 == 0))
        .peek(n -> System.out.println("Even number filter passed for - " + n))
        .limit(count)
        .collect(Collectors.toList());

  }
}