class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int n = s.length();
        for (int i=0; i<n-1; i++){
            int cur = getVal(s.charAt(i));
            int next = getVal(s.charAt(i+1));
            if (cur<next){
                res -= cur;
            }
            else{
                res += cur;
            }   
        }
        int finalone = getVal(s.charAt(n-1));
        return res + finalone;
    }
    
    
    private int getVal(char a) {
        int answer = 0;
        if (a == 'I'){
            answer = 1;
        }
        if (a == 'V'){
            answer = 5;
        }
        if (a == 'X'){
            answer = 10;
        }
        if (a == 'L'){
            answer = 50;
        }
        if (a == 'C'){
            answer = 100;
        }
        if (a == 'D'){
            answer = 500;
        }
        if (a == 'M'){
            answer = 1000;
        }
        return answer;
    }
}