package TDE_LB;

/*- Crie uma classe que simule a jogada de um dado de seis lados (números de 1 a 6)
por três vezes. Ao  final some seus valores e apresente o resultado das três jogadas. */

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random jogada= new Random();
        int soma=0;
        int numDado;
        for (int i=1;i<=3;i++)
        {
             numDado = jogada.nextInt(6) + 1;
             System.out.println("Sorteio de numero:"+i+" Resultado:"+numDado);
             soma = soma + numDado;
        }
        System.out.println("Soma dos numeros sorteados:"+soma);
    }
}
