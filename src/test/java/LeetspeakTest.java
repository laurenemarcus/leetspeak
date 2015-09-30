import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest {
  @Test
  public void leetspeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    Leetspeak testLeetspeak = new Leetspeak();
    assertEquals("happy", testLeetspeak.leetspeak("happy"));
  }

  @Test
  public void leetspeak_replacesEveryEInAStringWithA3_wordChanges() {
    Leetspeak testLeetspeak = new Leetspeak();
    assertEquals("3l3phant", testLeetspeak.leetspeak("elephant"));
  }

  @Test
  public void leetspeak_replacesEveryOInAStringWithA0_wordChanges() {
    Leetspeak testLeetspeak = new Leetspeak();
    assertEquals("b00 b00", testLeetspeak.leetspeak("boo boo"));
  }

  @Test
  public void leetspeak_replacesEveryIInAStringWithA1_wordChanges() {
    Leetspeak testLeetspeak = new Leetspeak();
    assertEquals("1 lik3 1k3", testLeetspeak.leetspeak("I like Ike"));
  }

  @Test
  public void leetspeak_replacesEverySInAStringWithAZ_wordChanges() {
    Leetspeak testLeetspeak = new Leetspeak();
    assertEquals("r0z3z ar3 r3d", testLeetspeak.leetspeak("roses are red"));
  }

    @Test
    public void leetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
      Leetspeak testLeetspeak = new Leetspeak();
      assertEquals("suzi3 sunzhin3", testLeetspeak.leetspeak("susie sunshine"));
  }
}
