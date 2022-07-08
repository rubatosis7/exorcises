package example;

public class C {
  int q = 2;

  public C() {

  }

  public C(int i) {
    q = i;
  }

  public int result() {
    return q;
  }

  // given a string such as "apples and oranges",
  // calculate how many characters in the string are 'a' or 'A'.
  public int numberOfAs(String s) {
    int ttl = 0;
    int i = 0;
    while (i < s.length()) {
      var c = s.charAt(i);
      if (c == 'A' || c == 'a') {
        ttl += 1;
      }
      i = i + 1;
    }
    return ttl;
  }
}
