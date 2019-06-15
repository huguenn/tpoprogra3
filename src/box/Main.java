package box;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
			
		GrafoNDP grafokruskal = new GrafoNDP("Entrada/Kruskalgrafo.in");
		Kruskal kruskal = new Kruskal(grafokruskal);
		kruskal.ejecutar();
			
		System.out.println("--------------------------------------");	
		
		GrafoNDP grafoprim = new GrafoNDP("Entrada/Primgrafo.in");
		Prim prim = new Prim(grafoprim);
		prim.ejecutar();
		
		System.out.println("--------------------------------------");	
		
		GrafoNDNP grafodfs = new GrafoNDNP("Entrada/DFSgrafo.in");
		DFS dfs = new DFS(grafodfs, 4);
		dfs.ejecutar();
		
		System.out.println("--------------------------------------");		
			
		
		GrafoNDNP grafobfs = new GrafoNDNP("Entrada/BFSgrafo.in");
		BFS bfs = new BFS(grafobfs, 4);
		bfs.ejecutar();
		
	}
}
