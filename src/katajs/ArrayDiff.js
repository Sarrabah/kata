/* Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

arrayDiff([1,2],[1]) == [2]
If a value is present in b, all of its occurrences must be removed from the other:

arrayDiff([1,2,2,2,3],[2]) == [1,3] */

function arrayDiff(a, b) {
    if ((a.length > 0) && (b.length > 0)) {
        let mapA = new Map();
        for (let j = 0; j < a.length; j++) {
            if (mapA.has(a[j]) == true) {
                let newVal = mapA.get(a[j]) + 1;
                mapA.set(a[j], newVal);
            }
            else {
                mapA.set(a[j], 1);
            }
        }
        //console.log(mapA);
        let newArr = [];
        for (let i = 0; i < b.length; i++) {
            if (mapA.has(b[i])) {
                mapA.set(b[i], 0)
            }
        }
        //console.log(mapA);
        for (let f = 0; f < a.length; f++) {
            if (mapA.has(a[f])) {
                if (mapA.get(a[f]) >= 1) {
                    newArr.push(a[f]);
                    let newVal1 = mapA.get(a[f]) - 1;
                    mapA.set(a[f], newVal1);
                }
            }
        }
        return newArr;
    }
    else {
        if (a.length == 0) {
            return a;
        }
        else {
            return a;
        }

    }
}

console.log(arrayDiff([-18, -13, 18, 0, 15, -15, -19, 6, -12, 13, 15, -12, -4, -17, -3, -18, -17], [-18, -13, 18, 0, 15, -15, -19]));