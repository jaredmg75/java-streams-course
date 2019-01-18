import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SortTest {

  @Test
  public void validate() {

    List<String> expectedOutput = MVP.mostValuablePlayers.stream().map(MVP::getName).sorted().collect(Collectors.toList());
    List<String> actualOutput = SortTask.sortMostValuablePlayersByName();

    assertEquals(expectedOutput, actualOutput);
  }

}