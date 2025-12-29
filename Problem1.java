//Missing Number in Sorted Array of Natural Numbers
//https://www.geeksforgeeks.org/problems/missing-number-in-sorted-array-of-natural-numbers/1

//Time: O(log n)
//Space: O(1)

class Solution {
    int missingNum(int arr[]) {
        
        //[1,2,3,5]
        
        // code here
        int low=0;
        int high = arr.length-1;
        
        while(low <= high) {
            int mid = low + (high-low) /2;
            
            if(arr[mid] == mid+1) {
                //missing element is in the right half
                //move low to mid+1
                low = mid+1;
            }
            else {
                // missing element in the left half
                // move high to mid-1
                high = mid-1;
            }
        }
        
        return low+1;
    }
}
