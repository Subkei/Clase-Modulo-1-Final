package oscurilandia;

/**
 * Clase Trupalla
 * Clase hija que hereda los atributos de Carro, e instancia los atributos Nivel de armadura con rango de 1 a 5,
 * y el Nombre de la persona que lo manipula.
 */ 
public class Trupalla extends Carro{

	// Atributos de la Clase Trupalla
	private int nivelArmadura; // nivel 1(menor) al 5(mayor)
	private String nombreTripulante;

	// Constructor Clase Trupalla
	public Trupalla(int cantidadOcupantes, int fechaIngreso, int i, int j, int nivelArmadura,
			String nombreTripulante) {
		super(cantidadOcupantes, fechaIngreso, i, j);
		this.nivelArmadura = nivelArmadura;
		this.nombreTripulante = nombreTripulante;
	}

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

}
