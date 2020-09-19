package TDE_LB;

/*Construa uma classe que receba uma frase qualquer e mostre
essa frase de trás para a frente e sem espaços em branco*/

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String frase;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        frase = input.nextLine();
        for(int i=frase.length()-1; i>=0; i--)
        {
            if (frase.charAt(i)== ' ')
            {
//              esse if serve apenas para pegar os espaços em branco
            }
            else{
                System.out.print(frase.charAt(i));
                 }
        }
    }

}
