function calcular(){
    var quant = document.getElementById('quant');
    var valorUnit = document.getElementById('valorUnit');
    var form = document.form;
    var display = document.getElementById("display");
    var result = 0;
    if (quant.value.length == "" || valorUnit.value.length == "") 
        return display.textContent = "Preencha os campos";
    quantValor = parseInt(quant.value)
    valorUnitValor = parseFloat(valorUnit.value)
    if(quantValor>100 && quantValor<=200){
        result = (quantValor* valorUnitValor)*1.25;
    }
    else if(quantValor>200){
        result = (quantValor* valorUnitValor)*1.5;
        }    
    else{
        result = quantValor* valorUnitValor;
    }
    quant.value = "";
    valorUnit.value = "";
    quant.focus();
    display.innerHTML= result.toLocaleString('pt-BR', {style: "currency", currency: "BRL"});

}
