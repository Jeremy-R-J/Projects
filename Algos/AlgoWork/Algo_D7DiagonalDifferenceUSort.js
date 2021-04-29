/* 
    https://www.hackerrank.com/challenges/diagonal-difference/problem
    Given a square matrix (2d array) of integers
    Calculate the absolute difference between the sums of its diagonals
        - top left to bottom right diagonal
        - top right to bottom left diagonal
    
    EXAMPLE
    let nums = [
        [ 1, 2, 3 ],
        [ 5, 3, 2 ],
        [ 9, 7, 1 ]
    ]
    diagonalDifference(nums) should return 10, because (1 + 3 + 1) - (3 + 3 + 9)
    is 5 - 15, which is -10, whose absolute value is 10
*/
let nums = [    
    [ 1, 2, 3 ],        
    [ 5, 3, 2 ],        
    [ 9, 7, 1 ]
  ]
function diagonalDifference(matrix){
  var diag = 0;
  var diag2 = 0;
  for(var i = 0; i<matrix.length;i++){
    diag += matrix[i][i];
    diag2 += matrix[matrix.length -1 -i][i]
  }
return Math.abs(diag-diag2)
}
diagonalDifference(nums)

/* 
    Union Sorted Arrays
    Efficiently combine two already-sorted multiset arrays
    into a new sorted array containing the multiset union.
    Unions by default will take the set of dupes
    that has the highest occurrences from one array.
    Venn Diagram Visualization (top) https://i.ytimg.com/vi/sdflTUW6gHo/maxresdefault.jpg

    EXAMPLE
    let nums1 = [1, 3, 3, 4, 5, 5, 5 ];
    let nums2 = [2, 3, 5, 6, 6, 7, 9 ];

    orderedMultisetUnion(sortedA, sortedB) should return:
    [1, 2, 3, 3, 4, 5, 5, 5, 6, 6, 7, 9]
*/
function orderedMultisetUnion(sortedA, sortedB){
    
}
/let sortedA = [1, 3, 3, 4, 5, 5, 5 ];
  let sortedB = [2, 3, 5, 6, 6, 7, 9 ];
function orderedMultisetUnion(sortedA, sortedB){
  var union = [...new Set([...sortedA,...sortedB])];
  console.log(union);
    var firstDict = {};
    var secondDict = {};
    for(var i = 0; i<sortedA.length; i++){
      if(!firstDict[sortedA[i]]){
        firstDict[sortedA[i]] = 1;
      } else {
        firstDict[sortedA[i]] += 1;
      }
      if(!secondDict[sortedB[i]]){
        secondDict[sortedB[i]] = 1;
      } else {
        secondDict[sortedB[i]] += 1;
      }
    }
    console.log(firstDict)
    console.log(secondDict)
}

orderedMultisetUnion(sortedA,sortedB)