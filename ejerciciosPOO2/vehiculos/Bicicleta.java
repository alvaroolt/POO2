package ejerciciosPOO2.vehiculos;

public class Bicicleta extends Vehiculo {

	private String tipoFrenos;
	
	public Bicicleta(String frenos) {
		super();
		this.tipoFrenos = frenos;
	}
	
	public void hacerCaballito() {
		System.out.println("¡La bicicleta está haciendo el caballito!");
	}
}