class Solution {
    public long coloredCells(int n) {
      if(n==1)  return 1;
      return 2L*n*(n-1)+1;
    }
}

---OR---
  
class Solution {
    public long coloredCells(int n) {
    long ans=1;
        for(int i=0;i<n;i++){
            ans+=(long) (4*i);
        }
        return ans;
    }
}
