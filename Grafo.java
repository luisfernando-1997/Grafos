
package Logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Grafo {
    private int vertice;
    private int arista;
    
    public static int NoVertices = 0;
    private int[][] matrizDeAdyacencia;
    private int[][] valorArista;

    public int[][] getValorArista() {
        return valorArista;
    }

    public void setValorArista(int[][] valorArista) {
        this.valorArista = valorArista;
    }

    public int[][] getMatrizDeAdyacencia() {
        return matrizDeAdyacencia;
    }

    public void setMatrizDeAdyacencia(int[][] matrizDeAdyacencia) {
        this.matrizDeAdyacencia = matrizDeAdyacencia;
    }

    public int getNoVertices() {
        return NoVertices;
    }

    public void setNoVertices(int NoVertices) {
        this.NoVertices = NoVertices;
    }

    public Grafo() {
        matrizDeAdyacencia = new int[0][0];
        valorArista = new int[0][0];
    }
    
    public void rellenar()
    {
        int[][] auxMatrizDeAdyacencia;
        int[][] auxValorMatrizDeAdyacencia;
        auxMatrizDeAdyacencia = new int[getNoVertices()][getNoVertices()];
        auxValorMatrizDeAdyacencia = new int[getNoVertices()][getNoVertices()];
        for(int i=0; i<getNoVertices(); i++){
            
            for(int j=0; j<getNoVertices(); j++){
                auxMatrizDeAdyacencia[i][j]= 0;
                auxValorMatrizDeAdyacencia[i][j]= 0;
            }
        }
        for(int i = 0; i < matrizDeAdyacencia.length;i++){
            for(int j = 0; j < matrizDeAdyacencia[0].length;j++){
                auxMatrizDeAdyacencia[i][j]=matrizDeAdyacencia[i][j];
                auxValorMatrizDeAdyacencia[i][j]=valorArista[i][j];
            }
        }
        matrizDeAdyacencia = auxMatrizDeAdyacencia;
        valorArista = auxValorMatrizDeAdyacencia;
        /*for(int i = 0; i < matrizDeAdyacencia.length;i++){
            String aux = "";
            for(int j = 0; j < matrizDeAdyacencia[0].length;j++){
                aux = aux + Integer.toString(matrizDeAdyacencia[i][j]);
            }
            System.out.println(aux);
        }*/
    }
    
    public int grado(int vertice)
    {
        int[][] matriz = getMatrizDeAdyacencia();
        int aux = 0;
        for(int j=0; j < matrizDeAdyacencia.length; j++)
                {
                    if(matriz[vertice][j]>0)
                    {
                        aux = aux+matriz[vertice][j];
                        
                    }
                    if(vertice == j && matriz[vertice][j]>0){
                        aux += matriz[vertice][j];
                    }
                }
        return aux;
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }

    public int getArista() {
        return arista;
    }

    public void setArista(int arista) {
        this.arista = arista;
    }
    
    public void aristaMatriz(int v, int e)
    {   
         matrizDeAdyacencia[v][e]+=1;
    }
    public void valorAristaMatriz(int v, int e,int num)
    {   
         valorArista[v][e]=num;
    }
    
    public void caminoMasCorto(int inicio, int fin){
        boolean termino = false;
        ArrayList<ArrayList<Integer>> camino= new ArrayList<>();
        
        ArrayList<Integer> aux = new ArrayList<>();
        aux.add(0);
        aux.add(inicio);
        
        camino.add(aux);
        aux.clear();
        while(!termino){
            
        }
        
        System.out.println(camino);
        
        
    }
}
