import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PeekTask {

  public static List<MVP> printAllSalaries() {
    Stream<MVP> streamUsersData = MVP.mostValuablePlayers.stream();
    return streamUsersData
        .peek(mvp -> System.out.println(mvp.getSalary()))
        .collect(Collectors.toList());

  }
}