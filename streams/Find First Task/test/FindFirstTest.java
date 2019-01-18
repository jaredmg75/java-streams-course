import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class FindFirstTest {

  @Test
  public void validate() {
    String team = "Boston Celtics";
    Optional<MVP> firstWinnerWithTeam = FindFirstTask.findFirstMVPForTeam(team);

    Assert.assertTrue("Did not find any mvp's who played for " + team, firstWinnerWithTeam.isPresent());
    assertEquals("Bob Cousy", firstWinnerWithTeam.get().getName());
  }
}