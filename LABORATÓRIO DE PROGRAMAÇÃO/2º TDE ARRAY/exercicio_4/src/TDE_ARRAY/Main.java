package TDE_ARRAY;

import java.util.Scanner;

/*Escreva um programa que crie um String e use um laço for para verificar
se ele é um palíndromo, ou seja, se você inverter a ordem dos caracteres do
String, obterá o mesmo String. Por exemplo, “abcdcba” é um palíndromo.*/

public class Main
{
    public static void main(String[] args)
    {
        String palavra, reverso = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        palavra=input.next();
        for(int i=palavra.length()-1; i>=0; i--)
        {
            reverso += palavra.charAt(i);
        }
        if(palavra.equals(reverso))
        {
            System.out.println("O String " + palavra + " é um palíndromo");
        }
        else{
            System.out.println("O String " + palavra + " não é um palíndromo");
        }
    }
}

