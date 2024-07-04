package Java;

import java.util.HashMap;
import java.util.Map;

public class _3FirstNonReapeating {
    

  public static void main(String[] args) {
    String str = "Hello, world!";
    Map<Character, Integer> charMap = new HashMap<>();

    for (char ch : str.toCharArray()) {
      charMap.put(ch, charMap.getOrDefault(ch, 0) + 1); // Similar logic to JavaScript
    }

    char firstNonRepeating = '\0'; // Initialize with a non-letter character
    char firstRepeating = '\0';

    for (char ch : str.toCharArray()) {
      if (charMap.get(ch) == 1) {
        firstNonRepeating = ch;
        break; // Exit loop if non-repeating found
      } else if (charMap.get(ch) > 1 && firstRepeating == '\0') {
        firstRepeating = ch;
      }
    }

    System.out.println("First non-repeating character: " + (firstNonRepeating == '\0' ? "Not found" : firstNonRepeating));
    System.out.println("First repeating character: " + (firstRepeating == '\0' ? "Not found" : firstRepeating));
  }
}

