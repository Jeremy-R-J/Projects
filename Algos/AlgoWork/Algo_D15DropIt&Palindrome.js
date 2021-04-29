/*
    Input: arr, callback
    Output: arr (with elements removed)
    Remove every element in the array, starting from idx 0,
    until the callback function returns true when passed the
    iterated element.
    Return an empty array if the callback never returns true
    EXAMPLE:
    const nums = [1, 4, 3, 6, 9, 15];
    const callback1 = (elem) => {
        return elem > 5;
    };
    dropIt(nums, callback1) should return [6,9,15] because 6, 9, and 15 are the elements that,
    when passed into callback1, will result in the function returning true.
*/
function dropIt(arr, callback){
    for(let i = 0; i < arr.length; i++) { // loop through the items in the array
        if(callback(arr[i])){ // if the callback returns true, 
            arr.splice(i,1) // splice the item out
            i--; // and decrement i so we don't skip the next value
        }
    }
    return arr; // and finally, return the output.
}

/* 
    Given to Neil in an interview
    Given a string
    return whether or not it's possible to make a palindrome out of the string's characters
    What is it about a string that makes it possible for it to be a palindrome?
    Palindrome - a word/phrase that is spelled the same way forwards and backwards
    EXAMPLE:
    const str1 = "dda";
    const str2 = "aaadd";
    const str3 = "acdd";
    canStringBecomePalindrome(str1) should return true, because "dda" can be rearranged as "dad", 
    which is the same forwards and backwards.
    canStringBecomePalindrome(str2) should return true, because "aaadd" can be rearranged as "daaad"
    or "adada", which are both the same forwards and backwards.
    canStringBecomePalindrome(str3) should return false, because "acdd" cannot be rearranged in any
    way that would make it the same forwards and backwards
*/
function canStringBecomePalindrome(str){
    // the secret here is recognizing that a string can become a palindrome in 2 cases:
        // 1. Even length string: every character appears an even number of times
        // 2. Odd length string: 1 character appears an odd number of times, while the rest appear an even number of times.
    // so, we should opt for a frequency table to keep track of how many times each character appears.
    // NOTE: It's physically impossible for an even length string to only have 1 character appear an odd number of times
    const freqTable = {};

    for(let i = 0; i < str.length; i++) {
        const character = str[i].toLowerCase(); // I'd consider different capitalizations as the same character, so let's sterilize
        if(!freqTable.hasOwnProperty(character)){ // if our frequency table doesn't have an entry for this character
            freqTable[character] = 1; // add one, and give it a value of 1
        } else {
            freqTable[character]++; // otherwise, increment the value already there
        }
    }

    // now, we need to see how many times an odd character appears:
    let oddCount = 0; // let's keep track of the number odd entries
    for(const key in freqTable){
        if(freqTable[key] % 2 !== 0) {// if this character appeared an odd number of times
            oddCount++; // increment our odd count
            if(oddCount > 1) { // if there are more than 1 characters that appear an odd number of times
                return false;
            }
        }
    }

    // if we've made it this far, than the string can be rearranged as a palindrome
    return true;
}

