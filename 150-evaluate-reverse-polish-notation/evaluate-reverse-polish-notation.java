class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String a:tokens){
            if(a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/") ){
                int c=stack.pop();
                int b=stack.pop();
                int r=0;
                switch(a){
                    case "+": r=b+c; break;
                    case "-": r=b-c; break;
                    case "*": r=b*c; break;
                    case "/": r=b/c; break;
                }
                stack.push(r);
            }
            else{
                stack.push(Integer.parseInt(a));
            }
        }
        return stack.pop();
    }
}