package Interpreter;

public class Interpreter {
    public static Expression parse(String input){
        String[] tokens = input.split(" ");
        Expression result = new NumberExpression(Integer.parseInt(tokens[0]));

        for(int i = 1;i<tokens.length;i+=2){
            char operator = tokens[i].charAt(0);
            Expression right = new NumberExpression(Integer.parseInt(tokens[i+1]));
            result = new OperationExpression(result,right,operator);
        }
        return result;
    }

    public static void main(String[] args) {
        Expression expression = Interpreter.parse("5 + 2 - 3");
        System.out.println(expression.interpret());
    }
}