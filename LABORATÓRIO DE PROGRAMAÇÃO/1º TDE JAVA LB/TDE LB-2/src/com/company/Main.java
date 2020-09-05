package com.company;

/*O Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o valor de
um imóvel a ser negociado. A base de cálculo do ITBI (o valor a ser considerado no cálcul
o) será o maior valor entre o valor de transação (o valor negociado) e o valor venal
de referência (fornecido pela Prefeitura). Com base nisso, elabore uma classe que receba o
valor da transação, o valor venal e o percentual de imposto. Após isso, encontre o mai
or valor e aplique o percentual sobre ele. Ao final, apresente o valor do imposto a ser pago.
Observação: o valor do imposto a ser pago é calculado por meio da fórmula: valor
do imposto = maior valor * percentual / 100. Para entrada e saída de dados utilize a classe JOptionPane.*/

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main 
{
    public static void main(String[] args)
    {
        //JOptionPane.showMessageDialog(null, "aqui so apresenta uma mensagem");
        //variavel=JOptionPane.showInputDialog("mensagem para receber com string);
        float valor_imo, valor_imo_p, itbi, valor_itbi, valor_final = 0;
        String leitura;
        leitura= showInputDialog("digite o valor do imovel que o corretor aplicou: ");
        valor_imo=Float.parseFloat(leitura);
        leitura= showInputDialog("digite o valor que a prefeitura avaliou o imovel: ");
        valor_imo_p=Float.parseFloat(leitura);
        leitura= showInputDialog("digite a pocentagem do ITBI: ");
        itbi=Float.parseFloat(leitura);
        if(valor_imo>valor_imo_p)
        {
            valor_itbi=valor_imo*itbi/100;
            valor_final=valor_imo-valor_itbi;
        }
        if(valor_imo<valor_imo_p)
        {
            valor_itbi=valor_imo_p*itbi/100;
            valor_final=valor_imo_p-valor_itbi;
        }
        showMessageDialog(null, "valor do imovel  com o desconto do itbi é:"+valor_final);
    }
}
