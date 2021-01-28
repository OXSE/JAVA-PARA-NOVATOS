public class RaizCuadradaPrueba {

	public static void main(String[] args) {
		RaizCuadrada rc = new RaizCuadrada();
		System.out.println("Introduzca un numero: ");
		double n = Double.parseDouble(System.console().readLine());
		double raiz = rc.calcularRaizCuadrada(n);
		System.out.println("La raiz de " + n + " es " + raiz);
	}
}