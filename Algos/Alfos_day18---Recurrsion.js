// each number is the sum of the previous two
// starting with values 0 and 1
// recursive function that takes a num argument

function fibon(number) {

    if (number === 0) {
        return 0
    }
    if (number === 1) {
        return 1
    } else {
        return fibon(number - 1) + fibon(number - 2)
    }
}

let test = fibon(7)

console.log(test)