import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SkipTest {

  @Test
  public void validate() {

    List<MVP> expectedOutput = MVP.mostValuablePlayers.stream().skip(10).collect(Collectors.toList());
    List<MVP> actualOutput = SkipTask.getMVPSkippingFirstTen();

    assertEquals(expectedOutput, actualOutput);
  }

}