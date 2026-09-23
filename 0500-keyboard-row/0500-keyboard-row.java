class Solution {
    public String[] findWords(String[] words) {
         int []f = new int[26];
        String F1 = "qwertyuiop";
        String F2 = "asdfghjkl";
        String F3 = "zxcvbnm";
        String[] ans = new String[words.length];
        int k = 0;
        for(int i=0;i<F1.length();i++){
            f[F1.charAt(i) - 'a'] = 1;
        }
        for(int i=0;i<F2.length();i++){
            f[F2.charAt(i) - 'a'] = 2;
        }
        for(int i=0;i<F3.length();i++){
            f[F3.charAt(i) - 'a'] = 3;
        }
        for(String ch : words){
            String sk = ch.toLowerCase();
            int r = f[sk.charAt(0) - 'a'];

        boolean taken = true;  
            for(int i=1;i<sk.length();i++){

                if(r != f[sk.charAt(i) - 'a']){
                    taken = false;
                    break;
                }
                
            }
            if(taken){
                ans[k++] = ch;
            }
        }
        return Arrays.copyOf(ans, k);
    }
}