class Solution {
public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for(String token : tokens){
        if(token.equals("+") || token.equals("-") ||
           token.equals("*") || token.equals("/")){

            int b = stack.pop(); // second operand
            int a = stack.pop(); // first operand

            int res = 0;

            if(token.equals("+")) res = a + b;
            else if(token.equals("-")) res = a - b;
            else if(token.equals("*")) res = a * b;
            else res = a / b;

            stack.push(res);
        } else {
            stack.push(Integer.parseInt(token));
        }
    }

    return stack.peek();
}
}
