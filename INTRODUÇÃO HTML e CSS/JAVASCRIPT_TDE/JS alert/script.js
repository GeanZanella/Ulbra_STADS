//Primeira atividade//
var resp = prompt("Digite um número:","Digite aqui");

if(resp > 10)
{
    alert("Número digitado maior que 10");
}
if(resp < 10)
{
    alert("Número digitado menor que 10");
}
if(resp == 10)
{
    alert("Número digitado igual a 10","Digite aqui");
}

//segunda atividade//
var num_1 = parseFloat(prompt("Digite um número","Digite aqui"));
var num_2 = parseFloat(prompt("Digite outro número","Digite aqui"));
var res = (num_1 += num_2);
alert(res);

//terceira atividade//
var n1 = parseFloat(prompt("Digite um número","Digite aqui"));
var n2 = parseFloat(prompt("Digite outro número","Digite aqui"));
var resultado = parseFloat(prompt("Escolha 1 para somar, 2 para subtrair, 3 para multiplicar e 4 para dividir:","Digite aqui"));

    switch(resultado)
    {
		case (1):
			resultado = n1+n2
			alert(resultado);
			break;
		case (2):
			resultado= n1-n2;
			alert(resultado);
			break;
		case (3):
			resultado = n1*n2;
			alert(resultado);
			break;
		case (4):
			resultado = n1/n2;
			alert(resultado);
			break;
		default:
			alert("Operaзгo invalida");
			break;		
    }

//quarta atividade//
var nome = prompt("Digite seu nome:","nome");
var n = parseFloat(prompt("Digite um número","Digite aqui"));

    for (x=1; x<=n; x++)
    {
        alert(nome);
    }
//quinta atividade//
var dados = []  
dados [0] = prompt("Digite seu nome:","digite aqui");
dados [1] = prompt("Digite seu e-mail:","digite aqui");
dados [2] = prompt("Digite seu endereço:","digite aqui");

alert(dados.join(" - "));



//sexta atividade//
var pessoa = {
nome : prompt("Digite seu nome:","digite aqui"),
email : prompt("Digite seu e-mail:","digite aqui"),
endereco : prompt("Digite seu endereço:","digite aqui"),
}
alert(pessoa.nome);
alert(pessoa.email);
alert(pessoa.endereco);

//atividade em aula//
function testeTaboada(){
	var resultado = document.getElementById("resultado");
	var taboada = document.getElementById("taboada").value;
	console.log("Taboada do " + taboada);
	var i = 1;
	resultado.innerHTML= "";
	while(i<=10)
	{
		resultado.innerHTML += taboada + " X " + i + " - " +i*taboada +"<br>";
		console.log(taboada + " X " +  i + " - " + i*taboada);
		i++;
	}
}