class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0; i < sentences.length; i++){
            int count = 0;
            int j = 0;
            while(j < sentences[i].length()){
                if(sentences[i].charAt(j) == ' '){
                    count++;
                }
                j++;
            }
            if(count + 1 > max){
                max = count + 1;
            }
        }
        return max;
    }
}