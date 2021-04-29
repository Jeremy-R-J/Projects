/* 
  Given an array of integers
  return the first integer from the array that is not repeated anywhere else
  If there are multiple non-repeated integers in the array,
  the "first" one will be the one with the lowest index.
*/

const nums1 = [3, 5, 4, 3, 4, 6, 5];
const expected1 = 6;

const nums2 = [3, 5, 5];
const expected2 = 3;

const nums3 = [3, 3, 5];
const expected3 = 5;

const nums4 = [5];
const expected4 = 5;

const nums5 = [];
const expected5 = null;

/**
 * Finds the first int from the given array that has no duplicates. I.e., the
 *    item at the lowest index that doesn't appear again in the given array.
 * - Time: O(?).
 * - Space: O(?).
 * @param {Array<number>} nums
 * @return {number|null} The first int value from the given array that has no
 *    dupes or null if there is none.
 */
function firstNonRepeated(nums) {}

module.exports = { firstNonRepeated };


const nums1 = [3, 5, 4, 3, 4, 6, 5];
const expected1 = 6;

const nums2 = [3, 5, 5];
const expected2 = 3;

const nums3 = [3, 3, 5];
const expected3 = 5;

const nums4 = [5];
const expected4 = 5;

const nums5 = [];
const expected5 = null;

/**
 * Finds the first int from the given array that has no duplicates. I.e., the
 *    item at the lowest index that doesn't appear again in the given array.
 * - Time: O(?).
 * - Space: O(?).
 * @param {Array<number>} nums
 * @return {number|null} The first int value from the given array that has no
 *    dupes or null if there is none.
 */

//start with for loop connecting array to object
//object will have key = array[i]: value = [index, counter]
//use if (obj.hasOwnProperty(array[i]) to check if we need to increment counter
function firstNonRepeated(nums) {
    var obj = {};
    var lowestIndex = nums.length;
    for (var i = 0; i < nums.length; i++) {
        if (obj.hasOwnProperty(nums[i])) {
            obj[nums[i]][1]++;
        } else {
            obj[nums[i]] = [i, 0];
        }
    }
    for (var key in obj) {
        if (obj[key][1] == 0) {
            if (obj[key][0] < lowestIndex) {
                lowestIndex = obj[key][0];
            }
        }
    }
    if (lowestIndex == nums.length) {
        return null;
    } else {
        return nums[lowestIndex];
    }
}

c




module.exports = { firstNonRepeated };

function getUnique(arr) {
    var arr2 = []
    for (i = 0; i < arr.length; i++) {
        for (j = 0; j < arr.length; j++) {
            if (i === j) {
                continue;
            }
            if (arr[i] === arr[j]) {
                break;
            }
        }
        if (j == arr2) {
            arr2.push(arr[i]);

        }
    }
    return arr2;
}
console.log(getUnique([5, 5, 4, 4, 3]))