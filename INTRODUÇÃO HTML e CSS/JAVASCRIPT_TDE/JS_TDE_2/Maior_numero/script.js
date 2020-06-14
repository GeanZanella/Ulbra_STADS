function verificaMaior() {
    var num = document.getElementById("num").value;
    num=num.split(",");
    var maior = parseInt(num[0]);
    for (i=0; i<num.length; i++) {
        if (parseInt(num[i])>maior)
            maior=parseInt(num[i])
    }
    document.getElementById("result").innerHTML=maior;
}