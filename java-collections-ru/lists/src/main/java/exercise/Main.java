package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class Main {
    public static void main(String[] args) {
    }
    public static boolean scrabble(String setOfChars, String word) {
        List<String> listOfChars = new ArrayList<>(Arrays.asList(setOfChars.toLowerCase().split("")));
        String[] splitWordChars = word.toLowerCase().split("");

            // WORD ITERATION
        for (var wordChar: splitWordChars) {
            var index = listOfChars.indexOf(wordChar);
            if (index == -1) {
                   return false;
                }
            listOfChars.remove(index);
        }
        return true;
    }
}
// END
