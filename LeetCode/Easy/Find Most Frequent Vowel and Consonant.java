class Solution {
    public int maxFreqSum(String s) {
        int maxV=0;
        int maxC=0;
        int[] arr=new int[26];
        String vowel="aeiou";
        for(char c: s.toCharArray()){
            arr[c-'a']++;
            if(vowel.indexOf(c)==-1){
                maxC=Math.max(maxC,arr[c-'a']);
            }else{
                maxV=Math.max(maxV,arr[c-'a']);
            }
        }
        return maxV+maxC;
    }
}
