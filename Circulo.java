
package Logica;

import java.awt.*;


public class Circulo {
    private int x;
    private int y;
    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    

    
    public Circulo() {
        
    }
    
    public void circulo(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillOval(getX(), getY(), 20, 20);
        
    }
    
    public void numero(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawString(String.valueOf(num), x , y);
        
    }

    
    public Circulo(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
