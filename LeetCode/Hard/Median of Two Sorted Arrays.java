package Hard;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] arr=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i];
                i++;
            }
            else{
                arr[k++]=nums2[j];
                j++;
            }
        }
        while(i<n1){
            arr[k++]=nums1[i++];
        }
        while(j<n2){
            arr[k++]=nums2[j++];
        }
        int mid=(n1+n2)/2;
        double ans;
        if ((n1 + n2) % 2 == 0) {
            ans = (double) (arr[mid] + arr[mid - 1]) / 2;
        } else {
            ans = arr[mid];
        }
        return ans;
    }
}
