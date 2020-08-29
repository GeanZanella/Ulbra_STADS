package com.company;
//biblioteca que teve que ser adicionado para receber as informaçoes do teclado
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //criado um objeto a baixo chamdo teclado para receber as informaçoes das variaveis
        Scanner teclado = new Scanner(System.in);
        //variaveis do tipo reias abaixo
        float valor_produto, desconto_p,desconto_valor,valor_final;
        //entrada de dados
        System.out.print("Digite o valor do produto: ");
        valor_produto = teclado.nextFloat();
        System.out.print("Digite a porcentagem de desconto: ");
        desconto_p = teclado.nextFloat();
        //resolução do algoritmo
        desconto_valor=valor_produto*desconto_p/100;
        valor_final=valor_produto-desconto_valor;
        //saida das informações final
        System.out.printf("valor do produto com o desconto é: %.2f",valor_final);
    }
}
