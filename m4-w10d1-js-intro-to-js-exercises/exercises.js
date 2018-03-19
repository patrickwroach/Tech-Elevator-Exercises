/*
SumDoubleGiventwointvalues,returntheirsum.Unlessthetwovaluesarethesame,thenreturndoubletheirsum.
sumDouble(1, 2) → 3 sumDouble(3, 2) → 5 sumDouble(2, 2) → 8
function sumDouble(x, y) { // do logic here
// return result; return x + y;
}
*/
function sumDouble(x, y) {
    sum = x + y;
    if (x === y) {
        return sum *= 2;
    }
    console.log(sum);
    return sum;
}

function lastDigit(x, y) {
    var first = x.toString().split('').pop();
    var second = y.toString().split('').pop();
    if (first == second) {
        return true;
    }
    return false;
}