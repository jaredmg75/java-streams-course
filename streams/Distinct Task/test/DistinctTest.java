import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class DistinctTest {

  @Test
  public void validate() {
    List<String> expectedOutput = MVP.mostValuablePlayers.stream().map(MVP::getName).distinct().collect(Collectors.toList());
    List<String> actualOutput = DistinctTask.getDistinctWinners();

    assertEquals(expectedOutput, actualOutput);
  }

}