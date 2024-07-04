package Java;

public class _5RemoveSpecialChar {
    

    
        public static void main(String[] args) {
            String str = "Hello, world! This is a string with special characters.";
            String result = str.replaceAll("[^\\w\\s]", "");
            System.out.println(result); // Output: HelloWorldThisisastringwithspecialcharacters.
        }
    }
    