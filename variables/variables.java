public class variables {
	static int n = 50;	//	variable miembro de la clase.
						//	puede ser static (de hecho, lo es)

	public static void main(String[] args) {
		int m = 5, r = 0;	//	variables locales.
							//	no pueden ser static.
		r = n * m;
		System.out.println("El resultado es: " +r);
	}
}