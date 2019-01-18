import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindAnyTest {

  @Test
  public void validate() {
    String name = "Wilt Chamberlain";
    assertTrue("Did not find a matching name in the list of mvp's.", FindAnyTask.findAnyMVPWithName(name).isPresent());
  }
}