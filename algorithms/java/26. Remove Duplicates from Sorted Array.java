class Solution {
    public int removeDuplicates(int[] nums) {
    int inseri=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
            nums[inseri]=nums[i];
                inseri++;
            }
        }
        return inseri;
    }
}