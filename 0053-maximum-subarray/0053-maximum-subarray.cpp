class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int total =nums[0];
            int max=nums[0];
            for(int i=1;i<nums.size();i++){
                    total=std::max(nums[i],nums[i]+total);
                    max=std::max(total,max);
            }
            return max;
    }
};