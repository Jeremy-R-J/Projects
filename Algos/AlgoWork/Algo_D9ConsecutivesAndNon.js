/* 
    Given an array of ints, find all the non-consecutive integers
    A number is non-consecutive if it is NOT exactly 1 larger than the previous element.
    The first element is never considered non-consecutive.
    Return an array of objects where each object contains the number itself
    and it's index.
    
    EXAMPLE:
    let arr = [1,3,4,5,6,8,9,11];

    allNonConsecutive(arr) should return:
    [
        { i: 1, n: 3 },
        { i: 5, n: 8 },
        { i: 7, n: 11 }
    ]
*/
function allNonConsecutive(sortedNums){
    const dictArray=[];
    var dict={};
    for (var j =1; j<sortedNums.length; j++){
        if (sortedNums[j]-1 !==sortedNums[j-1]){
        dict= {i: j,n:sortedNums[j]}
        dictArray.push(dict);

    }
}
    return dictArray
}
let arr = [1,3,4,5,6,8,9,11];
console.log(allNonConsecutive(arr));


/* 
    You are given a list of integers. Find all the consecutive sets of 
    integers that adds up to the sum passed in as one of the inputs.

    EXAMPLE:
    let arr = [2, 5, 3, 6, 7, 23, 12];
    let targetSum = 16;

    findConsqSums(arr, targetSum) should return:
    [
        [2, 5, 3, 6],
        [3, 6, 7]
    ] 
*/
function findConsqSums(nums, sum){
    
    var currentSum=0;
    var curArray=[];
    for (var i =0; i<nums.length; i++){
        const sumArray=[];
        
        currentSum=0;{
            for (var j =i;j<nums.length; j++){
                currentSum +=nums[j];
                sumArray.push(nums[j]);
                if (currentSum==sum){
                    curArray.push(sumArray);
                    break;
                }
            }
        }
    }
    return curArray;
}
let arr = [2, 5, 3, 6, 7, 23, 12];
let targetSum = 16;
console.log(findConsqSums(arr,targetSum));