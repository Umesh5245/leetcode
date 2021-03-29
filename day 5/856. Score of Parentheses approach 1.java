class Solution {
    public int scoreOfParentheses(String S) {
             Stack<Integer> temp=new Stack();
    temp.push(0);
        for(char c:S.toCharArray()){
            if(c=='(')
                temp.push(0);
            else{
                int v=temp.pop();
                int w=temp.pop();
                temp.push(w + Math.max(2*v,1));
            }
        }
        return temp.pop();
    
    }
}