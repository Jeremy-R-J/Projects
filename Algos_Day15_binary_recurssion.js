/*
  Recursive Binary Search
  Input: SORTED array of ints, int value
  Output: bool representing if value is found
  Recursively search to find if the value exists, do not loop over every element.
  Approach:
  Take the middle item and compare it to the given value.
  Based on that comparison, narrow your search to a particular section of the array
*/


//base case 1: number is found -- return true
//base case 2: length of slice = ?
//hello room 4
// function binarySearch(sortedNums, searchNum, leftIdx = 0, rightIdx = sortedNums.length - 1) {
//   //mid point of arr 
//   //first if statement if the number is equal to the mid point return true
//   //then two if statements to check if our number is bigger or smaller then the mid arr point
//   //return binary search
//   midIdx=((rightIdx-leftIdx)/2)+(leftIdx)
//   midpoint= sortedNums[midIdx] 
//   if searchNum==midpoint
//     return true
//   if sear



// 

const nums1 = [1, 3, 5, 6];
const searchNum1 = 4;
const expected1 = false;

const nums2 = [4, 5, 6, 8, 12];
const searchNum2 = 5;
const expected2 = true;

const nums3 = [3, 4, 6, 8, 12];
const searchNum3 = 12;
const expected3 = true;

function binarySearchA(sortedNums,searchNum,leftIdx = 0,rightIdx = sortedNums.length - 1) {
  mid = Math.floor((leftIdx + rightIdx)/2); // midpoint of our slice
  console.log("search=", searchNum, "midval=", sortedNums[mid], "left=", leftIdx, "midpos=", mid, "right=", rightIdx); // troubleshooting
  if (sortedNums[mid]==searchNum) return true; // if found, return true
  if (mid == leftIdx || mid == rightIdx) return false; // following above if found, return false if mid is equal to either index, as it will stack overflow
  if (sortedNums[mid]>searchNum) return binarySearchA(sortedNums,searchNum,leftIdx,mid); // if arr[mid] > searchNum, slice is on the left side. rightIdx = mid
  if (sortedNums[mid]<searchNum) return binarySearchA(sortedNums,searchNum,mid,rightIdx);// if arr[mid] < searchNum, slice is on the right side. leftIdx = mid
}

console.log(binarySearchA(nums1,searchNum1));
console.log(binarySearchA(nums2,searchNum2));
console.log(binarySearchA(nums3,searchNum3));






// 












/*****************************************************************************/

/**
 * Recursively performs a binary search (divide and conquer) to determine if
 * the given sorted nums array contains the given number to search for.
 * - Time: O(log n) logarithmic due to divide and conquer approach.
 * - Space: O(1) constant.
 * @param {Array<number>} sortedNums
 * @param {number} searchNum
 * @param {number} leftIdx The left index of the current slice of the array
 *    that is being searched.
 * @param {number} rightIdx The right index of the current slice of the array
 *    that is being searched.
 * @return {boolean} Whether the searchNum was found in the sortedNums array.
 */
// function binarySearch(
//   sortedNums,
//   searchNum,
//   leftIdx = 0,
//   rightIdx = sortedNums.length - 1
// ) {

// }
// (// edited)

// M// essage #🏫cohort-sadie