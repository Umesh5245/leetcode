#include <algorithm>
#include <iostream>

class Solution
{
    public:
        string longestCommonPrefix(vector<string> &strs)
        {
            string s = "";
           	// Base condition
            if (strs.empty())
            {
                return s;
            }
           	// Find the minimum length string from the array
            int minimumLength = strs[0].size();
            for (int i = 1; i < strs.size(); i++)
            {
                int len = strs[i].length();
                minimumLength = std::min(minimumLength, len);
            }
            for (int i = 0; i < minimumLength; i++)
            {
                char current = strs[0].at(i);
                for (string str: strs)
                {
                    if (str.at(i) != current)
                    {
                        return s;
                    }
                }
                s += current;
            }
            return s;
        }
};