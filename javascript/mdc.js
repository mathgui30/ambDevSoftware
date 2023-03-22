var a = prompt("primeiro num");
var b = prompt("segundo num");

var maior, mdc = 1;

if (a > b) {
    maior = a;
} else {
    maior = b;
}

for (let i = 2; i < maior; ++i){
    while ((a % i == 0) && (b % i == 0)) {
        a /= i;
        b /= i;
        mdc *= i;
    }
}
console.log(mdc);
