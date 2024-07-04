package Java;

import java.util.HashMap;
import java.util.Map;

public class _1CountOccurence {
   

  public static void main(String[] args) {
    String str = "Hello, world!";
    Map<Character, Integer> charMap = new HashMap<>();
    for (char ch : str.toCharArray()) {
      if (charMap.containsKey(ch)) {
        charMap.put(ch, charMap.get(ch) + 1);
      } else {
        charMap.put(ch, 1);
      }
    }
    System.out.println(charMap);
  }
}

