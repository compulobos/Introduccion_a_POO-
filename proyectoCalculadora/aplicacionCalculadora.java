public class aplicacionCalculadora {
	private void mostrarMenu(){
		System.out.println("que deseas hacer?\n 1 : resta \n 2:sumar");
	}
	public static void main(String[] args) {
		//new aplicacionCalculadora().mostrarMenu();
		Calculadora calculadora1 = new Calculadora();
		calculadora1.resta(9,8);

		System.out.println(calculadora1.resta(7,8));
		//int resultado = calculadora1.suma(8,10);
		//System.out.println(resultado);
	}
}

//Cuando definimos un método debe de ir acompañado del acceso a la clase y 
//del tipo de dato que va a regresar
/*
public (cualquiera lo puede utilizar)
private (solo la clase lo puede utilizar)
protected son palabras que se refieren al encapsulamiento (solo algunas clases)
*/
//static -> significa que no necesito instanciar un objeto para poder usarlo