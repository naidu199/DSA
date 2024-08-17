
class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int n=arr.size();
        int max=0;
        for(int i=0;i<n-1;i++){
            int sum=arr.get(i)+arr.get(i+1);
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
