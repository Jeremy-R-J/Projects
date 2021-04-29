/* 
  Array: Binary Search (non recursive)
  Given a sorted array and a value, return the index of that value, or -1 if not found.
  Do not sequentially iterate the array. Instead, ‘divide and conquer’,
  taking advantage of the fact that the array is sorted .
*/

/**
 * Efficiently determines if the given num exists in the given array.
 * - Time: O(?).
 * - Space: O(?).
 * @param {Array<number>} sortedNums
 * @param {number} searchNum
 * @return {number} The index of the given num in in the given array or -1 if absent.
 */
function binarySearch(sortedNums, searchNum) {}

const nums1 = [1, 3, 5, 6];
const searchNum1 = 4;
const expected1 = -1;

const nums2 = [4, 5, 6, 8, 12];
const searchNum2 = 5;
const expected2 = 1;

const nums3 = [3, 4, 6, 8, 12];
const searchNum3 = 3;
const expected3 = 0;
//             0  1  2  3  4   5   6   7   8  9   10
const nums4 = [1, 3, 5, 8, 9, 12, 16, 19, 22, 25, 27];
const searchNum4 = 9;
const expected4 = 4;

module.exports = { binarySearch };

/*****************************************************************************/

function binarySearch(sortedNums, searchNum) {

    var arrtemp = []

    if (sortedNums[sortedNums.length / 2] == searchNum) {
        return (true)
    }
    if (sortedNums[sortedNums.length / 2] < searchNum) {

    }


}
//if middle number is ==to expected num return num
//1/2 length of array at middle index
//create new array for less than or greater than side
//
//if expected number >< if else run function again for that array
//while loop for splitting array in 2


// find out if a key x exists in the sorted array A
// or not using binary search algorithm
public static int binarySearch(sortedNums, searchNum) {
    // search space is A[left..right]
    int left = 0, right = A.length - 1;

    // till search space consists of at-least one element
    while (left <= right) {
        // we find the mid value in the search space and
        // compares it with key value

        int mid = (left + right) / 2;

        // overflow can happen. Use:
        // int mid = left + (right - left) / 2;
        // int mid = right - (right - left) / 2;

        // key value is found
        if (x == A[mid]) {
            return mid;
        }

        // discard all elements in the right search space
        // including the mid element
        else if (x < A[mid]) {
            right = mid - 1;
        }

        // discard all elements in the left search space
        // including the mid element
        else {
            left = mid + 1;
        }
    }

    // x doesn't exist in the array
    return -1;
}