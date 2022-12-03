class Solution
{
    public:
        string convertToTitle(int n)
        {
            string ans = "";
            while (n > 0)
            {
                --n;
                int d = n % 26;
                n /= 26;
                char c = 'A' + d;
                ans =c+ ans;
            }
            return ans;
        }
};