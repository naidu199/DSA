class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int c=1,res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]==arr[i-1]+1){
                c++;
            }else{
                c=1;
            }
            res=Math.max(res,c);
        }
        return res;
    }
}
