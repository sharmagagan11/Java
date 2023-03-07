#include <iostream>
using namespace std;

int Binary_Search(int arr[], int size, int key)
{
    int start = 0;
    int end = size - 1;

    while (start <= end)
    {
        int mid = start + (end - start) / 2;

        if (arr[mid] == key)
        {
            return mid;
            // go to right part
        }
        if (arr[mid] < key)
        {
            start = mid + 1;
        }
        else
        // go to left part
        {
            end = mid - 1;
        }
        mid = start + (end - start) / 2;
    }

    return -1;
}
int main()
{
    int odd[7] = {9, 10, 45, 87, 96, 104, 110};
    int even[8] = {10, 20, 30, 40, 50, 60, 70, 80};

    int oddindex = Binary_Search(odd, 7, 104);

    cout << " Index of 104 is : " << oddindex << endl;

    int evenindex = Binary_Search(even, 8, 70);

    cout << " Index of 70 is : " << evenindex << endl;

    return 0;
}