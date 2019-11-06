import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PeekAndModifyTask {

  public static List<MVP> giveRaises() {
    Stream<MVP> streamMVPsData = MVP.mostValuablePlayers.stream();
    return streamMVPsData
//        .peek()
        .collect(Collectors.toList());
  }
}