import java.util.Optional;

class FindFirstTask {

  public static Optional<MVP> findFirstMVPForTeam(String team) {
    return MVP.mostValuablePlayers
        .stream()
        .filter(w -> w.getTeam().equals(team))
        .findFirst();
  }
}