import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String wordOne = "CA T";
        String wordTwo = "a ct";

        System.out.println(areAnagrams(wordOne, wordTwo));
    }

    private static boolean areAnagrams(String wordOne, String wordTwo) {

        String formattedWordOne = wordOne.replace(" ", "").toLowerCase();
        String formattedWordTwo = wordTwo.replace(" ", "").toLowerCase();

        if (!hasEqualLength(formattedWordOne, formattedWordTwo)) {
            return false;
        }

        char[] wordOneChar = formattedWordOne.toCharArray();
        char[] wordTwoChar = formattedWordTwo.toCharArray();

        Arrays.sort(wordOneChar);
        Arrays.sort(wordTwoChar);

        return Arrays.equals(wordOneChar, wordTwoChar);
    }

    private static boolean hasEqualLength(String formattedStr1, String formattedStr2) {
        if (formattedStr1.length() != formattedStr2.length()) {
            return false;
        }
        return true;
    }
}
