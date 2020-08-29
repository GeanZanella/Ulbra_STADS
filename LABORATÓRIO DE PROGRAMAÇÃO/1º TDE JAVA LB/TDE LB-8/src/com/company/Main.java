package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int resul, num, x;
        System.out.print("digite um numero inteiro de 1 a 10: ");
        num= teclado.nextInt();

        for (x=1; x<=10; x++){
            resul = num*x;
            System.out.println(x + "X" + num + "=" + resul);
        }

    }
}
