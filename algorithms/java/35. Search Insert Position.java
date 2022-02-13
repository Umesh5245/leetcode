class Solution {
    public int searchInsert(int[] nums, int target) {
         int pivot=0, left=0,right=nums.length-1,ans =0;
        while(left<=right){
            pivot=(left+right)/2;
            if(nums[pivot]==target) return pivot;
            if(nums[pivot]<target){ 
                left=pivot+1;               }
            else{
               right=pivot-1;}
        }
        return right+1;
    }
}