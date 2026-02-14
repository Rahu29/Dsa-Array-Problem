void main() {
    String s1 = "(()";
    String s2 = ")()())";
    String s3 = "";

    IO.println("S1 --> "+ longestValidParentheses(s1));
    IO.println("S2 --> "+ longestValidParentheses(s2));
    IO.println("S3 --> "+ longestValidParentheses(s3));
}

public int longestValidParentheses(String s) {
    Stack<Integer> stack = new Stack<>();
    int res = 0;

    stack.push(-1);

    for(int i=0; i<s.length(); i++){
        char currentChar = s.charAt(i);
        if(currentChar == '('){
            stack.push(i);
        } else {
            stack.pop();
            if(stack.isEmpty()){
                stack.push(i);
            } else {
                int length = i-stack.peek();
                res = Math.max(length, res);
            }
        }
    }
    return res;
}
