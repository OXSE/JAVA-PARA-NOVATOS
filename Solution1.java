public class Solution1{		
	static int cont = 0;
	static int longitud = 5;
	public static void main(String[] args) {
		// creamos la matriz de enteros a
		int a[];
		a = new int[longitud];
		do{
			int numero = (int)(Math.random()*10+1);
			System.out.println("El numero aleatorio es: " +numero);
			cont = cont + 1;
		}
		while (cont < longitud);
		// ordenamos la matriz de menor a mayor
		int i, j, minimo, posicion_minimo;
		for (i = 0; i < longitud; i++)
		{
			minimo = a[i];
			posicion_minimo = i;
			for (j = i; j < longitud; j++) 
			{
				if (a[j] < minimo) 
				{
					minimo = a[j];
					posicion_minimo = j;
					}	
			}
			a[posicion_minimo] = a[i];
			a[i] = minimo;
		}
		
		for (i = 0; i < longitud; i++) {
			System.out.println("El resultado es: " +a[i]);		
		}
	}
}