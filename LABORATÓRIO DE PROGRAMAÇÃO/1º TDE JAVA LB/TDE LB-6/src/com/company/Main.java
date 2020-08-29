package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float []vet = new float[5];
        float maior=0;
        float menor = 0;
        float soma=0;
        int x;
        for (x=1;x<=4;x++)
        {
            System.out.print("Digite o valor da "+x+"º resistência: ");
            vet[x]= teclado.nextFloat();
            soma=soma+vet[x];
            if(x==1)
            {
                menor=vet[x];
            }
            if(vet[x]<menor)
            {
                menor=vet[x];
            }
            if(vet[x]>maior)
            {
                maior=vet[x];
            }

        }
        System.out.print("\nValor maior é "+maior+"\nValor menor é "+menor+"\n A soma de todas resistência é: "+soma);
    }
}
