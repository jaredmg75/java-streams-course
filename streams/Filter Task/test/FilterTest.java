import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FilterTest {

  @Test
  public void validate() {
    FilterTask.getAllSalariesAbove500k().stream().forEach(mvp -> assertTrue("Expected mvp salary to be greater than 500,000 but was " + mvp.getSalary(), mvp.getSalary() > 500_000));
  }
}