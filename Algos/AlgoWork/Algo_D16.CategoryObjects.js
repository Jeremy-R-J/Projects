/* 
    Given an array of objects that contain a category key,
    return an object to group the objects by their category.
    Make the grouping case-insensitive.
    Bonus: allow the key that is grouped by to be provided.
    EXAMPLE:
    const objects = [
        {
            name: "Baby Yoda",
            category: "cute",
        },
        {
            name: "Cricket Protein",
            category: "food",
        },
        {
            name: "Shibe",
            category: "Cute",
        },
        {
            name: "Ancient India",
            category: "Cradle of Civilization",
        },
        {
            name: "Wasp Crackers",
            category: "Food",
        },
        {
            name: "The Fertile Crescent",
            category: "Cradle of Civilization",
        },
    ];
    groupObjects(objects) should return:
    {
        cute: [
            {
                name: "Baby Yoda",
                category: "cute",
            },
            {
                name: "Shibe",
                category: "Cute",
            },
        ],
        food: [
            {
                name: "Cricket Protein",
                category: "food",
            },
            {
                name: "Wasp Crackers",
                category: "Food",
            },
        ],
        "cradle of civilization": [
            {
                name: "Ancient India",
                category: "Cradle of Civilization",
            },
            {
                name: "The Fertile Crescent",
                category: "Cradle of Civilization",
            },
        ],
    }
*/
function groupObjects(items, groupByKey="category") {
    const table = {}; // this is going to contain our output table
    for(const item of items) { // loop through the objects in our items array
        const key = item[groupByKey].toLowerCase(); // the key for our new table is going to be whatever our
        // groupByKey's value is.

        if(table.hasOwnProperty(key)){ // if our table already has that key
            table[key].push(item); // add that item to the array at that key
        } else { // otherwise
            table[key] = [item]; // set the value at this key to be an array with this item in it
        }
    }

    return table; // and then finally, after all that, return the table itself.
}

/*
    Given two strings, return if they are equal when both are typed 
    into empty text editors. The '#' character means a backspace character.
    Assume that both strings only contain lowercase letters and # characters.
    Note that after backspacing an empty text, the text will continue to be
    empty.
    BONUS: Can you do it with O(1) space complexity (i.e., constant. no matter how
    long the strings are, the amount of extra memory for variables never changes), 
    and O(n) time complexity?
    EXAMPLE:
    let s1 = "a#c" 
    let t1 = "b" 
    let s2 = "a##c" 
    let t2 = "#a#c" 
    backSpaceStringCompare(s1, t1) should return false, because the output to
    a text editor for s1 would be "c", while the output for t1 would be "b"
    backSpaceStringCompare(s2, t2) should return true, because the output to
    a text editor for both would just be "c"
*/
function backSpaceStringCompare(str1, str2){
    // ok, basically, we want to start at the end of each string, and 1
    // character at a time, compare the characters from each string.
    let i = str1.length-1; // we're going to start at the back of each string
    let j = str2.length-1; // and move towards the front of the string, so 2 indexes

    let skip1 = 0; // these are going to be used to determine how many characters need to be
    let skip2 = 0; // skipped based on how many backspaces we find.

    while( i >= 0 || j >= 0) { // while our indexes aren't done traversing
        
        while(i >= 0) { // this is more of a safeguard in case a string is all backspaces
            if(str1[i] === '#'){ // if the character is a backspace
                i--; // we'll decrement i to skip over the #
                skip1++; // and add 1 to the number of characters we need to skip.
            } else if(skip1 > 0) {
                i--; // if we found that characters needed to be skipped from previous characters, we'll 
                // decrement our index again to skip that actual character
                skip1--; // and reduce our skip count since we no longer need to skip that character
            } else { // otherwise, we have a character that should be at the end of our output
                break; // so break out of this while loop
            }
        }

        while(j >= 0) { // now do the same thing for the second string, so we know what characters to compare
            if(str2[j] === '#'){
                j--;
                skip2++;
            } else if(skip2 > 0){
                j--;
                skip2--;
            } else {
                break;
            }
        }

        // now that we've found 2 characters that will be physically there in the text output,
        // let's check if they're the same.
        if(i >= 0 && j >= 0 && str1[i] !== str2[j]){ // if they're not, then obviously the outputs won't be the same, 
            // or if we've already checked all the characters in 1 or both strings
            return false; // return false
        }

        if((i < 0 && j >= 0) || (i >= 0 && j < 0)){ // alternatively, if we've already finished one string,
            // and have more characters to display in the second string, they're obviously not the same
            return false; // so return false
        }

        i--; // otherwise we just decrement
        j--; // both our indexes and start again with the next character
    }

    return true;// if we made it this far, they must be the same!
}