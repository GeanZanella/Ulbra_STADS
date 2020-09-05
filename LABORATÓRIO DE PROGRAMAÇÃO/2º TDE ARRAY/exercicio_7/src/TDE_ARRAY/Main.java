package TDE_ARRAY;

/*Uma imagem é formada por pixels. Considere uma imagem com dimensão de 40 x 40 e
faça uma classe que contenha um array bidimensional com essas dimensões. A seguir,
para cada posição desse array bidimensional armazene um valor aleatório entre 0 e
255 (esses valores correspondem às tonalidades aplicadas sobre a imagem). Apresente
em tela os 1600 valores gerados.*/

import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        int[][] pixel = new int[40][40];
        Random cor = new Random();
        for(int i = 0; i<40; i++)
        {
            for(int j = 0; j<40; j++)
            {
                pixel[i][j] = cor.nextInt(256);
            }
        }
        for(int i = 0; i<40; i++)
        {
            for(int j = 0; j<40; j++)
            {
                System.out.println(pixel[i][j]);
            }
        }
    }
}

