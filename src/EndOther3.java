public class EndOther3 {
  public boolean endOther(String a, String b) {
    String strA = a.toLowerCase();
    String strB = b.toLowerCase();

    return (strA.endsWith(strB) || strB.endsWith(strA));
  }
}
