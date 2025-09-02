import java.util.HashMap;

public class DuplicateEncoder {

    public static String encode(String word) {
        word = word.toLowerCase();
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (char c : word.toCharArray()) {
            result.append(countMap.get(c) == 1 ? '(' : ')');
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("din"));      // "((("
        System.out.println(encode("recede"));   // "()()()"
        System.out.println(encode("Success"));  // ")())())"
        System.out.println(encode("(( @"));     // "))(("
    }
}