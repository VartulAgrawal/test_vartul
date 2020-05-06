import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testGetLongestWordAndLength_standardCase() {
        Solution solution = new Solution();
        Map<String, Integer> longestWordAndLength = solution.getLongestWordAndLength("The cow jumped over the moon.");
        assertEquals(Map.of("jumped", 6), longestWordAndLength);
    }

    @Test
    public void testGetLongestWordAndLength_withEmptyString() {
        Solution solution = new Solution();
        Map<String, Integer> longestWordAndLength = solution.getLongestWordAndLength("");
        assertEquals(Map.of("", 0), longestWordAndLength);
    }

    @Test
    public void testGetLongestWordAndLength_withMultipleWordsOfEqualLongestLength() {
        Solution solution = new Solution();
        Map<String, Integer> longestWordAndLength = solution.getLongestWordAndLength("The world is a very happy place.");
        assertEquals(Map.of("world", 5), longestWordAndLength);
    }

    @Test
    public void testGetLongestWordAndLength_withSentenceWithPunctuations() {
        Solution solution = new Solution();
        Map<String, Integer> longestWordAndLength = solution.getLongestWordAndLength("The world?,) is a very happy! place.");
        assertEquals(Map.of("world", 5), longestWordAndLength);
    }

    @Test
    public void testGetShortestWordAndLength_standardCase() {
        Solution solution = new Solution();
        Map<String, Integer> longestWordAndLength = solution.getShortestWordAndLength("The cow jumped over the moon.");
        assertEquals(Map.of("The", 3), longestWordAndLength);
    }

    @Test
    public void testGetShortestWordAndLength_withEmptyString() {
        Solution solution = new Solution();
        Map<String, Integer> longestWordAndLength = solution.getShortestWordAndLength(" ");
        assertEquals(Map.of("", 0), longestWordAndLength);
    }

    @Test
    public void testGetShortestWordAndLength_withMultipleWordsOfEqualLongestLength() {
        Solution solution = new Solution();
        Map<String, Integer> longestWordAndLength = solution.getShortestWordAndLength("London is full of character and life.");
        assertEquals(Map.of("is", 2), longestWordAndLength);
    }

    @Test
    public void testGetShortestWordAndLength_withSentenceWithPunctuations() {
        Solution solution = new Solution();
        Map<String, Integer> longestWordAndLength = solution.getShortestWordAndLength("The world?,) is a very happy! place.");
        assertEquals(Map.of("a", 1), longestWordAndLength);
    }
}