package com.company;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

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
