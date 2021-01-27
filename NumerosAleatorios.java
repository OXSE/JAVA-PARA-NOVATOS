public class NumerosAleatorios {
	static int cont = 0;
	static int maximo = 10;

	public static void main(String[] args) {
		do{
			int numero = (int)(Math.random()*10+1);
			System.out.println("El numero aleatorio es: " +numero);
			cont = cont + 1;
		}
		while (cont < maximo);
	}
}