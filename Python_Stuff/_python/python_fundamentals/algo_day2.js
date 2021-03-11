// #
// /* 
// #   Acronyms
// #   Create a function that, given a string, returns the string’s acronym 
// #   (first letter of each word capitalized). 
// #   Do it with .split first if you need to, then try to do it without
// # */

// #
// /**
// #  * Turns the given str into an acronym.
// #  * - Time: O(?).
// #  * - Space: O(?).
// #  * @param {string} str A string to be turned into an acronym.
// #  * @return {string} The given str converted into an acronym.
// #  */

// # // without using .split()
// #
// function acronymize(str) {

//     #}

// # // Test cases
// #
// const str1 = " there's no free lunch - gotta pay yer way. ";#
// const expected1 = "TNFL-GPYW";

// #
// const str2 = "Live from New York, it's Saturday Night!";#
// const expected2 = "LFNYISN";

// #
// const str3 = "              ";#
// const expected3 = "";

// #
// const str4 = "LivefromNewYork,it'sSaturdayNight!";#
// const expected4 = "L";

// #
// const str5 = "     there's     no free lunch -     gotta pay yer way.    ";#
// const expected5 = "TNFL-GPYW";


// *

// Possible topics to explore:
//     1.) Iterating over strings
// 2.) Immutability
// 3.) while loop example
// 4.)(extra) let,
// const and
// var

// *
// /


/*
  String: Reverse
  Given a string,
  return a new string that is the given string reversed
*/

?
// function reverseString(str) {
//     var newString=""; 
//     for (let i =str.length-1; i>=0;i--){
//         newString+=str[i];}
// return newString
//     }
// console.log(reverseString("hello"));
// console.log(reverseString(str1), reverseString(str1) == expected1);
// console.log(reverseString(str2), reverseString(str2) == expected2);







/*****************************************************************************/

# /* case insensitive string compare */

# // const strA1 = "ABC";
# // const strB1 = "abc";
# // const expected1 = true;

# // const strA2 = "ABC";
# // const strB2 = "abd";
# // const expected2 = false;

# // const strA3 = "ABC";
# // const strB3 = "bc";
# // const expected3 = false;

#
/**
#  * Determines whether or not the strings are equal, ignoring case.
#  * - Time: O(?).
#  * - Space: O(?).
#  * @param {string} strA
#  * @param {string} strB
#  * @return {boolean} If the strings are equal or not.
#  */
#
function caseInsensitiveStringCompare(strA, strB) {

    #}# // console.log(caseInsensitiveStringCompare(strA1, strB1) == expected1);
# // console.log(caseInsensitiveStringCompare(strA2, strB2) == expected2);
# // console.log(caseInsensitiveStringCompare(strA3, strB3) == expected3);

#
module.exports = { caseInsensitiveStringCompare };

# /*****************************************************************************/
function caseInsensitiveStringCompare(strA, strB) {
    if (strA.toUpperCase == strB.toUpperCase) {
        console.log(true)
        return true
    }
}
caseInsensitiveStringCompare("ABC", "abc")