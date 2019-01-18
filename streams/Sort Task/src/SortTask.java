import java.util.List;
import java.util.stream.Collectors;

class SortTask {

  public static List<String> sortMostValuablePlayersByName() {

    return MVP.mostValuablePlayers.stream()
        .map(MVP::getName)
        .sorted()
        .collect(Collectors.toList());
  }
}