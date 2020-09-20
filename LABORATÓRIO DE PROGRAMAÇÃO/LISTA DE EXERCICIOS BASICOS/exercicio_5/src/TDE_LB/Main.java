package TDE_LB;

/*. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)*/

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double salario, salario_m, resul;
        String nome;
        System.out.println("Digite o nome do empregado:");
        nome = teclado.next();
        System.out.println("Digite o valor do salario minimo: ");
        salario_m = teclado.nextDouble();
        System.out.println("Digite o valor do salario: ");
        salario = teclado.nextDouble();
        resul = salario/salario_m;
        System.out.println("O empregada "+nome+" recebe o equivalente a "+resul+" salario minimo");
    }
}
