import java.util.HashMap;
import java.util.Map;

public class StringHashmap {
	public static void main(String args[]) { 
		String input = "programming";

    char firstRepeatingChar = findFirstRepeatingCharacter(input);
    System.out.println("First Repeating Character: " + firstRepeatingChar);
}

private static char findFirstRepeatingCharacter(String input) {
    Map<Character, Integer> charCountMap = new HashMap<>();
    return input.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> {
                charCountMap.compute(c, (key, value) -> (value == null) ? 1 : value + 1);
                return charCountMap.get(c) > 1;
            })
            .findFirst()
            .orElse('\0');
   }
}