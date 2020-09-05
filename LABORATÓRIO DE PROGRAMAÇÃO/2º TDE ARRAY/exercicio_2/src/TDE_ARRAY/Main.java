package TDE_ARRAY;

/*Já que todos os strings são objetos de tipo String,
 mostre como chamar os métodos length( )
 e charAt( ) neste literal de string: “I like Java”.*/

public class Main
{
    public static void main(String[] args)
    {
        String texto = "I like Java";
        System.out.println("O texto tem "+texto.length()+" letras");
        System.out.println("A ultima letra do texto é:"+texto.charAt(texto.length()-1));
        for(int x=0; x< texto.length();x++)
        {
            System.out.println(texto.charAt(x));
        }
    }
}
