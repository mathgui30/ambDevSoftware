
var tam = parseInt(prompt("Qual o número máximo?"))
var result = 0
for(var i  = 0; i<tam; i++){
    var valores = prompt("Alimente o vetor")
    if(valores % 1 === 0){
        result += 1
    }
}
document.write("Ha " + " valores inteiros")
