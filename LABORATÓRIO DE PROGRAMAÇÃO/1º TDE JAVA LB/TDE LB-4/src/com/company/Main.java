package com.company;

/*Considere a seguinte informação a respeito do cálculo da aposentadoria. Para
se aposentar por idade, as mulheres precisam ter atingido 60 anos de idade e os
homens, 65. Já na aposentadoria por tempo de contribuição, o tempo mínimo exig
ido é de 30 anos para as mulheres e de 35 anos para os homens. Com base nessas
informações, elabore uma classe que receba a idade de uma pessoa, seu sexo e
a quantidade de anos de contribuição. A seguir, calcule a quantidade de anos qu
e falta de contribuição para se aposentar, ou então emita a mensage
m: “você já tem o direito a aposentadoria”.*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	    Scanner teclado = new Scanner(System.in);
	    int idade,resu_ida,contri,resu_contri;
	    char sexo;
        System.out.println("Digite seu sexo para feminino use 'F' para masculino use 'M': ");
        sexo=teclado.next().charAt(0);
        while((sexo!='m')&&(sexo!='M')&&(sexo!='f')&&(sexo!='F'))
        {
            System.out.println("ERRO! use as letras 'M' e 'F' para representar se sexo!");
            sexo=teclado.next().charAt(0);
        }
        System.out.println("Digite sua idade: ");
        idade=teclado.nextInt();
        if((sexo =='m')||(sexo =='M'))
        {
            if(idade>=65)
            {
                System.out.println("Voçê já tem o direito a aposentadoria");
            }
            else
            {
                System.out.println("Quantos anos de contribuição voce tem? ");
                contri=teclado.nextInt();
                resu_contri=35-contri;
                resu_ida=65-idade;
                if(resu_ida<resu_contri)
                {
                    System.out.printf("Voçê vai se aposentar por idade falta %i anos!",resu_ida);
                }
                if(resu_ida>resu_contri)
                {
                    System.out.printf("Voçê vai se aposentar por tempo de contruibuição falta %i anos!",resu_contri);
                }
                if(resu_ida==resu_contri)
                {
                    System.out.printf("Falta %i anos para voçê se aposentar!",resu_ida);
                }
            }
        }
        if((sexo =='f')||(sexo =='F'))
        {
            if(idade>=60)
            {
                System.out.println("Voçê já tem o direito a aposentadoria");
            }
            else
            {
                System.out.println("Quantos anos de contribuição voce tem? ");
                contri=teclado.nextInt();
                resu_contri=30-contri;
                resu_ida=60-idade;
                if(resu_ida<resu_contri)
                {
                    System.out.printf("Voçê vai se aposentar por idade falta %i anos!",resu_ida);
                }
                if(resu_ida>resu_contri)
                {
                    System.out.printf("Voçê vai se aposentar por tempo de contruibuição falta %i anos!",resu_contri);
                }
                if(resu_ida==resu_contri)
                {
                    System.out.printf("Falta %i anos para voçê se aposentar!",resu_ida);
                }
            }
        }
    }
}
