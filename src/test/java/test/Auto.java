package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int totalAsientos = 0;
		for (int i = 0; i< asientos.length; i++) {
			if (asientos[i] instanceof Asiento) {
				totalAsientos ++;
			}
		}
		return totalAsientos;
	}
	
	public String verificarIntegridad() {
		boolean estado = true;
		if (motor.registro != this.registro) {
			estado = false;
		}
		for (int i = 0; i< asientos.length; i++) {
			if (asientos[i] != null) {
				if (asientos[i].registro != this.registro) {
					estado = false;
				}
			}
		}
		if (estado == true) {
			return "Auto original";
		}else{
			return "Las piezas no son originales";
		}
	}
}
