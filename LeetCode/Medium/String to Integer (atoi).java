class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        int i=0;
        char sign='+';
        long ans=0;
        if(n==0){
            return 0;
        }
        while(i<n && arr[i]==' '){
            i++;
        }
        if(i<n && (arr[i]=='-'||arr[i]=='+')){
            sign=arr[i];
            i++;
        }
        while(i<n && arr[i]=='0'){
            i++;
        }
        while(i<n){
            if(arr[i]>='0'&&arr[i]<='9'){
                ans=ans*10+arr[i]-'0';
            }else{
                break;
            }

            if(ans>Integer.MAX_VALUE){
            return   sign!='-'?Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            
            i++;
        }
        return (int) (sign=='-'?-1*ans:ans);
    }
}
