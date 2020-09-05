package com.company;

/*Elabore uma classe que receba o nome de um produto e o seu valor. O desconto deve
ser calculado de acordo com o valor fornecido conforme a imagem. Utilizando a estrutura
if-else, apresenta em tela o nome do produto, valor original do produto e o novo valor
depois de ser realizado o desconto. Caso o valor digitado seja menor que zero, deve ser
emitida uma mensagem de aviso.*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String cod;
        float val_pro, des_pro,val_final;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        cod = teclado.nextLine();
        System.out.print("digite o valor do produto: ");
        val_pro = teclado.nextFloat();
        while(val_pro<=0)
        {
            System.out.print("ERRO! valor não aceito digite novamente: ");
            val_pro = teclado.nextFloat();
        }
        if((val_pro>=50)&&(val_pro<200))
        {
            des_pro=val_pro*5/100;
            val_final=val_pro-des_pro;
            System.out.printf("O produto %s custa: %.2f com o desconto ficou: %.2f",cod,val_pro,val_final);
        }
        if((val_pro>=200)&&(val_pro<500))
        {
            des_pro=val_pro*6/100;
            val_final=val_pro-des_pro;
            System.out.printf("O produto %s custa: %.2f com o desconto ficou: %.2f",cod,val_pro,val_final);
        }
        if((val_pro>=500)&&(val_pro<1000))
        {
            des_pro=val_pro*7/100;
            val_final=val_pro-des_pro;
            System.out.printf("O produto  %s custa: %.2f com o desconto ficou: %.2f",cod,val_pro,val_final);
        }
        if(val_pro>=1000)
        {
            des_pro=val_pro*8/100;
            val_final=val_pro-des_pro;
            System.out.printf("O produto  %s custa: %.2f com o desconto ficou: %.2f",cod,val_pro,val_final);
        }
    }
}
