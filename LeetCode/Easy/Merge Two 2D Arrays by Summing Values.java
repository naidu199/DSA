class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> list=new ArrayList<>();
        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            int id1=nums1[i][0];
            int id2=nums2[j][0];

            if(id1>id2){
                list.add(nums2[j]);
                j++;
            }else if(id1<id2){
                list.add(nums1[i]);
                i++;
            }else{
                list.add(new int[]{id1,nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
        }

        while(i<nums1.length){
            list.add(nums1[i++]);
        }

        while(j<nums2.length){
            list.add(nums2[j++]);
        }

        int[][] ans= new int[list.size()][2];

        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }
        return ans;
    }
}
