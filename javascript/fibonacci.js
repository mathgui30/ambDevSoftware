var n = 8, atual = 1, anterior = 0, prox = 0, result = "";

if ( n === 0 || n === 1 ) {
    console.log(anterior);
}

result += anterior + " " + atual;

for (i = 1; i < (n - 1); i++) {
    prox = anterior + atual;
    anterior=atual;
    atual = prox;
    result += " " + atual;

}
console.log(result);