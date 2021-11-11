public class Calculadora{
	public String color = "rojo";

	public void set_color(String my_color){
		this.color = my_color;
	}

	public String get_color(){
		return this.color;	
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
