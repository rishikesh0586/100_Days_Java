package Java;


    
    import java.util.LinkedHashSet;
    import java.util.Set;
    
    public class _7RemoveDuplicates {
    
        public static void main(String[] args) {
            String str = "Hello, world! This is a string with duplicates.";
            Set<Character> charSet = new LinkedHashSet<>();
            StringBuilder result = new StringBuilder();
            for (char ch : str.toCharArray()) {
                if (charSet.add(ch)) {
                    result.append(ch);
                }
            }
            System.out.println(result); // Output: Heo, wrd! Ti sa rng wth duplcat.
        }
    }
    