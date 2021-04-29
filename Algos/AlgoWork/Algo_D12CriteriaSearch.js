/* 
    Given a search criteria object whose values will only be
    primitives (ints, strings, booleans) and a list of objects.
    return any object that matches all the key value pairs in the search
    criteria object.
    Bonus: write a 2nd solution using built-in methods to practice functional
    programming.
    EXAMPLE:
    const search = {
        power_1: "Money",
        power_2: "Brooding"
    }
    const heroes = [
        {
            fName: "Clark",
            lName: "Kent",
            alias: "Superman",
            power_1: "Super strength",
            power_2: "Flight"
        },
        {
            fName: "Bruce",
            lName: "Wayne",
            alias: "Batman",
            power_1: "Money",
            power_2: "Brooding"
        },
        {
            fName: "Oliver",
            lName: "Queen",
            alias: "Green Arrow",
            power_1: "Money",
            power_2: "Bow and Arrow"
        },
        {
            fName: "Ryan",
            lName: "Choi",
            alias: "Atom",
            power_1: "Size alteration",
            power_2: "Intelligence"
        }
    ]
    find(search, heroes) should return:
    [
        {
            fName: "Bruce",
            lName: "Wayne",
            alias: "Batman",
            power_1: "Money",
            power_2: "Brooding"
        }
    ]
    even though there is only 1 match, it should still be in an array.
*/
function find(criteria, collection){
    const matches = []; // we need a place to put all of the data that matches our search
    for(const item of collection){ // loop through the items in our collection
        let isMatch = true; // we'll start by assuming each item will be a match, and later on change that if it's not the case
        
        for(const key in criteria){ // loop through the key/value pairs in our criteria object
            if(criteria[key] !== item[key]){ // and if the value of the key in the criteria doesn't match the value in the item at that key
                isMatch = false; // it's not a match, flip isMatch to false
                break; // and break out of this for loop since it can't possibly be a match anymore
            }
        }

        if(isMatch){ // now, after checking the info in the criteria against this item, if it's still a match
            matches.push(item); // add it to our output
        }
    }

    return matches; // finally, return our matches
}

function findFunctional(criteria, collection){
    return collection.filter(item => Object.keys(criteria).every(key => item[key] === criteria[key]));
    // array.filter() -- a built in method that runs a given callback function with each item in the array as the argument.
        // if the callback returns true, the item is added to the output array
    // Object.keys() -- a built in method that breaks an object into an array of its keys
    // array.every() -- a built in prototype method that runs a given callback function on every item in an array.
        // if that callback function returns true on EVERY SINGLE ITEM in the array, it returns true.
        // otherwise it returns false

    // so basically, we are filtering for the items from our collection where every key value pair in the 
    // criteria matches those respective key value pairs in the item
}


/* 
    Given an id, an object that has keys with corresponding updated values, and an array of objects
    Find the object by "id" key that matches the given id value and then update that object's
    keys with the provided new values.
    Return the updated object, or null if no object was found
    EXAMPLE:
    const students = [
        {
            id: 1,
            name: "student1",
            isLateToday: false,
            lateCount: 15,
            redBeltStatus: false,
        },
        {
            id: 2,
            name: "student2",
            isLateToday: false,
            lateCount: 1,
            redBeltStatus: false,
        },
        {
            id: 3,
            name: "student3",
            isLateToday: false,
            lateCount: 0,
            redBeltStatus: false,
        },
    ];
    const id1 = 3;
    const updateData1 = { redBeltStatus: true, isLateToday: true };
    findByIdAndUpdate(id1, updateData1, students) should return:
    {
        id: 3,
        name: "student3",
        isLateToday: true,
        lateCount: 0,
        redBeltStatus: true,
    }
*/
function findByIdAndUpdate(id, updateVals, collection) {
    for(const item of collection){ // loop through the items in our collection
        if(item.id === id){ // if we find one with a matching id
            for(const key in updateVals){ // we'll loop through the key/value pairs in our updateVals object
                item[key] = updateVals[key]; // and set the item's value at each key to the value of that key in the updateVals
            }
            return item; // and finally return it.
        }
    }
    return null; // if we looped through the collection and never found anything, then we'll just return null
}