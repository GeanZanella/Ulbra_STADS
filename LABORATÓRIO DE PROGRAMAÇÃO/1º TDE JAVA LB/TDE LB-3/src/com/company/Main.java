package com.company;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class Main {

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
