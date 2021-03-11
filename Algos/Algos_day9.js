/* 
  Parens Valid
    Given an str that has parenthesis in it
    return whether the parenthesis are valid
*/

/**
 * Determines whether the parenthesis in the given string are valid.
 * Each opening parenthesis must have exactly one closing parenthesis.
 * - Time: O(?).
 * - Space: O(?).
 * @param {string} str
 * @return {boolean} Whether the parenthesis are valid.
 */
function parensValid(str) {
    // if it's not 0 at the end, then there is an extra open 
    // if it's less than 0 (-1 or less, then you already know it's invalid)
    var sum = 0;
    for (var i = 0; i < str.length; i++) {
        if (str[i] == "(") {
            sum++;
        } else if (str[i] == ")") {
            sum--;
        }

        if (sum < 0) {
            return "Invalid - there is a closing with no opening"
        }
    }

    if (sum == 0) {
        return "Valid parentheses!"
    } else {
        return "Invalid - there is an opening with no closing"
    }
}
// Test Cases

const str1 = "(()(()))";
const expected1 = true;

const str2 = "(()";
const expected2 = false;
// Explanation: not every parenthesis is closed.

const str3 = "())("; //
const expected3 = false;
// Explanation: because the underlined ")" is premature: there is nothing open for it to close.

const str4 = "))(("; // "))((" ")()("
const expected4 = false;
// Explanation: same number of opens and closes but the 2nd closing closes nothing

module.exports = { parensValid };

/*****************************************************************************/
/* 
  Braces Valid
  Given a string sequence of parentheses, braces and brackets, determine whether it is valid. 
*/

/**
 * Determines whether the string's braces, brackets, and parenthesis are valid
 * based on the order and amount of opening and closing pairs.
 * - Time: O(?).
 * - Space: O(?).
 * @param {string} str
 * @return {boolean} Whether the given strings braces are valid.
 */
function bracesValid(str) {

}

const str1 = "({}[({})])[{}]";
const expected1 = true;

const str2 = "({}[]){";
const expected2 = false;

const str3 = "()[(]{)}";
const expected3 = false;

module.exports = { bracesValid };