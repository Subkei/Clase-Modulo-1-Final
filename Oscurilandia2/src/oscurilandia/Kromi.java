package oscurilandia;

/**
 * Clase Kromi
 * Clase hija que hereda los atributos de Carro, e instancia los atributos Año de fabricación y Marca.
 * Despliega datos para crear el metodo Agregar Kromi.
 */
public class Kromi extends Carro {

	// Atributos de la Clase Kromi
	private int anioFabricacion;
	private String marca;

	// Constructor Clase Kromi
	public Kromi(int cantidadOcupantes, int fechaIngreso, int i, int j, int anioFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, i, j);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	}
	public Kromi() {
		super();
	}

	// Getters & Setters
	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Metodo toString de la clase Kromi
	@Override
	public String toString() {
		return "Kromi [\nAño de Fabricación: " + anioFabricacion + ", Marca: " + marca + "]";
	}

}
