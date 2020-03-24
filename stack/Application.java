package stack;

import java.util.Stack;

public class Application {
    /*
    Given a string of numbers and operations (+ or *) representing an operation between
    numbers, return the result
    example s = ((1+(3*4)+(4+1)))
     */
    public static double operationResult(String s){
        Stack<Double> value = new Stack<>();
        Stack<String> operation = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') continue;
            if(c == '*' || c == '+'){
                operation.add(c+"");continue;
            }
            if(c == ')'){
                String y = operation.pop();
                if(y.equals("+")){
                    value.add(value.pop()+value.pop());
                }else{
                    value.add(value.pop()*value.pop());
                }
                ;
            }
            if(c<='9' && c>= '0'){
                value.add(Double.parseDouble(c+""));
            }
        }
        return value.pop();
    }

    public static void main(String[]args){
                System.out.println(operationResult(" ((1+(3*4)+(4+1)))"));
    }
}
