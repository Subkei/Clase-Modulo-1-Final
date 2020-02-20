package oscurilandia;

/**
 * Clase Carro padre que instancia los atributos Ocupante y la fecha de ingreso, además de las ubicaciones i, j de tipo entero
 * en el tablero.
 * Despliega datos basicos como Mostrar tablero y coordenadas i, j en el tablero.
 * @author: Sebastián Acevedo. Oscurilandia 2.
 * @Version 
 * @see <a href="https://github.com/Subkei/Clase-Modulo-2-Final/tree/master/Oscurilandia2">Versión en Github</a>
 
 */
public class Carro {
	
	// Atributos de la Clase Carro
	private int cantidadOcupantes;
	private int fechaIngreso;
	private int i; //coordenada i en el tablero
	private int j; //coordenada j en el tablero

	/**
	 * Constructor Clase Carro
	 * @param cantidadOcupantes Cantidad de Ocupantes
	 * @param fechaIngreso Fecha de Ingreso
	 * @param i posición i en el tablero
	 * @param j posición j en el tablero
	 */
	
	public Carro(int cantidadOcupantes, int fechaIngreso, int i, int j) {
		super();
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.i = i;
		this.j = j;
	}// Cierre del constructor

	public Carro() {
	}

	// Getters & Setters
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public int getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(int fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	// Metodo toString de la Clase Carro
	@Override
	public String toString() {
		return "Carro [\nCantidad de ocupantes: " + cantidadOcupantes + ", Fecha de ingreso: " + fechaIngreso + ", Fila: " + i + ", Columna: "
				+ j + "]";
	}
}//Cierre de la clase