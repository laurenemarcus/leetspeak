public class Leetspeak {
  public static void main(String[] args) {

  }

  public static String leetspeak(String babbling) {
    String leeted = babbling.replaceAll("e", "3").replaceAll("o", "0");
    return leeted;
  }
}
