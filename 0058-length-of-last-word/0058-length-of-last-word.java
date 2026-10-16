class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder str = new StringBuilder();
        int len = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(str.length() > 0){
                    len = str.length();
                }
                str.setLength(0);
            }else{
                str.append(s.charAt(i));
            }
        }
        if(len != str.length() && str.length() != 0){
            return str.length();
        }
        return len;
    }
}