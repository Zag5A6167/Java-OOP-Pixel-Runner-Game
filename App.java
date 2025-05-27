import javax.swing.JFrame; 
import javax.swing.SwingUtilities; 

import java.awt.Color;
public class App { 

    public static void main(String[] args) {
      
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                JFrame frame = new JFrame("Java OOP Pixel Runner Game"); 
                
                frame.setLayout(null);

                frame.setSize(800, 400);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);

                frame.getContentPane().setBackground(Color.WHITE);
                
                Ground ground = new Ground(0, frame.getHeight() - 100, frame.getWidth() , 100, new Color(139, 69, 19));
                frame.add(ground);

                frame.setVisible(true);
            }
        });
    }
}