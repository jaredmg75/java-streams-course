import java.util.List;

import static java.util.stream.Collectors.toList;

class SkipTask {

  public static List<MVP> getMVPSkippingFirstTen() {

    return MVP.mostValuablePlayers
        .stream()
//        .skip(10)
        .collect(toList());
  }
}