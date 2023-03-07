// LEETCODE Problem Number 854
// Peak Index in a Mountain Array
// 3 condition
/* 
1 condition 
arr[mid]<arr[mid+1]{
    start = mid +1
}
2 condition 
arr[mid] == largest {
    return mid

}
3 condition 
arr[mid] > arr[mid+1]{
    end = mid bhi ho  sakta h or mid-1 bhi
    return end

}
*/
class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int start =0;
        int end= arr.size()-1;

        int mid = start+(end-start)/2;


        while(start <end){
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
            mid = start +(end-start)/2;
        }
        return start;        
    }
};