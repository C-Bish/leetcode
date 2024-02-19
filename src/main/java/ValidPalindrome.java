public class ValidPalindrome {

    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
        boolean isPalindrome = isPalindrome(test);

        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        char[] array = s.toCharArray();

        for (int i=0; i < array.length; i++) {
            if (array[i] != array[array.length-i-1]) {
                return false;
            }
        }
        return true;
    }
}