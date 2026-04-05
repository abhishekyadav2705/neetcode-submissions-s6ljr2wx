class Solution {
public int evalRPN(String[] tokens) {
  int[] stack = new int[tokens.length];
  int top =-1;
  for(String token : tokens){
    if(isOperator(token)){
      int b =stack[top--];
      int a = stack[top--];
      int result = apply(a,b,token);
      stack[++top]=result;
    }else{
      stack[++top]=Integer.parseInt(token);
    }
  }
  return stack[top];
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
