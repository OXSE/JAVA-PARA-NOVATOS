// Ordenación por INTERCAMBIO DIRECTO (burbuja)
public class ordenaNumeros{

public static void main(String[] args)
{	
		int serie[];
		serie = new int[5];
		serie[0] = 5;
		serie[1] = 6;
		serie[2] = 2;
		serie[3] = 4;
		serie[4] = 8;
		int i, j, elem;
		for (i = 1; i < 5; i++)
		{
			for (j = 5 -1; j >= i; j--) 
			{
				if (serie[j-1] > serie[j]) 
				{
					elem = serie[j-1];
					serie[j-1] = serie[j];
					serie[j] = elem;
					System.out.println("El resultado es: " +elem);		
					}	
			}
		}
	}	
}
