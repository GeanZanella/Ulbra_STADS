package TDE_ARRAY;

import java.util.Random;

/*Faça uma classe contendo dois arrays do tipo inteiro, um chamado par e outro chamado ímpar.
Cada array deve conter 10 elementos. A seguir, faça um laço de repetição com 10 iterações e que
contenha internamente a geração randômica de números entre 1 e 20. Se o valor gerado for par,
armazene no array chamado par, caso contrário, no array chamado impar. Ao  final, apresente o
conteúdo de cada um dos arrays.*/

public class Main
{
    public static void main(String[] args)
    {
        int[] par = new int[10];
        int[] impar = new int[10];
        int num_gerado;
        int ip=0;
        int ii=0;
        Random sorteio = new Random();
        for(int i=0; i<10; i++)
        {
            num_gerado = sorteio.nextInt(20);
            if(num_gerado % 2 == 0)
            {
                par[ip] = num_gerado;
                ip++;
            }
            else{
                impar[ii] = num_gerado;
                ii++;
            }
        }
        System.out.println("Os numeros pares são: ");
        for(int i=0; i<10; i++)
        {
            if(par[i]!=0)
            {
                System.out.println(par[i]);
            }
        }
        System.out.println("Os numeros impares são: ");
        for(int i=0; i<10; i++)
        {
            if(impar[i]!=0)
            {
                System.out.println(impar[i]);
            }
        }

    }
}