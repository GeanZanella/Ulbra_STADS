package TDE_LB;
/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.*/
public class Main 
{

    public static void main(String[] args)
    {
       float media_1, media_2,soma;
       media_1=8+9+7/3;
       media_2=4+5+6/3;
       soma = media_1+media_2;
        System.out.println("A media de 8,9,7 é:"+media_1);
        System.out.println("A media de 4,5,6 é:"+media_2);
        System.out.println("A soma dasa medias é:"+soma);
    }
}
