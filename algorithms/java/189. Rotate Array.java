class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k<0){
            k=k+nums.length;
        }
      reverse(nums,0,nums.length -k-1)  ;
              reverse(nums,nums.length-k,nums.length-1)  ;
      reverse(nums,0,nums.length -1)  ;

    }
    
    public void reverse(int []a,int i,int j){
    for(int low=i,high=j;low<high;low++,high--){
            int temp =a[low];
            a[low]=a[high];
            a[high]=temp;          
        }
    }
}