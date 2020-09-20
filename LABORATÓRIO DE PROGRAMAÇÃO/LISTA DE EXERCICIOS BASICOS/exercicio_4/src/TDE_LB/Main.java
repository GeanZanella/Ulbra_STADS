package TDE_LB;

/*4. Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double ipi,valor_1,valor_2,total_1,total_2,soma;
        int quant_1,quant_2;
        String nome_1, nome_2;
        System.out.println("Digite a porcentagem de IPI a ser acrentada: ");
        ipi = teclado.nextDouble();
        System.out.println("Digite a descrição da primeira peça: ");
        nome_1 = teclado.next();
        System.out.println("Digite o valor do produto "+nome_1);
        valor_1 = teclado.nextDouble();
        System.out.println("digite a quantidade da peça "+nome_1+":");
        quant_1 = teclado.nextInt();
        System.out.println("Digite a descrição da segunda peça: ");
        nome_2 = teclado.next();
        System.out.println("Digite o valor do produto "+nome_2);
        valor_2 = teclado.nextDouble();
        System.out.println("digite a quantidade da peça "+nome_2+":");
        quant_2 = teclado.nextInt();
        total_1 = (quant_1*valor_1)*ipi/100;
        total_2 = (quant_2*valor_2)*ipi/100;
        soma= total_1+total_2;
        System.out.println("Voce comprou "+quant_1+" unidades do produto "+nome_1+" e pagara "+total_1+" Reais");
        System.out.println("Voce comprou "+quant_2+" unidades do produto "+nome_2+" e pagara "+total_2+" Reais");
    }
}
