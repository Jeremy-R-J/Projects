/* 
  String: Is Palindrome
  Create a function that returns a boolean whether the string is a strict palindrome. 
    - palindrome = string that is same forwards and backwards
  
  Do not ignore spaces, punctuation and capitalization
 */

const str1 = "a x a";
const expected1 = true;

const str2 = "racecar";
const expected2 = true;

const str3 = "Dud";
const expected3 = false;

const str4 = "oho!";
const expected4 = false;

/**
 * Determines if the given str is a palindrome (same forwards and backwards).
 * - Time: O(?).
 * - Space: O(?).
 * @param {string} str
 * @return {boolean} Whether the given str is a palindrome or not.
 */
function isPalindrome(str) {}

module.exports = { isPalindrome };

/*****************************************************************************/
Ninja Bonus:

    /* 
      Longest Palindrome
      For this challenge, we will look not only at the entire string provided, but also at the substrings within it. Return the longest palindromic substring. 
      Strings longer or shorter than complete words are OK.
      All the substrings of "abc" are:
      a, ab, abc, b, bc, c
    */

    const { isPalindrome } = require("./isPalindrome");

const str1 = "what up, daddy-o?";
const expected1 = "dad";

const str2 = "uh, not much";
const expected2 = "u";

const str3 = "Yikes! my favorite racecar erupted!";
const expected3 = "e racecar e";

/**
 * Finds the longest palindromic substring in the given string.
 * - Time: O(?).
 * - Space: O(?).
 * @param {string} str
 * @return {string} The longest palindromic substring from the given string.
 */
function longestPalindromicSubstring(str) {}

module.exports = { longestPalindromicSubstring };


/* 
  String: Is Palindrome
  Create a function that returns a boolean whether the string is a strict palindrome. 
    - palindrome = string that is same forwards and backwards
  
  Do not ignore spaces, punctuation and capitalization
 */
function isPalindrome(str) {
    testStr = '';

    for (var i = str.length - 1; i >= 0; i--) // decrements through string (backwards)
    {
        testStr += str[i] //saves test string
            // if (str[i] == testStr[i])

        // testStr = testStr + str[i]
    }
    return str == testStr
}

const str1 = "a x a";
const expected1 = true;

const str2 = "racecar";
const expected2 = true;

const str3 = "Dud";
const expected3 = false;

const str4 = "oho!";
const expected4 = false;

console.log(isPalindrome(str1))
console.log(isPalindrome(str2))
console.log(isPalindrome(str3))
console.log(isPalindrome(str4))

/**
 * Determines if the given str is a palindrome (same forwards and backwards).
 * - Time: O(?).
 * - Space: O(?).
 * @param {string} str
 * @return {boolean} Whether the given str is a palindrome or not.
 */
// function isPalindrome(str) {}

module.exports = { isPalindrome };

/*****************************************************************************/
// Ninja Bonus:

/* 
  Longest Palindrome
  For this challenge, we will look not only at the entire string provided, but also at the substrings within it. Return the longest palindromic substring. 
  Strings longer or shorter than complete words are OK.
  All the substrings of "abc" are:
  a, ab, abc, b, bc, c
*/



// const str1 = "what up, daddy-o?";
// const expected1 = "dad";

// const str2 = "uh, not much";
// const expected2 = "u";

// const str3 = "Yikes! my favorite racecar erupted!";
// const expected3 = "e racecar e";

// /**
//  * Finds the longest palindromic substring in the given string.
//  * - Time: O(?).
//  * - Space: O(?).
//  * @param {string} str
//  * @return {string} The longest palindromic substring from the given string.
//  */
// function longestPalindromicSubstring(str) {}

// module.exports = { longestPalindromicSubstring };
function checkPalindrome(str) {
    return str == str.split('').reverse().join('');
}
// console.log(checkPalindrom('racecar'))

const str1 = "what up, daddy-o?";
const expected1 = "dad";

const str2 = "uh, not much";
const expected2 = "u";

const str3 = "Yikes! my favorite racecar erupted!";

const expected3 = "e racecar e";


function substrPalindrome(myStr) {
    let longestStr = '';
    for (let i = 0; i < myStr.length; i++) {
        for (let j = 0; j < myStr.length; j++) {
            if (checkPalindrome(myStr.substring(i, j)) && myStr.substring(i, j).length > longestStr.length) {
                longestStr = myStr.substring(i, j);
            }
        }
    }
    return longestStr;
}

console.log(substrPalindrome(str3));