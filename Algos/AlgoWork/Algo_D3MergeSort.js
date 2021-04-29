// function merge(nums1, nums2) {
//     let newArray = []
//     let nums1Index = 0
//     let nums2Index = 0
//     while (nums1Index < nums1.length || nums2Index < nums2.length) {
//         if (nums1[nums1Index] <= nums2[nums2Index]) {
//             newArray.push(nums1[nums1Index])
//             nums1Index++
//         } else {
//             newArray.push(nums2[nums2Index])
//             nums2Index++
//         }
//     }
//     return newArray


// }
// function mergeSort(array){
//     const half=array.length/2

//     if(array.length<2){
//     return array}

//     }
//     const nums1 = array.splice(0,half)
//     return merge(mergeSort(nums1), mergeSort(array))

//     function merge(nums1, nums2){
//         let newArray = []
//         let nums1Index = 0
//         let nums2Index = 0
//         while (nums1Index < nums1.length || nums2Index < nums2.length) {
//             if (nums1[nums1Index] <= nums2[nums2Index]) {
//                 newArray.push(nums1[nums1Index])
//                 nums1Index++
//             } else {
//                 newArray.push(nums2[nums2Index])
//                 nums2Index++
//             }
//         }
//         return newArray
//     }

// function mergeSort(array) {
//     const half = array.length / 2

//     // Base case 
//     if (array.length < 2) {
//         return array
//     }

//     const left = array.splice(0, half)
//     return merge(mergeSort(left), mergeSort(array))
// }
// console.log(merge([1, 4, 5, 9, 10], [2, 3, 6, 7, 8]))
// /* 
//     MERGE SORT
//     Stable sort.
//     Visualization:
//     https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/visualize/
//     Time Complexity
//         - Best case: O(n log(n)) linearithmic.
//         - Average case: O(n log(n)) linearithmic.
//         - Worst case: O(n log(n)) linearithmic.
//     Space: O(n) linear
//     steps:
//         1. create a merge function to merge two already sorted arrays into a single
//             sorted array.
//         - you do NOT need to work in place, ok to use a new array
//     EXAMPLE: merge([1,4,5], [2,3,6]) will return [1,2,3,4,5,6]
// */
// function merge(nums1, nums2) {

// }
// /*
//         2. create mergeSort function to sort the provided array
//         - split the array in half and recursively merge the halves using the
//             previously created merge function.
//         - splitting of arrays stops when array can no longer be split.
//         - an array of 1 item is by definition sorted, so two arrays of 1 item
//             can therefore be merged into a sorted array.
// */
// function mergeSort( /*what kind of parameters might we need here? */ ) {

// }

// // Recursion sample: 
// function sum(num) {
//     if (num === 1) { // this is our base case, because once num hits 1, we don't want to keep reducing it, as it doesn't add more information that's useful or accurate
//         return 1;
//     }

//     return num + sum(num - 1); // this is our recursive case, because it's where the function calls itself
// }

function merge(nums1, nums2) {
    var nums3 = [];
    var x = 0;
    var y = 0;
    for (let i = 0; i < nums1.length + nums2.length; i++) {
        if (x <= nums1.length && y <= nums2.length && nums1[x] <= nums2[y]) {
            nums3.push(nums1[x]);
            x++;
        } else if (x <= nums1.length && y <= nums2.length && nums1[x] > nums2[y]) {
            nums3.push(nums2[y]);
            y++;
        } else if (x > nums1.length - 1) {
            nums3.push(nums2[y]);
            y++;
        } else if (y > nums2.length - 1) {
            nums3.push(nums1[x]);
            x++;
        }
    }
    return nums3;
}

function mergeSort(nums) {
    if (nums.length <= 1) {
        return nums;
    }
    let nums2 = [];
    let nums3 = [];
    for (let i = 0; i < nums.length; i++) {
        if (i < nums.length / 2) {
            nums2.push(nums[i]);
        } else {
            nums3.push(nums[i]);
        }
    }
    nums2 = mergeSort(nums2);
    nums3 = mergeSort(nums3);

    return merge(nums2, nums3);
}