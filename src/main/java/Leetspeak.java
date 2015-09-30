public class Leetspeak {
  public static void main(String[] args) {

  }

  public static String leetspeak(String babbling) {
    String[] splitBabbling = babbling.split(" ");
    String leeted = splitBabbling.replaceAll("e", "3").replaceAll("o", "0").replaceAll("I", "1").replaceAll("s", "z");
    return leeted;
  }
}
