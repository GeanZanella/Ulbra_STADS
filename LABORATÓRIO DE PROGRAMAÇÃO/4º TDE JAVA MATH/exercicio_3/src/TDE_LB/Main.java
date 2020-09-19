package TDE_LB;

/*Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por Math.random.
Em seguida, faça com que apareça em tela uma senha numérica contendo a mesma
quantidade de dígitos correspondentes ao valor aleatório gerado. Apresente em
tela o número sorteado e a senha.*/

import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        Random jogada= new Random();
        int num;
        num = jogada.nextInt(6) + 5;
        System.out.println("numero sorteado é:"+num);
        System.out.println("O numero de digitos da senha é igual o numero sorteado:");
        for (int i=1;i<=num;i++)
        {
            System.out.print(jogada.nextInt(10));
        }
    }
}
