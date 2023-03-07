#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int n;

    cout << "Enter the the decimal number " << endl;
    cin >> n;

    int decimalTobinary(int n)
    {    
        int i = 0;
        int ans = 0;

        while (n != 0)
        {
            int bit = n & 1;
            ans = (bit * pow(10, i)) + ans;
            n = n >> 1;
            i++;
        }
    }
    if (n < 0)
    {

        n = n * (-1);
        int newans = (~ans);
        newans = newans + 1;
        cout << "Answer is : " << newans << endl;
    }
    else
    {
        int ans = decimalTobinary(n)
    }
}
