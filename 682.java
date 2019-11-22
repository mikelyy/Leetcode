class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> res = new Stack();
        int result = 0;
        for (String m : ops){
            if (m.equals("+")){
                int a = res.pop();
                int b = a + res.peek();
                res.push(a);
                res.push(b);
            }
            else if(m.equals("C")){
                res.pop();
            }
            else if(m.equals("D")){
                res.push(2*res.peek());
            }
            else{
                res.push(Integer.valueOf(m));
            }
        }
        for (int n : res){
            result+=n;
        }
        return result;
    }
}