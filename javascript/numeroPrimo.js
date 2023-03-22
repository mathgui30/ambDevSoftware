    var p = parseInt(prompt("Digite um numero para verificar se eh primo"));
    var div = 0;

    for(var i = 1; i <= p; i++){
        if (p % i == 0) {
            div++;  
        }
    }    

            if (div == 2) {
                alert("Eh primo");
            } else {
                alert("Nao eh primo")
            }
        
        
       
