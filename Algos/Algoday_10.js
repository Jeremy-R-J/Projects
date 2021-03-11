*
An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Is there a quick way to determine
if they aren 't an anagram before spending more time?
Given two strings
return whether or not they are anagrams *
    /

function
/**
 * Determines whether s1 and s2 are anagrams of each other.
 * Anagrams have all the same letters but in different orders.
 * - Time: O(?).
 * - Space: O(?).
 * @param {string} s1
 * @param {string} s2
 * @return {boolean} Whether s1 and s2 are anagrams.
 * 
var s1='listen';
var s2='silent';



function isAnagram(s1, s2) {
  var array1=[];
  var array2=[];
  if(s1.length!=s2.length){
    return false;
  }
  for (var i=0; i<s1.length;i++){
    array1.push(s1[i]);
    array2.push(s2[i]);
  }
  var count=0;
  for(var j=0;j<s1.length;j++){
    if(array2.includes(array1[j])){
      count++;

    }
  }
  
  if(count==array1.length){
    return true;
  }
  else{
    return false;
  }
}
console.log(isAnagram(s1, s2));
}


/*****************************************************************************/
Algo 2:
    /* 
    Given a string that may have extra spaces at the start and the end,
    return a new string that has the extra spaces at the start and the end trimmed (removed)
    do not remove any other spaces.
    */

    /**
     * Trims any leading or trailing white space from the given str.
     * - Time: O(?).
     * - Space: O(?).
     * @param {string} str
     * @return {string} The given string with any leading or trailing white space
     *    stripped.
     */
    function trim(str) {}


function trim(str) {
    var newstring = "";
    var leading = 0;
    var trailing = 0;
    for (var i = 0; i < str.length; i++) {
        if (str[i] == " ") {
            leading++;
        } else {
            break;
        }
    }
    for (var i = str.length - 1; i >= 0; i--) {
        if (str[i] == " ") {
            trailing++;
        } else {
            break;
        }
    }
    for (var i = leading; i < str.length - trailing; i++) {
        newstring += str[i];
    }
    return newstring;
}
/********************************************************************