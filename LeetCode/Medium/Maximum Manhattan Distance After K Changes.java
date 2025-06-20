class Solution {
    public int maxDistance(String str, int k) {
        int ans=0;
        int n=0,s=0,e=0,w=0;

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='N') n++ ;
            else if(c=='S') s++;
            else if(c=='E') e++;
            else if(c=='W') w++;

            int y= Math.abs(s-n);
            int x=Math.abs(e-w);
            int dis=x+y;

            int md= dis + Math.min(2*k, i+1 - dis);

            ans=Math.max(ans, md);
        }
        return ans;
    }
}
