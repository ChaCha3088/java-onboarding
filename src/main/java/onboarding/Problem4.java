package onboarding;

import java.util.Map;
import java.util.regex.Pattern;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        return answer;
    }

    private static Boolean isAlphabet(String word) {
        if(Pattern.matches("^[a-zA-Z]*$", word)) {
            return true;
        } else {
            return false;
        }
    }

    private static Map<String, String> frogsDictionary = Map.ofEntries(
            Map.entry("A", "Z"),
            Map.entry("B", "Y"),
            Map.entry("C", "X"),
            Map.entry("D", "W"),
            Map.entry("E", "V"),
            Map.entry("F", "U"),
            Map.entry("G", "T"),
            Map.entry("H", "S"),
            Map.entry("I", "R"),
            Map.entry("J", "Q"),
            Map.entry("K", "P"),
            Map.entry("L", "O"),
            Map.entry("M", "N"),
            Map.entry("N", "M"),
            Map.entry("O", "L"),
            Map.entry("P", "K"),
            Map.entry("Q", "J"),
            Map.entry("R", "I"),
            Map.entry("S", "H"),
            Map.entry("T", "G"),
            Map.entry("U", "F"),
            Map.entry("V", "E"),
            Map.entry("W", "D"),
            Map.entry("X", "C"),
            Map.entry("Y", "B"),
            Map.entry("Z", "A"),
            Map.entry("a", "z"),
            Map.entry("b", "y"),
            Map.entry("c", "x"),
            Map.entry("d", "w"),
            Map.entry("e", "v"),
            Map.entry("f", "u"),
            Map.entry("g", "t"),
            Map.entry("h", "s"),
            Map.entry("i", "r"),
            Map.entry("j", "q"),
            Map.entry("k", "p"),
            Map.entry("l", "o"),
            Map.entry("m", "n"),
            Map.entry("n", "m"),
            Map.entry("o", "l"),
            Map.entry("p", "k"),
            Map.entry("q", "j"),
            Map.entry("r", "i"),
            Map.entry("s", "h"),
            Map.entry("t", "g"),
            Map.entry("u", "f"),
            Map.entry("v", "e"),
            Map.entry("w", "d"),
            Map.entry("x", "c"),
            Map.entry("y", "b"),
            Map.entry("z", "a")
    );
}
