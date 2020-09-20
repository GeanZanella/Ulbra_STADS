package TDE_LB;

import java.util.Scanner;

/*Informar um saldo e imprimir o saldo com reajuste de 1%.*/
public class Main
{

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double saldo ;
        double saldo_reajuste;
        System.out.println("Digite o saldo a ser reajustado: ");
        saldo=teclado.nextDouble();
        saldo_reajuste = (0.01 * saldo)+saldo;
        System.out.println("O saldo reajustado é:"+saldo_reajuste);
    }
}
