package TDE_LB;

/* - Crie uma classe que exiba o substring de uma string FRASE composto
por todos os caracteres de FRASE exceto o último caracter.*/

public class Main
{

    public static void main(String[] args)
    {
        String frase = "FRASE";
        System.out.println(frase.substring(0,frase.length()-1));
    }
}
