import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

class GroupingByTask {

  public static Map<String, List<MVP>> groupMVPsByCountry() {

    return MVP.mostValuablePlayers.stream()
        .collect(groupingBy(MVP::getNationality));
  }
}