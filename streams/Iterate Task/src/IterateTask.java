import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class IterateTask {

  public static List<Integer> evenNumbers(int startingNumber, int count) {
    return Stream.iterate(startingNumber, index -> index + 1)
//        .peek()
//        .filter()
//        .peek()
        .limit(count)
        .collect(Collectors.toList());

  }
}