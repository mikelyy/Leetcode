class Solution {
    public int compress(char[] chars) {
        int indexcurr = 0;
        int indexres = 0;
        while (indexcurr<chars.length){
            char c = chars[indexcurr];
            int count = 1;
            while (indexcurr+1<chars.length && chars[indexcurr+1] == c){
                indexcurr++;
                count++;
            }
            chars[indexres++]=c;
            indexcurr++;
            if (count==1){
                continue;
            }
            for (char n: String.valueOf(count).toCharArray()){
                chars[indexres++] = n;
            }
        }
        return indexres;
    }
}