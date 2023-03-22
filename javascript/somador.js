qtd = parseInt(prompt("Digite quantos numeros voce deseja somar"));

var soma = 0;
var valores = [qtd];

for (var i = 1; i <= qtd; i++){

    var valorLendo = parseInt(prompt("Digite o " + i + "° valor"));

    soma += valorLendo;
}
console.log("resultado: " + soma);