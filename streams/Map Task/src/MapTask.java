import java.util.List;

import static java.util.stream.Collectors.toList;

class MapTask {

  public static List<String> getHighestPaidMVPs(int salary) {
    return MVP.mostValuablePlayers
        .stream()
        .filter(mvp -> mvp.getSalary() >= salary) // Filter out mvp's who's salary is less than the salary parameter
        .map(MVP::getName) // Map from a mvp to the mvp's name
        .collect(toList());
  }
}