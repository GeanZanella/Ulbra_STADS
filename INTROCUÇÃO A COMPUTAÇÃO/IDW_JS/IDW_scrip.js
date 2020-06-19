function pegarVariavel(){
var a = document.getElementById("variavel_a").value;
var b = document.getElementById("variavel_b").value;
var resul_or;
var resul_and;
var resul_xor;
var resul_not_or;
var resul_not_and;
var resul_not_xor;
var resul_final=document.getElementById("result");


resul_or=a || b; // or

resul_and= a && b; // and

resul_xor= a != b; // xor

resul_not_or= !(a || b); // not or

resul_not_and= !(a && b); // not and

resul_not_xor= !(a != b); // not xor

resul_final.innerHTML="Resultado de OR: " + resul_or + "<br/>Resultado de AND: " + resul_and + "<br/>Resultado de XOR: " + resul_xor + "<br/>Resultado da negação de OR: " + resul_not_or + "<br/>Resultado da negação de AND: " + resul_not_and + "<br/>Resultado da negação de XOR: " + resul_not_xor;

}