public class PositivoNegativo {

	// Lee un número por teclado y lo devuelve
	public int leerPorTeclado() {
		int n;
		System.out.print("Escriba un numero entero: ");
		n = Integer.parseInt(System.console().readLine());
		return n;
	}

	// Comprueba si el numero es positivo, negativo o igual a cero
	public void comprobarNumero(int numero) {
		if (numero > 0 ) {
			System.out.println("El numero " + numero + " es POSITIVO");
		}
		else if (numero < 0 ) {
		System.out.println("El numero " + numero + " es NEGATIVO"); 			
		} else {
			System.out.println("El numero " + numero + " es CERO");
		}
	}
	//public static void main(String[] args) {
	//}
}

