// Ordenación por INTERCAMBIO DIRECTO (burbuja)
public class ordenaSeleccionDirecta{

public static void main(String[] args)
{	
		int serie[];
		serie = new int[5];
		serie[0] = 5;
		serie[1] = 6;
		serie[2] = 2;
		serie[3] = 4;
		serie[4] = 8;
		int i, j, minimo, posicion_minimo;
		for (i = 0; i < 5; i++)
		{
			minimo = serie[i];
			posicion_minimo = i;
			for (j = i; j < 5; j++) 
			{
				if (serie[j] < minimo) 
				{
					minimo = serie[j];
					posicion_minimo = j;
					}	
			}
			serie[posicion_minimo] = serie[i];
			serie[i] = minimo;
		}
		
		for (i = 0; i <= 4; i++) {
			System.out.println("El resultado es: " +serie[i]);		
		}
	}	
}
