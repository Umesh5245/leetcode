class Solution
{
    public:
        vector<int> productExceptSelf(vector<int> &nums)
        {
            int sum = 1;
            vector<int> result(nums.size());
            for (int i = 0; i < nums.size(); i++)
            {
                result[i] = sum;
                sum = sum *nums[i];
            }
            sum = 1;
            for (int i = nums.size() - 1; i >= 0; i--)
            {
                result[i] = sum *result[i];
                sum = sum *nums[i];
            }
            return result;
        }
};