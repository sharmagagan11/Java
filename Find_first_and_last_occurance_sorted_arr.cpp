#include <iostream>
using namespace std;

int First_Occurance(int arr[], int size, int key)
{
    int start = 0;
    int end = size - 1;
    int ans=1;

    while (start <= end)
    {
        int mid = start + (end - start) / 2;

        if (arr[mid] == key)
        {
            ans = mid;
            end = mid-1;

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

    return ans;
}
int Last_Occurance(int arr[], int size, int key)
{
    int start = 0;
    int end = size - 1;
    int ans=-1;

    while (start <= end)
    {
        int mid = start + (end - start) / 2;

        if (arr[mid] == key)
        {
            ans = mid;
            start = mid + 1;

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

    return ans;
}
int main()
{
    int odd[7] = {9, 10, 10, 22, 33, 100, 110};
    int even[8] = {10, 20, 30, 40, 50, 60, 70, 80};

    int oddindex1 = First_Occurance(odd, 7, 10);

    cout << " Index of 10 is : " << oddindex1 << endl;

     int oddindex2 = Last_Occurance(odd, 7, 10);

    cout << " Index of 10 is : " << oddindex2 << endl;

    //int evenindex = Binary_Search(even, 8, 70);

    //cout << " Index of 70 is : " << evenindex << endl;

    return 0;
}