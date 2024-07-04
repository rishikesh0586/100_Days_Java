package Java;

public class _6RemoveSpaces {
    
    // import java.util.regex.Pattern;

    // public class RemoveSpaces {
    
        public static void main(String[] args) {
            String str = "Hello, world!";
            String result = str.replaceAll("\\s", "");
            System.out.println(result); // Output: HelloWorld!
        }
    }
    