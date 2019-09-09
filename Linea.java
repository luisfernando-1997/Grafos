
package Logica;

import java.awt.*;
import java.awt.geom.CubicCurve2D;


public class Linea {
     private int x1;
     private int y1;
     private int x2;
     private int y2;
     private int num; 
     
     public void Linea(Graphics g)
    {
        if(x1!=x2 && y1!=y2){
            g.setColor(Color.blue);
            g.drawLine(x1, y1, x2, y2);
        }else{
            g.setColor(Color.blue);
            g.drawOval(x1, y1, 20, 20);}
    }
    
     public void numero(Graphics g)
    {
        g.setColor(Color.black);
        g.drawString(String.valueOf(num), (x1+x2)/2 , (y1+y2)/2);
        
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Linea() {
    }

    public Linea(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

   
}
