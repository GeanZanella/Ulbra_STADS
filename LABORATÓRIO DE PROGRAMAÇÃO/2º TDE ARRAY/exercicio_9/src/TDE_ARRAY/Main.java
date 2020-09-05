package TDE_ARRAY;

/*Usando um array unidimensional de 10 elementos do tipo String, faça uma classe
que simule a ocupação de um estacionamento de veículos. Considere que a posição do
array corresponde ao número da vaga e para cada vaga é armazenada a placa do veículo
que está estacionado. Sua classe deve conter um laço de repetição simulando um menu
que controle a entrada e a saída dos veí- culos com as opções: 1-Entrada, 2-Saída e
3-Listar situação atual e 4-Encerrar o programa. Se o usuário escolher 1, solicite o
número da vaga e a placa do veículo; se escolher 2, solicite o número da vaga que será
liberada e armazene o valor branco na posição correspondente ao array; se escolher 3,
liste a situação atual apresentando em tela todos os elementos do array; quando for 4,
encerre o laço e o programa. */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String[] vaga = new String[10];
        int opition = 0;
        Scanner input = new Scanner(System.in);
        for(int i=0; i<vaga.length; i++)
        {
            vaga[i] = "";
        }
        do{
            System.out.println("Digite sua operação: \n 1 - Entrada \n 2 - Saída \n 3 - Listar \n 4 - Encerrar");
            opition = input.nextInt();
            while(opition>4 || opition<1){
                System.out.println("operação inválida, escolha novamente: \n 1 - Entrada \n 2 - Saída \n 3 - Listar \n 4 - Encerrar");
                opition = input.nextInt();
            }
            switch(opition)
            {
                case 1:
                    System.out.println("Opção selecionada com sucesso!");
                    for(int i=0; i<vaga.length; i++)
                    {
                        if(vaga[i]=="")
                        {
                            System.out.println("Digite a placa do carro: ");
                            vaga[i] = input.next();
                            System.out.println("O veiculo de placa "+vaga[i]+" ocupa a vaga de numero: "+i+1);
                            break;
                        }
                    }
                    break;
                case 2:
                    int saida = 0;
                    System.out.println("Opção selecionada com sucesso!");
                    System.out.println("As vagas preenchidas são: ");
                    for(int i=0; i<vaga.length; i++)
                    {
                        if(vaga[i]!="")
                        {
                            System.out.println("Vaga "+ (i+1) + " está ocupada pelo veiculo: "+vaga[i]);
                        }
                    }
                    System.out.println("Selecione o número da vaga que será liberada: ");
                    saida = input.nextInt();
                    while(saida>10 || saida<1)
                    {
                        System.out.println("Vaga inválida, selecione outra: ");
                        saida = input.nextInt();
                    }
                    if(vaga[saida-1]=="")
                    {
                        System.out.println("ERRO! Vaga vazia");
                    }
                    else{
                        vaga[saida-1] = "";
                        System.out.println("Saída realizada com sucesso!");
                    }
                    break;
                case 3:
                    System.out.println("Opção selecionada com sucesso!");
                    System.out.println("As vagas preenchidas são: ");
                    for(int i=0; i<vaga.length; i++)
                    {
                        if(vaga[i]!="")
                        {
                            System.out.println("Vaga "+ (i+1) + " está ocupada pelo veiculo: "+vaga[i]);
                        }
                    }
                    break;
            }
        }while(opition!=4);
        System.out.println("Programa encerrado com sucesso!");
    }
}
