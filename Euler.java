
package Logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Euler {
    private int[][] matrizDeAdyacencia;

    public int[][] getMatrizDeAdyacencia() {
        return matrizDeAdyacencia;
    }

    public void setMatrizDeAdyacencia(int[][] matrizDeAdyacencia) {
        this.matrizDeAdyacencia = matrizDeAdyacencia;
    }
    
    public boolean gradoPar()
    {
       
        int[][] matriz = getMatrizDeAdyacencia();
        for(int i=0; i < matriz.length; i++){
            int aux=0;
                for(int j=0; j < matriz.length; j++)
                {

                    if(matriz[i][j]>0)
                    {
                        aux += matriz[i][j];
                        
                    }
                    if(j+1 == matriz.length && aux%2!=0)
                    {
                        return false;
                    }
                }
            }
        return true;
    }
    
    public boolean dobleImpar()
    {
        int[][] matriz = getMatrizDeAdyacencia();
        Grafo grafo = new Grafo();setMatrizDeAdyacencia(matrizDeAdyacencia);
        grafo.setMatrizDeAdyacencia(matrizDeAdyacencia);
        int aux=0;
        for(int i=0; i < matriz.length; i++){
            if(grafo.grado(i)%2 != 0)
               aux+= 1;
            }
        if(aux == 2){return true;}
        return false;
    }
    public boolean conexo()
    {
        recorridoProfundidad recorrido = new recorridoProfundidad();
        ArrayList<Integer> a = recorrido.recorridoProfunidad(1, matrizDeAdyacencia);
        
        if(a.size()==Grafo.NoVertices){
            String aux = "";
            for(int i = 0; i < a.size(); i++){
               
                aux = aux + a.get(i)+", ";
            }
            
            
            
            return true;
        }
        else{return false;}
    }
    public void probarEuler(int inicial){
       System.out.println(conexo());
        
       recorridoProfundidad recorrido = new recorridoProfundidad();
            ArrayList<Integer> a = recorrido.recorridoProfunidad(inicial, matrizDeAdyacencia); 
            
            if(a.size()==Grafo.NoVertices){
            String aux = "";
            for(int i = 0; i < a.size(); i++){
                aux = aux + a.get(i)+", ";
            }
            int primero = a.get(0)-1;
            int segundo = a.size()-1;
               
                if(matrizDeAdyacencia[primero][segundo]>0){
                    aux = aux + a.get(0);
            if(conexo()==true){                
                System.out.println(dobleImpar());
                if(gradoPar()){
                    
                    System.out.println("entropar");
                    JOptionPane.showMessageDialog(null, "El grafo SI tiene circuito de euler."+aux);
                }
                
                else if(dobleImpar()){
                    System.out.println("entroimpar");
                    JOptionPane.showMessageDialog(null, "El grafo SI tiene camino de euler."+aux);
                }else{JOptionPane.showMessageDialog(null, "El grafo NO tiene circuito ni camino de euler."+aux);}
            }
    }
            }
            else{
                System.out.println("entree");
                JOptionPane.showMessageDialog(null, "El grafo NO tiene circuito ni camino de euler.");
            }
    }
}
