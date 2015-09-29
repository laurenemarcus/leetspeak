import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest {
  @Test
  public void leetspeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    Leetspeak testLeetspeak = new Leetspeak();
    assertEquals("hello", testLeetspeak.leetspeak("hello"));
}
}
