import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GroupingByTest {

  @Test
  public void validate() {

    Map<String, List<MVP>> countryToWinnersMap = GroupingByTask.groupMVPsByCountry();
    assertEquals(4, countryToWinnersMap.size());
    assertEquals(59, countryToWinnersMap.get("United States").size());
    assertEquals(1, countryToWinnersMap.get("Nigeria").size());
    assertEquals(2, countryToWinnersMap.get("Canada").size());
    assertEquals(1, countryToWinnersMap.get("Germany").size());
  }
}