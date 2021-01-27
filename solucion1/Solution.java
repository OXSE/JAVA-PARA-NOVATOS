// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
class Solution {
    public static void main(String[] args){
        // write your code in Java SE 8
        int a[] ={1, 3, 6, 4, 1, 2};
       	int perdido, encontrado, i, j, minimo, posicion_minimo;
       	int tamano;
       	tamano = a.length;
       	int aux[];
       	int contador = 1; 
       	perdido = 0;
       	encontrado = 0;
       	aux = new  int [tamano];
		for (i = 0; i < a.length; i++)
		{
			minimo = a[i];
			posicion_minimo = i;
			for (j = i; j < a.length; j++) 
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
		for (i=0; i<tamano; i++) {
			aux[i] = i + 1;
		}
		    for (i = 0; i < tamano; i++) {
		    	perdido = aux[i];
		    	encontrado = 0;
		    	for (j = 0; j < tamano; j++) {
					if (a[j] == perdido) {
					    encontrado = 1;
		    		}
       			}
       			if (encontrado == 0) {
       				break;
       			}
       		}
		for (i = 0; i <= a.length - 1; i++) {
			System.out.println("El resultado es: " +a[i]);		
		}
		System.out.println("El numero perdido es: " +perdido);
    }
}
