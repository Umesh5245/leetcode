class Solution
{
    public:
        int fib(int n)
        {
            if (n < 2) return n;

            int prev1 = 1, prev2 = 0;
            for (int i = 2; i <= n; i++)
            {
                int temp = prev1;
                prev1 += prev2;
                prev2 = temp;
            }

            return prev1;
        }
};