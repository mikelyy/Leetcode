class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> res = new HashMap();
        
        /// ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
        for (String domain: cpdomains){
            /// separate by any space
            String[] a = domain.split("\\s+");
            /// ["900", "google.mail.com"]
            
            /// separate by dot
            /// "google.mail.com"
            String[] b = a[1].split("\\.");
            /// ["google", "mail", "com"]
            int count = Integer.valueOf(a[0]);
            /// count = 900
            
            String output = "";
            for (int i = b.length-1; i>=0; i--){
                if (i<b.length-1){
                    output = b[i] + "."+ output;
                    /// output= mail.com, google.mail.com
                }
                else{
                    output = b[i] + "" +output;
                    /// output= com
                }
                res.put(output, res.getOrDefault(output,0)+count);
                 
            }
        }
        
        List<String> result = new ArrayList();
        for (String m: res.keySet()){
            result.add(""+res.get(m) + " "+m);
            
        }
        return result;
    }
}