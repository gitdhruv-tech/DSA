class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;
        for(int i = 0; i < salary.length; i++){
            sum += salary[i];
            if(min > salary[i]){
                min = salary[i];
            }
            if(max < salary[i]){
                max = salary[i];
            }
        }
        sum = sum - min - max;
        double avg = (double) sum / (salary.length - 2);
        return avg;
    }
}