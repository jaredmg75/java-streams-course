import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PeekTest {
  @Test
  public void validate() {
    java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
    System.setOut(new java.io.PrintStream(out));

    PeekTask.printAllSalaries();

    String consoleOutput = out.toString();
    MVP.mostValuablePlayers.stream().peek(mvp -> assertTrue(consoleOutput.contains(String.valueOf(mvp.getSalary()))));
  }

}