class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l=1,r=(long) Arrays.stream(ranks).min().getAsInt() * cars *cars;

        while(l<r){
            long mid=(l+r)/2;

            if(isPossible(ranks,cars,mid)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }

    public boolean isPossible(int[] ranks, int cars, long time){
        long total=0;
        for(int rank: ranks){
            total +=Math.sqrt(time/rank);
            if(total>=cars) return true;
        }
        return false;
    }
}
