class CalculadoraCientifica extends Calculadora implements {
	protected String tipo;
	private String color = "manzana";

	public CalculadoraCientifica(){
		this.tipo = "Quimica";
	}
	public String get_color(){
		return super.color + color + "oscuro";
	}
}

//encapsulamiento:
//	protected, extends, super
