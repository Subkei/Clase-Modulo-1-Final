package oscurilandia;

/**
 * Clase Huevo
 * Define el lanzamiento de huevos en el tablero, e instancia los atributos Puntaje obtenido, posición en fila y columna
 * de donde cayo el proyectil, ya sea vertical u horizontal en el tablero.
 */
public class Huevo {

	// Atributos de la Clase Huevo
	private int filaH;
	private int columnaH;
	private int puntajeObtenido;

	// Constructor Clase Huevo
	public Huevo(int filaH, int columnaH, int puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
		this.filaH = filaH;
		this.columnaH = columnaH;
	}

	public Huevo() {

	}
	// Getters & Setters
	public int getPuntajeObtenido() {
		return puntajeObtenido;
	}

	public void setPuntajeObtenido(int puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
	}

	public int getFilaH() {
		return filaH;
	}

	public void setFilaH(int filaH) {
		this.filaH = filaH;
	}

	public int getColumnaH() {
		return columnaH;
	}

	public void setColumnaH(int columnaH) {
		this.columnaH = columnaH;
	}
	
	// Metodo toString de la Clase Huevo
	@Override
	public String toString() {
		return "Huevo [Fila: " + filaH + ", Columna: " + columnaH + ", Puntaje obtenido: " + puntajeObtenido + "]";
	}

}