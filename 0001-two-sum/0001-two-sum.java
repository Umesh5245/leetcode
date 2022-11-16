class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp1=target-nums[i];
            if(map.containsKey(temp1)){
                return new int[]{map.get(temp1),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;        
    }
}