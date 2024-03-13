import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

}
