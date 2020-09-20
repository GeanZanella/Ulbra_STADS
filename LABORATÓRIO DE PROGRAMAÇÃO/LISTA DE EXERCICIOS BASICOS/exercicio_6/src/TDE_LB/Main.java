package TDE_LB;

/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.*/

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("digite um numero inteiro: ");
        num = teclado.nextInt();
        System.out.println("o antecessor é:"+(num -1));
        System.out.println("o sucessor é:"+(num +1));
    }
}
