/* 
  Given an int to represent how much change is needed
  calculate the fewest number of coins needed to create that change,
  using the standard US denominations
*/

const cents1 = 25;
const expected1 = { quarter: 1 };

const cents2 = 50;
const expected2 = { quarter: 2 };

const cents3 = 9;
const expected3 = { nickel: 1, penny: 4 };

const cents4 = 99;
const expected4 = { quarter: 3, dime: 2, penny: 4 };

/**
 * Calculates the fewest coins of the standard American denominations needed
 *    to reach the given cents amount.
 * - Time: O(?).
 * - Space: O(?).
 * @param {number} cents
 * @param {string} sick
 * @return {Object<string, number>} - A denomination table where the keys are
 *    denomination names and the value is the amount of that denomination
 *    needed.
 */
function fewestCoinChange(cents) {}

module.exports = { fewestCoinChange };

// create a function
// create 4 seperate object values for standad coins
// take expected value and put through a if statement
function generateCoinChange(cents) {
    var quarters = 0;
    var dimes = 0;
    var pennies = 0;
    var nickels = 0;
    while (cents >= 25) {
        quarters++;
        cents -= 25;
    }
    while (cents >= 10) {
        dimes++;
        cents -= 10;
    }
    while (cents >= 5) {
        nickels++;
        cents -= 5;
    }
    while (cents >= 1) {
        pennies++;
        cents -= 1;
    }
    console.log(`quarters=${quarters} dimes=${dimes} nickels=${nickels} pennies=${pennies}`);
}
generateCoinChange(55);
generateCoinChange(33);
generateCoinChange(60);
Emmanuel_RiveraToday at 10: 10 AM
cents1 = 25
expected1 = { "quarter": 1 }

cents2 = 50
expected2 = { "quarter": 2 }

cents3 = 9
expected3 = { "nickel": 1, "penny": 4 }

cents4 = 99
expected4 = { "quarter": 3, "dime": 2, "penny": 4 }


def fewest_coin_change(cents):
    quarter = 0
dime = 0
nickel = 0
penny = 0
wallet = {}

while cents:

    if cents >= 25:
    cents -= 25
quarter += 1
wallet["quarter"] = quarter

elif cents >= 10:
    cents -= 10
dime += 1
wallet["dime"] = dime

elif cents >= 5:
    cents -= 5
nickel += 1
wallet["nickel"] = nickel

elif cents >= 1:
    cents -= 1
penny += 1
wallet["penny"] = penny

return wallet



print(fewest_coin_change(cents1))
print(fewest_coin_change(cents2))
print(fewest_coin_change(cents3))
print(fewest_coin_change(cents4))