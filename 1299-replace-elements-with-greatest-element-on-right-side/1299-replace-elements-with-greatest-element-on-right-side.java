class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(res[i] < arr[j]){
                    res[i] = arr[j];
                }
            }
        }
        res[arr.length - 1] = -1;
        return res;
    }
}