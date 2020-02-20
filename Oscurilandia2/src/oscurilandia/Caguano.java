package oscurilandia;

/**
 * Clase Caguano
 * Clase hija que hereda los atributos de Carro, e instancia los atributos Alcance de tiro y Color de confeti.
 * Despliega datos para crear el metodo Agregar Caguano. 
 * @author: Sebastián Acevedo. Oscurilandia 2.
 * @Version 
 * @see <a href="https://github.com/Subkei/Clase-Modulo-2-Final/tree/master/Oscurilandia2">Versión en Github</a>
 */
public class Caguano extends Carro {

	// Atributos de la Clase Caguano 
	private int alcanceTiro; // Atributo de tipo entero
	private String colorConfeti;

	/**
	 *  Constructor Clase Caguano
	 * @param cantidadOcupantes Cantidad de Ocupantes
	 * @param fechaIngreso Fecha de Ingreso
	 * @param i posición i en el tablero
	 * @param j posición j en el tablero
	 * @param alcanceTiro Alcance de Tiro
	 * @param colorConfeti Color de Confeti
	 */
	public Caguano(int cantidadOcupantes, int fechaIngreso, int i, int j, int alcanceTiro, String colorConfeti) {
		super(cantidadOcupantes, fechaIngreso, i, j);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}// Cierre del constructor
	
	public Caguano() {

	}

	// Getters & Setters
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	// Metodo toString de la Clase Caguano
	@Override
	public String toString() {
		return "Caguano [\nAlcance de tiro: " + alcanceTiro + ", Color de confeti: " + colorConfeti + "]";
	}

}//Cierre de la clase