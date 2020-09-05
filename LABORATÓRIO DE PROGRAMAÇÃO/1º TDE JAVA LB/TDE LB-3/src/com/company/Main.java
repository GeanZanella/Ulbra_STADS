package com.company;

/*Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a
nota de duas provas e de um trabalho. Calcule e mostre a média e o resultado final
(aprovado ou reprovado). Para calcular a média utilize a fórmula seguinte: média =
(nota da prova 1 + nota da prova 2 + nota do trabalho) / 3. Considere que a média mínima para aprovação é 6.*/

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main
{
    //JOptionPane.showMessageDialog(null, "aqui so apresenta uma mensagem");
    //variavel=JOptionPane.showInputDialog("mensagem para receber com string);
    public static void main(String[] args)
    {
        float ap1=0, ap2=0, tde=0, resul_final;
        String leitura;
        leitura=showInputDialog("digite a nota da ap1: ");
        ap1=Float.parseFloat(leitura);
        leitura=showInputDialog("digite a nota da ap2: ");
        ap2=Float.parseFloat(leitura);
        leitura=showInputDialog("digite a nota da tde: ");
        tde=Float.parseFloat(leitura);
        resul_final=ap1+ap2+tde;
        if(resul_final>5)
        {
            showMessageDialog(null, "Aluno Aprovado!");
        }
        if(resul_final<6)
        {
            showMessageDialog(null, "Aluno Reprovado!");
        }
    }
}
