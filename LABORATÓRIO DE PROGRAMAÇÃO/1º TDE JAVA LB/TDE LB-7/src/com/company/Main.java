package com.company;

/*-Faça uma classe que solicite login e senha, simulando o acesso a um sistema.
Considere que os conteúdos de login e senha originais são iguais a “java8”.
O usuário deverá fornecer login e senha e você irá compará-los com os conteúdos
originais. O usuário tem três chances para digitar corretamente os dados de login
e senha. Para cada tentativa incorreta deve aparecer uma mensagem alertando o erro e
apresentando a quantidade de tentativas que ainda restam.*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner teclado=new Scanner(System.in);
        int erro=4;
        String login,senha;
        System.out.print("Digite seu login: ");
        login = teclado.nextLine();
        System.out.print("Digite sua senha: ");
        senha=teclado.nextLine();
        while(!login.equals("gean") || !senha.equals("1234"))
        {
            erro=erro-1;
            if(!login.equals("gean") || !senha.equals("1234"))
            {
                System.out.println("ERRO! voçê tem mais "+erro+" tentativas");
                System.out.print("Digite seu login: ");
                login = teclado.nextLine();
                System.out.print("Digite sua senha: ");
                senha=teclado.nextLine();
                if(erro<=1)
                {
                    System.out.print("login bloqueado");
                    return;
                }
            }
        }
        if(login.equals("gean") && senha.equals("1234"))
        {
            System.out.print("\nLogin aceito!");
        }
    }
}
