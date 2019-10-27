class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (typed.length()<name.length()){
            return false;
        }
        if (typed.length()==name.length()){
            return typed.equals(name);
        }
        int i=0;
        for (int j=0; j<typed.length(); j++){
            if (i<name.length() && typed.charAt(j)==name.charAt(i)){
                i++;
            }
            else if (j>0 && typed.charAt(j)==typed.charAt(j-1)){
                continue;
            }
            else{
                return false;
            }
        }
        if (i==name.length()){
            return true;
        }
        else{
            return false;
        }
    }
}