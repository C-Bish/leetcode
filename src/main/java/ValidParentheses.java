import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "([]{})";
        boolean valid = isValid(s);
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        // Exit early if odd number of chars
        if (s != null && s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> expectedClosing = new Stack<Character>();

        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            // Push expected closing parentheses to stack
            if (ch[i] == '(') {
                expectedClosing.push(')');
            } else if (ch[i] == '[') {
                expectedClosing.push(']');
            } else if (ch[i] == '{') {
                expectedClosing.push('}');
            } else {
                // If not an opening parentheses check that the closing parentheses is expected.
                Character closing = expectedClosing.pop();
                if (ch[i] != closing) {
                    return false;
                }
            }
        }

        return expectedClosing.empty();
    }

}
