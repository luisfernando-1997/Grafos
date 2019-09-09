
package Logica;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class Conexo {
    private int[][] matrizDeAdyacencia;
     

    public int[][] getMatrizDeAdyacencia() {
        return matrizDeAdyacencia;
    }

    public void setMatrizDeAdyacencia(int[][] matrizDeAdyacencia) {
        this.matrizDeAdyacencia = matrizDeAdyacencia;
    }
    public void probar()
    {
        recorridoProfundidad recorrido = new recorridoProfundidad();
        ArrayList<Integer> a = recorrido.recorridoProfunidad(0, matrizDeAdyacencia);

        if(a.size()==Grafo.NoVertices){
            String aux = "";
            for(int i = 0; i < a.size(); i++){
                aux = aux + a.get(i)+", ";
            }
            JOptionPane.showMessageDialog(null, "El grafo es conexo en: "+aux);
        }
        else{JOptionPane.showMessageDialog(null, "El grafo NO es conexo.");}
    }
   
    
}
