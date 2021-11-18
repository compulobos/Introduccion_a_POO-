public class Calculadora{
	public String color;
	protected String nombre;

	public Calculadora(){
		this.color = "rojo";
	}

	public Calculadora(String my_color, String my_nombre){
		this.color = my_color;
		this.nombre = my_nombre;
	}

	public void set_color(String my_color){
		this.color = my_color;
	}

	public String get_color(){
		return this.color;	
	}
	public String get_nombre(){
		return this.nombre;	
	}
	public int suma(int numeroA,int  numeroB){
		return numeroA +numeroB;
	}
	public int resta(int numeroA,int numeroB){
		if (revisarSiRestaEsPosible(numeroA,numeroB)){
			return numeroA-numeroB;
		}
		return -1;
	}
	private boolean revisarSiRestaEsPosible(int numeroA,int numeroB){
		if (numeroA >= numeroB) return true;
		return false;
	}

	
}

