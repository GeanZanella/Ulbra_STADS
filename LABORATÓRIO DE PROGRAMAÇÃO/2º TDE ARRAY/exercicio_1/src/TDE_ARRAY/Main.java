package TDE_ARRAY;

/*Escreva um programa que crie um array de inteiros data e use um laço for para criar um
novo String que exiba o conteúdo do array data entre chaves e separado por vírgulas. Por
exemplo, se o array data tiver tamanho 4 e armazenar os valores 3, 4, 1, 5, o String
“{3, 4, 1, 5}” deve ser criado e exibido. */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner teclado =new Scanner(System.in);
        int []vet=new int[5];
        int []exebir=new int[5];
        int y=4;
        int x;
        for (x=1;x<=4;x++)
        {
            System.out.println("Digite um valor inteiro para ocupar a posição "+x+":");
            vet[x]=teclado.nextInt();
        }
        for (x=1;x<=4;x++)
        {
            exebir[x]=vet[y];
            y--;
        }
        for (x=1;x<=4;x++)
        {
            System.out.println("Valor Digitado de trâs para frente é: "+exebir[x]);
        }
    }
}
