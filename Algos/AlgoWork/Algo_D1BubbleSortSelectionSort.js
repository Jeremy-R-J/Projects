Algo_day1BubblSort / selectionSort
    /* 
        https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/
        Stable sort
        
        Time Complexity
            - Best:     O(n) linear when array is already sorted
            - Average:  O(n^2) quadratic
            - Worst:    O(n^2) quadratic when the array is reverse sorted
        Space: O(1) constant
        For review, create a function that uses BubbleSort to sort an unsorted array in-place.
        For every pair of adjacent indicies, swap them if the item on the left is larger than the item on the right until array is fully sorted
    */
    // function bubbleSort(nums){
    //     x=nums[0]

// }

// void bubble_sort( int x[ ], int i ) {
//     int temp;
//     for(int n= 0; n< i-1; n++) {
//         // (n-k-1) is for ignoring comparisons of elements which have already been compared in earlier iterations

//         for(int i = 0; i < n-k-1; i++) {
//             if(A[ i ] > A[ i+1] ) {
//                 // here swapping of positions is being done.
//                 temp = A[ i ];
//                 A[ i ] = A[ i+1 ];
//                 A[ i + 1] = temp;
//             }
//         }
//     }
// }
function bubbleSort(nums) {
    for (var i = 0; i < nums.length; i++) {
        for (var j = 1; j < nums.length; j++) {
            var temp = nums[i]
            if (nums[0] > nums[1]) {
                temp = nums[1];
                nums[1] = nums[0];
                nums[0] = temp;
            }
            if (nums[i] < nums[j]) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
    }
    return nums;
}
console.log(bubbleSort([2, 5, 7, 0, 1, 3]))
console.log(bubbleSort([3, 8, 8, 0, 9, 3]))
    /* 
        https://visualgo.net/en/sorting
            
        Selection sort works by iterating through the list, finding the minimum
        value, and moving it to the beginning of the list. Then, ignoring the first
        position, which is now sorted, iterate through the list again to find the
        next minimum value and move it to index 1. This continues until all values
        are sorted.
        Unstable sort.
        
        Time Complexity
            - Best: O(n^2) quadratic.
            - Average: O(n^2) quadratic.
            - Worst: O(n^2) quadratic.
        Space: O(1) constant.
        Selection sort is one of the slower sorts.
        - ideal for: pagination, where page 1 displays 10 records for example,
            you run selection sort for 10 iterations only to display the first 10
            sorted items.
    */
function selectionSort(nums) {

}

void selection_sort(int A[], int n) {
    // temporary variable to store the position of minimum element
    int minimum;
    // reduces the effective size of the array by one in  each iteration.
    for (int i = 0; i < n - 1; i++) {
        // assuming the first element to be the minimum of the unsorted array .
        minimum = i
            // gives the effective size of the unsorted  array .
        for (int j = i + 1; j < n; j++) {
            if (A[j] < A[minimum]) { //finds the minimum element
                minimum = j;
            }
        } // putting minimum element on its proper position.
        swap(A[minimum], A[i]);
    }
}