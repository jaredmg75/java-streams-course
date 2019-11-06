import java.util.Optional;

class FindAnyTask {

  public static Optional<MVP> findAnyMVPWithName(String name) {
    return MVP.mostValuablePlayers
        .stream()
//        .filter()
        .findAny();
  }
}