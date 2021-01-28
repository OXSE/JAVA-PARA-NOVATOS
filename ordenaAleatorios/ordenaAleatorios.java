public class ordenaAleatorios {
	static int cont = 0;
	static int maximo = 1000;

	public static void main(String[] args) {
		int serie[];
		int i, j, minimo, posicion_minimo;
		serie = new int[maximo];
		do{
			int numero = (int)(Math.random()*maximo+1);
			System.out.println("El numero aleatorio es: " +numero);
			serie[cont] = numero;
			cont = cont + 1;
		}
		while (cont < maximo);
		for (i = 0; i < maximo; i++)
		{
			minimo = serie[i];
			posicion_minimo = i;
			for (j = i; j < maximo; j++) 
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
		
		for (i = 0; i <= maximo - 1; i++) {
			System.out.println("El resultado es: " +serie[i]);		
		}
	}
}