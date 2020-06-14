function verificaMaior() {
    var num = document.getElementById("num").value;
    num=num.split(",");
    var maior = parseInt(num[0]);
    var menor = parseInt(num[0]);
    for (i=0; i<num.length; i++) {
        if (parseInt(num[i])>maior)
            maior=num[i]
        if(parseInt(num[i]) < menor)
            menor=num[i]
    }
    document.getElementById("result").innerHTML='Maior valor digitado foi de ' + maior + '.<br/>Menor valor digitado foi de ' + menor + '.';     
}
