import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Player extends JPanel{
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Player(int x,int y,int width,int height,Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;

        this.setBounds(x,y,width,height);
    }
@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 

        g.setColor(color); 
        g.fillRect(0, 0, width, height);
                                        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
        
    public void setY(int newY) {
        this.y = newY;
        
        setBounds(this.x, this.y, this.width, this.height);
    }
    
}