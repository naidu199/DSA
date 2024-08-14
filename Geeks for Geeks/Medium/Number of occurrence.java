package Medium;

class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int count=0;
        for(int i:arr){
            if(i==x){
                count++;
            }
        }
        return count;
    }
}
