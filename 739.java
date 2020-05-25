class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack();
        for (int i=0; i<T.length; i++){
            if (stack.isEmpty()){
                stack.push(i);
            }
            else if (T[i]<=T[stack.peek()]){
                stack.push(i);
            }
            else{
                while(!stack.isEmpty() && T[i]>T[stack.peek()]){
                    res[stack.peek()] = i-stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return res;
    }
}