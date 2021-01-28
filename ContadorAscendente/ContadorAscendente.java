public class ContadorAscendente {
	static int cont = 0;
	static int maximo = 1000;

	public static void main(String[] args) {
		do{
			cont = cont + 1;
			System.out.println(cont);
		}
		while (cont < maximo);
	}
}