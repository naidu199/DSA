class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ans=new int[n+1];
        for(int i:arr){
            ans[i]++;
        }
        int miss=-1,reap=-1;
        for(int i=1;i<ans.length;i++){
            if(ans[i]==2){
                reap=i;
            }else if(ans[i]==0){
                miss=i;
            }
            if(miss!=-1&&reap!=-1){
                break;
            }
        }
        return new int[]{reap,miss};
    }
}
