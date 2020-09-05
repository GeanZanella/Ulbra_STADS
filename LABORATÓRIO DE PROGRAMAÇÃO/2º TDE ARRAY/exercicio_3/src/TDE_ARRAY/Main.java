package TDE_ARRAY;

//Declare duas maneiras de declarar um array unidimensional de 12 doubles

public class Main
{
    public static void main(String[] args)
    {
        double vetor[]= new double[12];
        double[] vetor2 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0};
        int x;

        for(x=0; x<vetor2.length;x++)
        {
            System.out.println (vetor2[x]);
        }
    }
}


