import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class IterateTest {

  @Test
  public void validate() {
    List<Integer> evenNumbers = IterateTask.evenNumbers(15, 5);
    assertEquals(5, evenNumbers.size());
    assertEquals(new Integer(16), evenNumbers.get(0));
    assertEquals(new Integer(18), evenNumbers.get(1));
    assertEquals(new Integer(20), evenNumbers.get(2));
    assertEquals(new Integer(22), evenNumbers.get(3));
    assertEquals(new Integer(24), evenNumbers.get(4));
  }

}