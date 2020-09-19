package TDE_LB;

/*Uma farmácia precisa ajustar os preços de seus produtos em 12%. Elabore uma classe
que receba o valor do produto e aplique o percentual de acréscimo. O novo valor a ser
calculado deve ser arredondado para mais ou para menos usando o método round. A classe
deve também conter um laço de repetição que encerre o programa quando o usuário fornecer
o valor zero(0) para o valor do produto. Dessa forma, o usuário digita o valor do produto,
a classe calcula e mostra o valor com acréscimo, a seguir solicita um novo valor. Esse
processo continua enquanto o valor do produto for diferente de zero; caso contrário o
programa será encerrado */

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        float produto;
        float acrecimo;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Para encerrar o programa Digite '0' no valor do produto!");
            System.out.println("Digite o valor do produto a ser corrigido: ");
            produto = teclado.nextFloat();
            if(produto!=0)
            {
                acrecimo = (12 * produto / 100);
                produto = (Math.round(produto + acrecimo));
                System.out.println("O valor do produto corrigido é:" + produto);
            }
        }while (produto!=0);
        System.out.println("Programa encerrado com Sucesso!");
    }

}
