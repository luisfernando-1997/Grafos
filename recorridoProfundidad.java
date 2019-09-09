
package Logica;

import java.util.ArrayList;


public class recorridoProfundidad {
    private boolean[] visitiadoProfunidad = new boolean[Grafo.NoVertices];
    
    public ArrayList<Integer> recorridoProfunidad(int nodoI, int[][] matriz) {

        //Lista donde guardo los nodos recorridos

        ArrayList<Integer> recorridos = new ArrayList<Integer>();

        visitiadoProfunidad[nodoI] = true;//El nodo inicial ya está visitado

        //Cola de visitas de los nodos adyacentes

        ArrayList<Integer> cola = new ArrayList<Integer>();

        recorridos.add(nodoI+1);//Listo el nodo como ya recorrido

        cola.add(nodoI);//Se agrega el nodo a la cola de visitas

        while (!cola.isEmpty()) {//Hasta que visite todos los nodos

            int j = cola.remove(0);//Se saca el primer nodo de la cola

            //Se busca en la matriz que representa el grafo los nodos adyacentes

            for (int i = 0; i < matriz.length; i++) {

        //Si es un nodo adyacente y no está visitado entonces

                if (matriz[j][i] > 0 && !visitiadoProfunidad[i]) {

                    cola.add(i);//Se agrega a la cola de visita

        //Se recorren los hijos del nodo actual de visita y se agrega el recorrido al la lista

                    recorridos.addAll(recorridoProfunidad(i, matriz));

                    visitiadoProfunidad[i] = true;//Se marca como visitado

                }

            }

        }

        return recorridos;//Se devuelve el recorrido del grafo en profundidad

    }

    public recorridoProfundidad() {
    }
}
