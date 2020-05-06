import java.util.Map;

public class Solution {

    Map<String, Integer> getLongestWordAndLength(String sentence) {
        String[] words = getWordsArray(sentence);

        int longestWordLength = 0;
        String longestWord = "";

        for (String word : words) {
            // if there are two words with same length, the first word with longest length is returned
            if (longestWordLength < word.length()) {
                longestWordLength = word.length();
                longestWord = word;
            }
        }
        return Map.of(longestWord, longestWordLength);
    }

    Map<String, Integer> getShortestWordAndLength(String sentence) {
        String[] words = getWordsArray(sentence);

        // if sentence is an empty string, then return <"", 0>
        if (words.length == 0) {
            return Map.of("", 0);
        }

        int shortestWordLength = words[0].length();
        String shortestWord = words[0];

        for (String word : words) {
            // if there are two words with same length, the first word with shortest length is returned
            if (shortestWordLength > word.length()) {
                shortestWordLength = word.length();
                shortestWord = word;
            }
        }
        return Map.of(shortestWord, shortestWordLength);
    }

    private String[] getWordsArray(String sentence) {
        // remove all punctuations
        sentence = sentence.replaceAll("[^\\w\\s]", "");

        return sentence.split("\\s");
    }
}
