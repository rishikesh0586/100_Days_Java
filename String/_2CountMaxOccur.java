package Java;

import java.util.HashMap;
import java.util.Map;

public class _2CountMaxOccur {
    


  public static void main(String[] args) {
    String str = "Hello, world! This is an example.";
    Map<Character, Integer> charMap = countCharOccurrences(str);

    char maxChar = ' ';
    int maxCount = 0;
    char minChar = ' ';
    int minCount = Integer.MAX_VALUE; // Initialize with maximum possible value

    for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
      char key = entry.getKey();
      int count = entry.getValue();

      if (count > maxCount) {
        maxChar = key;
        maxCount = count;
      }
      if (count < minCount && count > 0) { // Ignore characters with count 0 (not appearing)
        minChar = key;
        minCount = count;
      }
    }

    System.out.println("Maximum occurring character: " + maxChar + " (" + maxCount + " times)");
    System.out.println("Minimum occurring character (excluding characters not appearing): " + minChar + " (" + minCount + " times)");
  }

  private static Map<Character, Integer> countCharOccurrences(String str) {
    Map<Character, Integer> charMap = new HashMap<>();
    for (char ch : str.toCharArray()) {
      if (charMap.containsKey(ch)) {
        charMap.put(ch, charMap.get(ch) + 1);
      } else {
        charMap.put(ch, 1);
      }
    }
    return charMap;
  }
}

