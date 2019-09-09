
package Logica;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Hamilton {
    private int[][] matrizDeAdyacencia;
    Grafo a;

    public Hamilton(Grafo a) {
        this.a = a;
    }
    
    
    public boolean conHamil()
    {
        if(a.getNoVertices() >= 3){
        for(int i=0; i < a.getNoVertices(); i++)
        {
            if(a.grado(i)<(a.getNoVertices()))
            {
                return false;
            }
        }
        }
        else{return false;}
        return true;
        
    }

    public int[][] getMatrizDeAdyacencia() {
        return matrizDeAdyacencia;
    }

    public void setMatrizDeAdyacencia(int[][] matrizDeAdyacencia) {
        this.matrizDeAdyacencia = matrizDeAdyacencia;
    }
    
    
    public void probarHamilton(int inicial)
    {        
        if(conHamil() != true)
        {
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
                    JOptionPane.showMessageDialog(null, "El grafo tiene circuito de hamilton: "+aux);
                }else{JOptionPane.showMessageDialog(null, "El grafo tiene camino de hamilton: "+aux);}
            
            }
            else{JOptionPane.showMessageDialog(null, "El grafo NO tiene ningun recorrido de hamilton.");}

        }
        else
        {
            JOptionPane.showMessageDialog(null, "El grafo NO tiene ningun recorrido de hamilton.");
        }
  
    }
    
    
}
