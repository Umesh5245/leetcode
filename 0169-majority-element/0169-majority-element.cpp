#include <iostream>
#include <algorithm>

class Solution
{
    public:
        int majorityElement(vector<int> &demo)
        {
            sort(demo.begin(), demo.end());
            return demo[demo.size() / 2];
        }
};