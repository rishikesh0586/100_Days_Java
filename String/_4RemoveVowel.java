package Java;

public class _4RemoveVowel {
    
    // import java.util.regex.Pattern;

    // public class RemoveVowels {
    
        public static void main(String[] args) {
            String str = "Hello, world!";
            String result = str.replaceAll("[aeiouAEIOU]", "");
            System.out.println(result); // Output: Hll, wrd!
        }
    }
    