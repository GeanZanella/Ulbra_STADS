function pegarVariavel(){
    var nome = document.getElementById("nome").value;
    var sexo = document.getElementById("sexo").value;
    var peso = document.getElementById("peso").value;
    var altura = document.getElementById("altura").value;
    var imc = 0
    var resul_final=document.getElementById("result");
    
    if(peso.length=='' | altura.length=='')
    {
        alert('Campo Obrigatório Vazio');
        return;
    }
    var imc=parseFloat(peso)/(parseFloat(altura)*parseFloat(altura));
    
    if(imc<18.5)
    {
        resul_final.innerHTML="Nome: " + nome + " Sexo: " + sexo  + " Seu IMC é: " + imc.toFixed(1) + " Abaixo do peso ideal!";
    }
    if((imc>=18.5)&&(imc<=25))
    {
        resul_final.innerHTML="Nome: " + nome + " Sexo: " + sexo + " Seu IMC é: " + imc.toFixed(1) + " Peso ideal!";
    }
    if((imc>25)&&(imc<30))
    {
        resul_final.innerHTML="Nome: " + nome + " Sexo: " + sexo + " Seu IMC é: " + imc.toFixed(1) + " Acima do peso ideal!";
    }
    if(imc>=30)
    {
        resul_final.innerHTML="Nome: " + nome + " Sexo: " + sexo + " Seu IMC é: " + imc.toFixed(1) + " Obeso!";
    }
    console.log(nome);
    }