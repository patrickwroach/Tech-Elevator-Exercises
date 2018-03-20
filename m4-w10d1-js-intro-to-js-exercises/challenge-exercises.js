
function iqTest(arr){
    
    var evenCount = 0;
    var oddCount =0;
    var differentIndex = 0;

    if (arr.length < 3) return differentIndex;

    for (var i = 0; i < 3; i++){
        if (arr[i] %2 == 0) evenCount++;
        if (arr[i] %2 == 1) oddCount++;
    }
    
    var oddOrEvenCheck = (Math.max(evenCount, oddCount)) ? 0 : 1;

    for (var i = 0; i < arr.length; i++){
        if (arr[i] % 2 != oddOrEvenCheck) {
        differentIndex = i + 1;
        return differentIndex;
    }

    return differentIndex;
    
}
}