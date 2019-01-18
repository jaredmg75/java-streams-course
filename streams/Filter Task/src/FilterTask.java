import java.util.List;
import java.util.stream.Collectors;

class FilterTask {

  public static List<MVP> getAllSalariesAbove500k() {
    return MVP.mostValuablePlayers.stream()
        .filter(mvp -> mvp.getSalary() > 500_000)
        .collect(Collectors.toList());
  }
}