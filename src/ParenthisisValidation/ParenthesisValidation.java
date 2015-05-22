package ParenthisisValidation;

import java.util.Stack;

public class ParenthesisValidation {

    Stack<String> parentheses = new Stack<String>();
    private static final char[] openParentheses = {'(', '{', '['};
    private static final char[] closeParentheses = {')', '}', ']'}

    public boolean hasValidParenthese(String s){
        for(int i=0;i<s.length();i++){
            recordParenthesis()
        }
    }

}
