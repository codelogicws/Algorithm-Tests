package ws.codelogic.algorithms.arithmetic.evaluation;

import java.util.Stack;

public class DijkstrasTwoStack {

    private String evaluationString;
    protected Stack<Integer> values;
    protected Stack<Character> operations;

    public DijkstrasTwoStack(String evaluationString){
        this.evaluationString = evaluationString;
        values = new Stack<Integer>();
        operations = new Stack<Character>();
    }

    public String solve(){
        solveFromExpression();
        String solution = "" + values.pop();
        return solution;
    }

    private void solveFromExpression() {
        for (int i = 0; i < evaluationString.length(); i++) {
            char currentChar = evaluationString.charAt(i);
            translateChar(currentChar);
        }
    }

    private void translateChar(char ch) {
        if(ch == ')'){
            workTopProblem();
        }else if(ch == '+'){
            operations.push(ch);
        }else if(ch == '*') {
            operations.push(ch);
        }else if(ch == '/') {
            operations.push(ch);
        }else if(ch == '-'){
            operations.push(ch);
        }else if(ch == '('){
            //do nothing
        }else{
            saveValue(ch);
        }
    }

    private void workTopProblem() {
        int value2 = values.pop();
        int value1 = values.pop();
        char operation = operations.pop();
        int result = operation(value1, value2, operation);
        values.push(result);
    }

    private int operation(int value1, int value2, char operation) {
        int result = 0;
        if(operation == '*'){
            result = value1 * value2;
        }else if(operation == '+'){
            result = value1 + value2;
        }else if(operation == '-'){
            result = value1 - value2;
        }else if(operation == '/'){
            result = value1 / value2;
        }
        return result;
    }

    private void saveValue(char ch) {
        String s = ch+"";
        Integer number = Integer.valueOf(s);
        if(number != null){
            values.push(number);
        }
    }
}
