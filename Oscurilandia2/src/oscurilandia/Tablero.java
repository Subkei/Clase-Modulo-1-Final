package oscurilandia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase Tablero permite definir las matrices y los metodos de Carro, Huevo,
 * Puntaje para cada Kromi, Caguano y Trupalla.
 * 
 * Seguridad PKS : Kromis = 3 cuadros, tipo int K (ubicados en vertical)
 * Caguanos = 2 cuadros, tipo int C (ubicados en horizontal) Trupallas = 1
 * cuadro, tipo int T (continua en la celda obtenida).
 * 
 * @author: Sebastián Acevedo. Oscurilandia 2.
 * @Version 
 * @see <a href="https://github.com/Subkei/Clase-Modulo-2-Final/tree/master/Oscurilandia2">Versión en Github</a>
 *
 */
 
public class Tablero {

	/* Lista estatica para Huevo y Carro */
	private static ArrayList<Huevo> HuevoLista;

	/* Arreglo para Kromi, Caguano y Trupalla */
	private static ArrayList<Kromi> KromiLista;
	private static ArrayList<Caguano> CaguanoLista;
	private static ArrayList<Trupalla> TrupallaLista;
	
	// Tablero estatico tipo char de valor null
	private static char tablero[][] = null; 
	// Se crea un objeto de la clase Scanner asociado al teclado
	private static Scanner lectura; 

	/**
	 * Constructor Tablero, se inicializan la dimension, tableros y barcos.
	 */
	public Tablero() {

	}

