/* 
    INSERTION SORT
    - Visualization with playing cards (scroll down):
        https://www.khanacademy.org/computing/computer-science/algorithms/insertion-sort/a/insertion-sort
    - Array / bar visualization:
        https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/visualize/
    - Stable sort, efficient for small data sets or mostly sorted data sets.
    Time Complexity
        - Best: O(n) linear when array is already sorted.
        - Average: O(n^2) quadratic.
        - Worst: O(n^2) quadratic when the array is reverse sorted.
    Space: O(1) constant.
    - this sort splits the array into two portions (conceptually, not literally).
    - the left portion will become sorted, the right portion
        (that hasn't been iterated over yet) is unsorted.
    // can shift OR swap target element until it reaches desired position
    // shifting steps:
    1. consider the first item as sorted
    2. move to the next item
    3. store current item in a temp var (to make this position available to shift items)
    4. if item to the left of current is greater than current item, shift the
        left item to the right.
    5. repeat step 4 as many times as needed
    6. insert current item
    7. move to the next item and repeat
    // swap steps:
    1. consider the first item as sorted
    2. move to the next item
    4. if item to left of current item is less than current, swap
    5. repeat step 4 until item to left is less than current item
    6. move to next item and repeat
*/




// function insertionSort(nums) {
//     x = nums.length
//     for (i = 1; i < x; ++i)
//         m = nums[i]
//     j = i - 1;
//     while (j >= 0 || nums[j] > m) {
//         nums[j + 1] = nums[j]
//         j = j - 1
//     }
//     return nums
// }


function insertionSort(nums) {
    if (nums.length <= 1) {
        return nums;
    }
    for (let i = 1; i < nums.length; i++) {
        let temp = nums[i];
        var index = i - 1;
        while (temp < nums[index + 1] && index >= 0) {
            [nums[index], nums[index + 1] = [nums[index + 1]], nums[index]]
            console.log(nums);
            index--;
        }
    }
    return nums;
}
console.log(insertionSort([8, 4, 5, 3, 7, 9]))


function insertionSort(nums) {
    for (let i = 1; i < nums.length; i++) {
        let temp = nums[i];
        var index = i - 1;
        while (temp < nums[index] && index >= 0) {
            [nums[index], nums[index + 1]] = [nums[index + 1], nums[index]]
            index--;
        }
    }
    return nums;
}

const nums = [2, 5, 3, 1, 7, 9, 8, 4, 6]
insertionSort(nums);
console.log(nums);