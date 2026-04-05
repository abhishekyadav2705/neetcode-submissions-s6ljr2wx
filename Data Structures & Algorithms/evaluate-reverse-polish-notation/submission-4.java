class Solution {
public int evalRPN(String[] tokens) {
  Deque<Integer> stack = new ArrayDeque<>();

  for(String token : tokens){
    if(isOperator(token)){
      int b =stack.pop();
      int a = stack.pop();
      int result = apply(a,b,token);
      stack.push(result);
    }else{
      stack.push(Integer.parseInt(token));
    }
  }
  return stack.peek();
}
}
public boolean isOperator(String token){
    return token.equals("+")||token.equals("-")
    || token.equals("*") || token.equals("/");
  }

  public int apply(int a,  int b, String op){
    switch(op){
      case "+": return a+b;
      case "-": return a-b;
      case "*": return a*b;
      default : return a/b;
    }
  }
