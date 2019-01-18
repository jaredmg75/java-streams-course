import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class PeakAndModifyTest {
  @Test
  public void validate() {
    List<Integer> expectedSalaries = MVP.mostValuablePlayers.stream()
        .map(mvp -> mvp.getSalary() + 5000)
        .collect(Collectors.toList());

    List<Integer> actualSalaries = PeekAndModifyTask.giveRaises().stream()
        .map(mvp -> mvp.getSalary())
        .collect(Collectors.toList());

    assertEquals(expectedSalaries, actualSalaries);
  }

}