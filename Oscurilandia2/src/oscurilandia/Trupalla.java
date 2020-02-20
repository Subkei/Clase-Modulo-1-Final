package oscurilandia;

/**
 * Clase Trupalla
 * Clase hija que hereda los atributos de Carro, e instancia los atributos Nivel de armadura con rango de 1 a 5,
 * y el Nombre de la persona que lo manipula.
 * @author: Sebastián Acevedo. Oscurilandia 2.
 * @Version 
 * @see <a href="https://github.com/Subkei/Clase-Modulo-2-Final/tree/master/Oscurilandia2">Versión en Github</a>
 */ 
public class Trupalla extends Carro{

	// Atributos de la Clase Trupalla
	private int nivelArmadura; // nivel 1(menor) al 5(mayor)
	private String nombreTripulante;

	/**
	 * Constructor Clase Trupalla
	 * @param cantidadOcupantes Cantidad de Ocupantes
	 * @param fechaIngreso Fecha de Ingreso
	 * @param i posición i en el tablero
	 * @param j posición j en el tablero
	 * @param nivelArmadura Nivel de Armadura
	 * @param nombreTripulante Nombre de Tripulante
	 */
	public Trupalla(int cantidadOcupantes, int fechaIngreso, int i, int j, int nivelArmadura,
			String nombreTripulante) {
		super(cantidadOcupantes, fechaIngreso, i, j);
		this.nivelArmadura = nivelArmadura;
		this.nombreTripulante = nombreTripulante;
	}// Cierre del constructor

	public Trupalla() {

	}

	// Getters & Setters
	public int getNivelArmadura() {
		return nivelArmadura;	
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}


	public String getNombreTripulante() {
		return nombreTripulante;
	}


	public void setNombreTripulante(String nombreTripulante) {
		this.nombreTripulante = nombreTripulante;
	}

	// Metodo toString de la Clase Trupalla
	@Override
	public String toString() {
		return "Trupalla [\nNivel de armadura: " + nivelArmadura + ", Nombre del tripulante: " + nombreTripulante + "]";
	}

}//Cierre de la clase