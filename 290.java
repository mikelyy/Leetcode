class Solution {
    public boolean wordPattern(String pattern, String str) {
        /// abba, dog cat cat fish
        /// abba, dog cat cat dog
        /// abba, dog dog dog dog
        HashMap<Character, String> res = new HashMap();
        HashSet<String> output = new HashSet();
        String [] str1 = str.split(" ");
        /// str1 = dog, cat, cat, fish
        /// str1 = dog, cat, cat, dog
        /// str1 = dog, dog, dog, dog
        if (str1.length!=pattern.length()){
            return false;
        }
        for (int i=0; i<pattern.length(); i++){
            String a = str1[i];
            /// a = dog/cat/cat/fish
            /// a = dog/cat/cat/dog
            /// a = dog/dog/dog/dog
            if (output.add(a)){
                /// no duplicate
                /// dog cat fish
                /// dog cat
                /// dog
                res.put(pattern.charAt(i), a);
                /// res = (a, dog), (b, cat), (a, fish)
                /// res = (a, dog), (b, cat)
                /// res = (a, dog)
            }
        }
        for (int j=0; j<pattern.length(); j++){
            String b = res.get(pattern.charAt(j));
            /// b = dog and fish for j=0 => pattern.charAt(0)==a => res.get(a)==dog and fish
            /// b = cat for j=1 => pattern.charAt(1)==b => res.get(b)==cat
            /// dog&fish cat cat dog&fish
            /// b = dog for j=0 => pattern.charAt(0)==a => res.get(a)==dog
            /// b = cat for j=1 => pattern.charAt(1)==b => res.get(b)==cat
            /// dog cat cat dog
            /// b = dog for j=0 => pattern.charAt(0)==a => res.get(a)==dog
            /// b = null for j=1 => pattern.charAt(1)==b => res.get(b)==null
            if (b==null || !b.equals(str1[j])){
                /// str1[j] = str1[0]=dog
                /// str1[j] = str1[1]=cat
                /// dog cat cat fish
                /// str1[j] = str1[0]=dog
                /// str1[j] = str1[1]=cat
                /// dog cat cat dog
                /// str1[j] = str1[0]=dog
                /// dog dog dog dog 
                return false;
            }
        }
        return true;
    }
}