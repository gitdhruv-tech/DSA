class Solution {
    public boolean isAnagram(String s, String t) {
        int[] F1 = new int[26];
        int[] F2 = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        int i = 0;
        while(i<s.length()){
            F1[s.charAt(i) - 'a'] = F1[s.charAt(i) - 'a'] + 1;
            F2[t.charAt(i) - 'a'] = F2[t.charAt(i) - 'a'] + 1;
            i++; 
        }
        return Arrays.equals(F1, F2);
    }
}