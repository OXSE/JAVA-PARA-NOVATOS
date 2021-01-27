import java.io.*;
/*
*	La clase circulo calcula y muestra
* 	el area y el perimetro de una circunferencia.
* 	El radio se lee por consola. 
*/

public class Circulo {

/**
*	calcula el area y el perimetro de un circulo
*/
	public static void main(String[] args) {
		double radio = 0;
		double area, circunf;
		radio = leeTeclado();
		area = calculaArea(radio);
		circunf = calculaCircunferencia(radio);
		muestraResultado(radio, area, circunf);
	}
/**
*	calcula el area de un circulo
*
*	@param r el radio del circulo
*	@return el area del circulo
*/

	public static double calculaArea(double r)	{
		double a;
		a = Math.PI * (r * r);
		return a;
	}
/** 
*	calcula el perimetro de un circulo
*	@param r el radio del circulo
*	@return el perimetro del circulo
*/
public static double calculaCircunferencia(double r) {
	double c;
	c = 2 * Math.PI * r;
	return c;
}	

/**
*	Lee el radio del circulo por teclado
*
*	@return el radio del circulo
*/
public static double leeTeclado() {
	double radio = 0;
	BufferedReader buffer = new
			BufferedReader(new InputStreamReader(System.in));
	System.out.printf("Imprime el valor del radio: ");
	try {
		radio = Double.parseDouble(buffer.readLine());
	}
	catch (Exception e) {
		System.out.println("Error en la lectura de datos");
	}
	return radio;
}

/**
*	Muestra el resultado 
*	
*	@param  r 		el radio del circulo 
* 	@param 	area 	el area del circulo
*	@param 	circunf la longitud de la circunferencia
*/
public static void muestraResultado(double r, double area, double circunf) {
	System.out.println("Radio: " +r);
	System.out.println("Area: " +area);
	System.out.format("Circunferencia: %.2f\n", circunf);
	}	
}