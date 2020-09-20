package TDE_LB;

import java.util.Scanner;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/
public class Main
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int idade,mes,dia;
        System.out.println("Digite sua idade em anos: ");
        idade= teclado.nextInt();
        mes = idade * 12;
        dia = idade * 365;
        System.out.println("Sua idade em meses é:"+mes+" Sua idade em dias é:"+dia);
    }
}
