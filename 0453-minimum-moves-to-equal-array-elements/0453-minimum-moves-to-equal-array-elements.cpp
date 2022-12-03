class Solution {
public:
    int minMoves(vector<int>& nums) {
                int sum = 0;
        int minNum = 2147483647;
      
        //> calculate the sum and find the min value
        for(auto n : nums) {
            sum += n;
            if(n < minNum) {
                minNum = n;
            }
        }
            cout<<sum<<endl<<minNum<<endl<<nums.size();
        
        return (sum - (minNum * nums.size()));
    }
};