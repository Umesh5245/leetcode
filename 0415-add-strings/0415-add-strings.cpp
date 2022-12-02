#include <string>	// for string and to_string()

class Solution
{
    public:
        string addStrings(string num1, string num2)
        {
            int a = num1.size() - 1;
            int car = 0;
            int b = num2.size() - 1;
            string s = "";
            while (a >= 0 || b >= 0 || car == 1)
            {
                if (a >= 0)
                {
                    car += num1.at(a) - '0';
                    a--;
                }

                if (b >= 0)
                {
                    car += num2.at(b) - '0';
                    b--;
                }

                s = to_string(car % 10) + s;
                car /= 10;
            }
            return s;
        }
};