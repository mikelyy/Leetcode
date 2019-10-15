class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letter = new ArrayList<>();
        List<String> digit = new ArrayList<>();
        for (String log : logs){
            if (log.split(" ")[1].charAt(0)< 'a'){
                digit.add(log);
            }
            else{
                letter.add(log);
            }
        }
        /// logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
        /// digit = [dig1 8 1 5 1, dig2 3 6] all set with this!
        /// letter = ["let1 art can", "let2 own kit dig", "let3 art zero"] need reorder based on alphabetically
        Collections.sort(letter, (a, b) -> {
            String[] sa = a.split(" ");
            String[] sb = b.split(" ");
            int lensa = sa.length;
            int lensb = sb.length;
            int finallen = Math.min(lensa, lensb);
            for (int i=1; i<finallen; i++){
                if (!sa[i].equals(sb[i])){
                    return sa[i].compareTo(sb[i]);
                }
            }
            return 0;   
        });
        
        /// letter = ["let1 art can", "let3 art zero", "let2 own kit dig"]
        for (int i=0; i<logs.length; i++){
            if (i<letter.size()){
                logs[i]=letter.get(i);
            }
            else{
                logs[i]=digit.get(i-letter.size());
            }
        }
        return logs;
    }
}