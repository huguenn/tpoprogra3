package box;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GrafoNDNP {

	private MatrizSimetrica grafo;
	private int cantNodos;
	private int cantAristas;
	private double ptajeAdyacencia;
	private int gradoMax;
	private int gradoMin;

	private int colorMax = 1;
	private ArrayList<Nodo> nodos;
	private int[] nodosColoreados; // el indice coincide con el numero de nodo,
									// y el valor que guarda es el color
	private int[] gradosNodos;

	private int mejorColor = 0;
	private int[] solucion;
	private int[] mejoresColores;

	public GrafoNDNP(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner scan = new Scanner(file);
		int fil;
		int col;
		int indice;

		this.cantNodos = scan.nextInt();
		this.cantAristas = scan.nextInt();
		this.ptajeAdyacencia = scan.nextDouble();
		this.gradoMax = scan.nextInt();
		this.gradoMin = scan.nextInt();
		this.grafo = new MatrizSimetrica(this.cantNodos);

		this.colorMax = 1;
		nodos = new ArrayList<Nodo>();
		nodosColoreados = new int[this.cantNodos];
		gradosNodos = new int[this.cantNodos];
		solucion = new int[this.cantNodos];
		mejoresColores = new int[this.cantNodos];

		for (int i = 0; i < this.cantNodos; i++)
			gradosNodos[i] = 0;

		for (int i = 0; i < this.cantNodos; i++)
			mejoresColores[i] = 0;

		for (int i = 0; i < this.cantAristas; i++) {
			fil = scan.nextInt();
			col = scan.nextInt();
			gradosNodos[fil]++;
			gradosNodos[col]++;
			indice = this.grafo.getIndice(fil, col);
			this.grafo.ponerArista(indice);
		}

		for (int i = 0; i < this.cantNodos; i++) {
			Nodo nodo = new Nodo(i);
			nodo.setGrado(this.gradosNodos[i]);
			this.nodos.add(nodo);
		}

		scan.close();
	}

	public void mostrar() {
		this.grafo.mostrar();
	}

	public void mostrarNodos() {
		for (int i = 0; i < this.cantNodos; i++)
			System.out.println("n: " + this.nodos.get(i).getNroNodo() + " g: " + this.nodos.get(i).getGrado());
	}

	public void mostrarGrados() {
		for (int i = 0; i < this.cantNodos; i++)
			System.out.println("n: " + i + " g: " + this.gradosNodos[i]);
	}

	private void escribirSolucion(String algoritmo) throws IOException {
		FileWriter file = new FileWriter("COLOREO" + "_" + algoritmo + "_" + this.cantNodos + "_"
				+ String.format("%.2f", this.ptajeAdyacencia) + ".out");
		BufferedWriter buffer = new BufferedWriter(file);

		buffer.write(String.valueOf(this.cantNodos));
		buffer.write(" ");
		buffer.write(String.valueOf(this.colorMax));
		buffer.write(" ");
		buffer.write(String.valueOf(this.cantAristas));
		buffer.write(" ");
		buffer.write(String.valueOf(NumberFormat.getInstance().format(this.ptajeAdyacencia)));
		buffer.write(" ");
		buffer.write(String.valueOf(this.gradoMax));
		buffer.write(" ");
		buffer.write(String.valueOf(this.gradoMin));
		buffer.newLine();

		for (int i = 0; i < this.solucion.length; i++) {
			buffer.write(String.valueOf(i));
			buffer.write(" ");
			buffer.write(String.valueOf(this.solucion[i]));
			buffer.newLine();
		}

		buffer.close();
	}
	public int getCantNodos() {
		return cantNodos;
	}

	public int getCantAristas() {
		return cantAristas;
	}

	public double getPtajeAdyacencia() {
		return ptajeAdyacencia;
	}

	public int getGradoMax() {
		return gradoMax;
	}

	public int getGradoMin() {
		return gradoMin;
	}

	public MatrizSimetrica getGrafo() {
		return this.grafo;
	}

}
