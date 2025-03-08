class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white=0;
        int ans=0;
        int n=blocks.length();

        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                white++;
            }
        }
        ans=white;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i)=='W'){
                white++;
            }

            if(blocks.charAt(i-k)=='W'){
                white--;
            }

            ans=Math.min(ans,white);
        }

        return ans;
    }
}