	/* Arreglos para Clase Huevo, Clase Carro, Kromi y Caguano. */
	private static void iniciar() {

		// Arreglos para Metodo Huevo y Carro
		HuevoLista = new ArrayList<Huevo>();
		
		// Matriz 15x15 con elementos
		tablero = new char[15][15];

		// Arreglos para Metodo Carros eliminados
		KromiLista = new ArrayList<Kromi>();
		CaguanoLista = new ArrayList<Caguano>();
		TrupallaLista = new ArrayList<Trupalla>();
		
		// Llenado de Tablero solo con espacios vacios
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				tablero[i][j] = ' ';
			}
		}
	}

	/**
	 * Metodo mostrar Tablero en consola.
	 * Recorre el arreglo y llena tablero con '.' para mejor visualización.
	 */

	public static void imprimirTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + ".");
			}
			System.out.println(); // Ingresa salto linea
		}
	}//Cierre del método

	/**
	 *  Metodo para agregar Kromi al tablero
	 */
	public static void agregarKromi() {

		Kromi kromi = new Kromi();

		// Inicializando los atributos a 0
		int filaK = 0;
		int columnaK = 0;

		// Solicitud de datos a usuario
		System.out.println("\nIngrese cantidad de Ocupantes");
		lectura.nextInt(); 
		System.out.println("\nFecha de ingreso");
		lectura.next();
		System.out.println("\nAño de fabricación");
		lectura.nextInt();
		System.out.println("\nIngrese Marca");
		lectura.next();

		/**
		 * Metodo para crear Kromi
		 * Asigna la pocisión de Kromi en el tablero Retorna falso si está
		 * vacio y si encuentra un Kromi verdadero termina por mostrar la fila y columna
		 * en el tablero.
		 */
		boolean valido = false;
		do {
			filaK = (int) (Math.random() * 13);
			columnaK = (int) (Math.random() * 15);

			if (tablero[filaK][columnaK] == ' ' && tablero[filaK + 1][columnaK] == ' '
					&& tablero[filaK + 2][columnaK] == ' ') {
				valido = true;
			}
		} while (valido == false);

		// Llamado a setters de la clase Kromi
		kromi.setI(filaK);
		kromi.setJ(columnaK);

		System.out.println("\nKromi ingresado en fila: " + filaK + ", columna: " + columnaK + " del tablero.");
		System.out.println("\nIngreso OK\n");

		tablero[filaK][columnaK] = 'K';
		tablero[filaK + 1][columnaK] = 'K';
		tablero[filaK + 2][columnaK] = 'K';
		
		/**
		 *  Se adjunta a la lista de la clase Kromi
		 */
		KromiLista.add(kromi); 
		return;
	}//Cierre del método

	/**
	 *  Metodo para agregar Caguano al tablero
	 */
	public static void agregarCaguano() {
		Caguano caguano = new Caguano();

		// Se inicializan los atributos a 0
		int filaC = 0;
		int columnaC = 0;

		System.out.println("\nIngrese cantidad de Ocupantes");
		lectura.nextInt();
		System.out.println("\nFecha de ingreso");
		lectura.nextInt();
		System.out.println("\nAlcance de tiro");
		lectura.nextInt();
		System.out.println("\nColor de confeti");
		lectura.next();

		/**
		 * Metodo para crear Caguano
		 * Asigna la pocisión de Caguano en el tablero Retorna falso si está
		 * vacio y si encuentra un Caguano verdadero termina por mostrar la fila y columna
		 * en el tablero.
		 */
		boolean valido = false;
		do {
			filaC = (int) (Math.random() * 15);
			columnaC = (int) (Math.random() * 13);

			if (tablero[filaC][columnaC] == ' ' && tablero[filaC][columnaC + 1] == ' ') {
				valido = true;
			}

		} while (valido == false);

		// Llamado a setters de la clase Caguano
		caguano.setI(filaC);
		caguano.setJ(columnaC);

		System.out.println("\nCaguano ingresado en fila: " + filaC + ", columna: " + columnaC + " del tablero.");
		System.out.println("\nIngreso OK\n");

		tablero[filaC][columnaC] = 'C';
		tablero[filaC][columnaC + 1] = 'C';

		/**
		 *  Se adjunta caguano a la lista Caguano
		 */
		CaguanoLista.add(caguano);
		return;

	}//Cierre del método

	/**
	 *  Metodo para agregar Trupalla al tablero
	 */
	public static void agregarTrupalla() {
		Trupalla trupa = new Trupalla();

		// Se inicializan los atributos a 0
		int filaT = 0;
		int columnaT = 0;

		System.out.println("\nIngrese cantidad de Ocupantes");
		lectura.nextInt();
		System.out.println("\nFecha de ingreso");
		lectura.nextInt();
		System.out.println("\nIngrese nivel de armadura (rango 1 al 5)");
		lectura.nextInt();
		System.out.println("\nIngrese el nombre del Tripulante");
		lectura.next();

		/**
		 * Metodo para crear Trupalla
		 * Asigna la pocisión de Trupalla en el tablero Retorna falso si está
		 * vacio y si encuentra un Trupalla verdadero termina por mostrar la fila y columna
		 * en el tablero.
		 */
		boolean valido = false;
		do {
			filaT = (int) (Math.random() * 15);
			columnaT = (int) (Math.random() * 15);

			if (tablero[filaT][columnaT] == ' ') {
				valido = true;
			}

		} while (valido == false);

		// Llamado a setters de la clase Trupalla
		trupa.setI(filaT);
		trupa.setJ(columnaT);

		System.out.println("\nTrupalla ingresado en fila: " + filaT + ", columna: " + columnaT + " del tablero.");
		System.out.println("\nIngreso OK\n");

		tablero[filaT][columnaT] = 'T';

		/**
		 * Se adjunta Trupa a la lista Trupalla
		 */
		TrupallaLista.add(trupa); 
		return;
	}//Cierre del método

	/**
	 * ------------ Instancias de la clase Huevo ----------------
	 */

	/**
	 * Metodo lanzar Huevo
	 * Solicita coordenadas para el lanzamiento de huevo, asigna puntaje por acierto y almacena en la lista.
	 * @return Retorna a la clase Huevo
	 */
	public static Huevo lanzarHuevo() {
		Huevo huevo = new Huevo();

		// Se inicializa el atributo a 0
		int puntajeObtenido = 0; 
		int filaH;
		int columnaH;

		System.out.println("Ingrese la fila del tablero: ");
		filaH = lectura.nextInt();
		System.out.println("Ingrese la columna del tablero: ");
		columnaH = lectura.nextInt();

		if (tablero[filaH][columnaH] == 'K') {
			puntajeObtenido = puntajeObtenido + 3; // Calculo de puntaje acierto Huevo para Kromi
			tablero[filaH][columnaH] = 'H';
		} else if (tablero[filaH][columnaH] == 'C') {
			puntajeObtenido = puntajeObtenido + 2; // Calculo de puntaje acierto Huevo para Caguano
			tablero[filaH][columnaH] = 'H';
		} else if (tablero[filaH][columnaH] == 'T') {
			puntajeObtenido = puntajeObtenido + 1; // Calculo de puntaje acierto Huevo para Trupalla
			tablero[filaH][columnaH] = 'H';
		} else {
			tablero[filaH][columnaH] = 'X';
		}

		System.out.println("Acierto en la fila: " + filaH + ", columna: " + columnaH + ".\n"
				+ "Puntaje obtenido por acierto: " + puntajeObtenido + ".\n");

		huevo.setFilaH(filaH);
		huevo.setColumnaH(columnaH);
		huevo.setPuntajeObtenido(puntajeObtenido);
		
		/**
		 *  Se adjunta a la lista de la clase Huevo
		 */
		HuevoLista.add(huevo); 

		return huevo;
	}//Cierre del método

	/**
	 *  Metodo calcular Puntaje
	 *  Suma puntajes asignados de cada lanzamiento y los muestra como resultado
	 */
	public static void calcularPuntaje() {

		// Se inicializa el atributo a 0
		int puntajeTotal = 0; 
		for (Huevo huevo : HuevoLista) {
			puntajeTotal = puntajeTotal + huevo.getPuntajeObtenido();
		}
		
		System.out.println("Puntaje por huevos: " + puntajeTotal);
		System.out.println("Puntaje por carros eliminados: " + carrosEliminados());
		puntajeTotal += carrosEliminados();
		System.out.println("\nPuntaje total: " + puntajeTotal + ".\n");
	}

	/**
	 * Metodo puntaje por carros eliminados
	 * @return Retorna Puntaje Total
	 */
	public static int carrosEliminados() {

		// Se inicializa el atributo a 0
		int puntajeTotal = 0; 
		for (Kromi kromi : KromiLista) {
			int filaK = kromi.getI();
			int columnaK = kromi.getJ();
			
			// Hace 3 condiciones, si se encuentra 'H' en la fila y columna, le suma un puntaje.
			if (tablero[filaK][columnaK] == 'H' && tablero[filaK + 1][columnaK] == 'H'
					&& tablero[filaK + 2][columnaK] == 'H') {
				puntajeTotal += 10; // 10 puntos adicionales por inutilizar un Kromi
			}
		}

		for (Caguano caguano : CaguanoLista) {
			int filaC = caguano.getI();
			int columnaC = caguano.getJ();

			if (tablero[filaC][columnaC] == 'H' && tablero[filaC][columnaC + 1] == 'H') {
				puntajeTotal += 7; // 7 puntos adicionales por inutilizar un Caguano
			}
		}
		return puntajeTotal; 
	}//Cierre del método

	/**
	 * Menu principal del programa
	 * Instrucciones de uso: El usuario ingresa datos para crear los carros Kromi,
	 * Caguano, Trupalla. Imprime tablero con ubicaciones de los carros y aciertos
	 * al lanzar huevos. Para lanzar huevos, se le solicita al usuario ingresar
	 * numero fila y columna. El puntaje obtenido se obtiene de los aciertos y los
	 * puntos adicionales por inutilizar un carro. "Si da a un Kromi, obtiene 3
	 * puntos" "Si da a un Caguano" obtiene 2 puntos" "Si da a un Trupaya, obtiene 1
	 * punto" "Si se inutiliza completamente un Kromi, son 10 puntos adicionales"
	 * "Si se inutiliza completamente un Caguano, son 7 puntos adicionales" "Si se
	 * inutiliza completamente un Trupalla, no lleva puntos adicionales".
	 */

	public static void main(String[] arg) {
	
		lectura = new Scanner(System.in);
		/* Llama a metodo que inicializa los arreglos */
		iniciar();

		int op = 0;
		do {
			
			System.out.println("------Bienvenido a Oscurilandia-------\n" + "\n1. Ingresar datos para Kromi"
					+ "\n2. Ingresar datos para Caguano" + "\n3. Ingresar datos para Trupalla"
					+ "\n4. Mostrar Carros PKS en el tablero" + "\n5. Tirar Huevos" + "\n6. Puntaje obtenido"
					+ "\n7. Salir de Oscurilandia\n" + "\nElija una Opción:");

			op = lectura.nextInt();
			switch (op) {
			case 1:
				// Llama al metodo Agregar carro Kromi
				agregarKromi(); 
				break;
			case 2:
				// Llama al metodo Agregar carro Caguano
				agregarCaguano(); 
				break;
			case 3:
				// Llama al metodo Agregar carro Trupalla
				agregarTrupalla(); 
				break;
			case 4:
				// Llama al metodo Mostrar los carros desplegados en el tablero
				imprimirTablero(); 
				break;
			case 5:
				// El usuario lanza huevo y arroja puntaje obtenido
				lanzarHuevo(); 
				break;
			case 6:
				// Llama al metodo Mostrar puntaje final
				calcularPuntaje();
				break;
			case 7:
				// Salir del programa y muestra Puntaje Final
				calcularPuntaje(); 
				System.out.println("Saliendo del programa..."); 
				break;
			default:
				// Error de opción incorrecta
				System.out.println("\nIngrese una opción valida\n"); 
				break;
			}
		} while (op != 7);

		lectura.close(); // Se cierra el objeto Scanner
	}
}//Cierre de la clase