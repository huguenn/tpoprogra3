# Algoritmo de Búsqueda en Anchura (BFS: Breadth First Search)
## Formato del archivo de salida:

Primera línea: Cantidad de Nodos - Cantidad de Aristas - Porcentaje de Adyacencia - Grado Máximo - Grado Mínimo -

Segunda línea: Cantidad de Ramas del Recorrido - Nodo Inicial (Raíz del Árbol del Recorrido)

(Cantidad de Ramas del Recorrido) líneas:
Nodo Inicial - Nodo Final

### Grafo Entrada
![alt text](https://github.com/maprigo/gimg/blob/master/bfs.png)



# Algoritmo de Búsqueda en Profundidad (DFS: Depth First Search)
## Formato del archivo de salida:

Primera línea: Cantidad de Nodos - Cantidad de Aristas - Porcentaje de Adyacencia - Grado Máximo - Grado Mínimo

Segunda línea: Cantidad de Ramas del Recorrido - Nodo Inicial (Raíz del Árbol del Recorrido)

(Cantidad de Ramas del Recorrido) líneas: Nodo Inicial - Nodo Final
### Grafo Entrada
![alt text](https://github.com/maprigo/gimg/blob/master/dfs.png)


# Algoritmo de Kruskal
## Formato del archivo de salida:

Primera línea: Cantidad de Nodos - Cantidad de Aristas - Porcentaje de Adyacencia - Grado Máximo - Grado Mínimo

Segunda línea: Costo del Árbol Abarcador Mínimo - Cantidad de Ramas del Árbol Abarcador Mínimo

(Cantidad de Ramas del Árbol Abarcador Mínimo) líneas: Nodo Inicial - Nodo Final - Costo de la Rama
### Grafo Entrada
![alt text](https://github.com/maprigo/gimg/blob/master/kruskal.png)



# Algoritmo de Prim
## Formato del archivo de salida:

Primera línea: Cantidad de Nodos - Cantidad de Aristas - Porcentaje de Adyacencia - Grado Máximo - Grado Mínimo

Segunda línea:
Costo del Árbol Abarcador Mínimo - Cantidad de Ramas del Árbol Abarcador Mínimo

(Cantidad de Ramas del Árbol Abarcador Mínimo) líneas: Nodo Inicial - Nodo Final - Costo de la Rama
### Grafo Entrada
![alt text](https://github.com/maprigo/gimg/blob/master/prim.png)



# Costo Algoritmos
## PRIM:
O(n^2) con matriz de adyacencia
O(nlogn) con cola de prioridad
O(n+alogn) con lista de aristas

## KRUSKAL:
O(aloga) con lista de aristas

## DFS: Busqueda en profundidad:
O(n+m) con pila
O(n^2) cuando el grafo es muy conexo
O(n) cuando el grafo es poco conexo

## BFS: Busqueda en archura
O(n+m) con cola
O(n^2) cuando el grafo es muy conexo
O(n) cuando el grafo es poco conexo
