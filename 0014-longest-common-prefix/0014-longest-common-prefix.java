class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder(strs[0]);

        for(int i = 1; i<strs.length; i++){
            int idx  = 0;
            String s = new String(strs[i]);
            while(idx < str.length() && idx < s.length()){
               if(str.charAt(idx) != s.charAt(idx)){
                break;
               }
               idx++;
            }
            str.setLength(idx);
        }

        return str.toString();
    }
}