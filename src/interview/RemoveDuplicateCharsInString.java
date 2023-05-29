package interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharsInString {
    private static void removeDuplicate(String input) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChars = input.charAt(i);
            if (uniqueChars.add(currentChars)) {
                stb.append(currentChars);
            }
        }
        System.out.println("Original String: " + input);
        System.out.println("String without Duplicate: " + stb.toString());
    }

    public static void main(String[] args) {
        removeDuplicate("Abdulkerim Mohammed");
        removeDuplicate("Sherwin Williams");
    }
}
