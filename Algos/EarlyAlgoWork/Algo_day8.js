/* 
  Given a string containing space separated words
  Reverse each word in the string.
  If you need to, use .split to start, then try to do it without.
*/

const str1 = "hello";
const expected1 = "olleh";

const str2 = "hello world";
const expected2 = "olleh dlrow";

const str3 = "abc def ghi";
const expected3 = "cba fed ihg";

/**
 * Reverses the letters in each words in the given space separated
 * string of words. Does NOT reverse the order of the words themselves.
 * - Time: O(?).
 * - Space: O(?).
 * @param {string} str Contains space separated words.
 * @return {string} The given string with each word's letters reversed.
 */
function reverseWords(str) {}

module.exports = { reverseWords };

/*****************************************************************************/
Actually do this one first:
    /* 
    Given a string,
    return a new string with the duplicates excluded
    Bonus: Keep only the last instance of each character.
    */

    const str1 = "abcABC";
const expected1 = "abcABC";

const str2 = "helloo";
const expected2 = "helo";

const str3 = 'banana';
const expected3 = "ban";

function stringDedupe(str) {
    newObj = [];
    for (var i = 0; i < str.length; i++) {
        if (str.hasOwnProperty(str[i])) {
            newObj.push(str[i]);
        }
        return newObj;

    }
}
console.log(stringDedupe(str1));
console.log(stringDedupe(str2));


module.exports = { stringDedupe };

// function removeDuplicates(array) {
//     let a = []
//     array.map(x =>
//         if (!a.includes(x) {
//                 a.push(x)
//             })
//             return a
//     };

// function removeDuplicates(array) {
//     let x = {};
//     array.forEach(function(i) {
//         if (!x[i]) {
//             x[i] = true
//         }
//     })
//     return Object.keys(x)
// };
/**
 * 
 * De-dupes the given string.
 * - Time: O(?).
 * - Space: O(?).
 * @param {string} str A string that may contain duplicates.
 * @return {string} The given string with any duplicate characters removed.
 */
function stringDedupe(str) {}

module.exports = { stringDedupe };

/*****************************************************************************/