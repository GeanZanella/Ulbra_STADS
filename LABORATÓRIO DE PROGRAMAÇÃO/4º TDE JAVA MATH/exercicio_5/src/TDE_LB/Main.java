package TDE_LB;

/*Elabore uma classe que receba uma frase e verique que se essa frase
possui palavras impróprias. As palavras impróprias são: sexo e sexual.
Caso encontre uma dessas palavras, emita em tela a mensagem “conteúdo
impróprio”, caso contrário “conteúdo liberado”*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        String frase;
        System.out.print("Digite uma frase: ");
        frase = ler.nextLine();
        boolean improprio1 = frase.contains("sexo");
        boolean improprio2 = frase.contains("sexual");
        if((improprio2 == true) || (improprio1 == true))
        {
            System.out.print("conteúdo impróprio. ");
        }
        else{
            System.out.print("conteúdo liberado. ");
            }
    }
}
