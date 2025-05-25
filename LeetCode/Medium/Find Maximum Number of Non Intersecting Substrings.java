class Solution {
    public int maxSubstrings(String word) {
        int len=word.length();

        int[] arr=new int[26];
        Arrays.fill(arr,-1);
        int c=0;
        for(int i=0;i<len;i++){
            int charI=word.charAt(i)-'a';
            if(arr[charI]!=-1 && i-arr[charI]+1>=4){
                c++;
                Arrays.fill(arr,-1);
            }else{
                if(arr[charI]==-1){
                    arr[charI]=i;
                }
            }
        }
        return c;
    }
}
