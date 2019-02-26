package ejerciciosPOO2.vehiculos;

public class Coche extends Vehiculo {

	private String color;
	
	public Coche(String color) {
		super();
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void quemarRueda() {
		System.out.println("¡Chechuuu haz un derrapeee!");
	}
}