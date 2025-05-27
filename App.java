import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.SwingUtilities;
public class App    { 

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
                int playerX = 50;
                int playerY =  (frame.getHeight()-100)-50 ;

                Player player = new Player(playerX,playerY, 50 , 50, new Color(255, 0, 00));
                Ground ground = new Ground(0, frame.getHeight() - 100, frame.getWidth() , 100, new Color(139, 69, 19));
                frame.add(ground);
                frame.add(player);

                int initPlayer = playerY;
                int jumpStr = 100;

                frame.addKeyListener(new KeyListener() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        int keyCode = e.getKeyCode();
                        if (keyCode == KeyEvent.VK_SPACE) { 
                          
                            player.setY(initPlayer - jumpStr);
                            frame.repaint(); 
                        }
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                       
                    }

                    @Override
                    public void keyTyped(KeyEvent e) {
                        
                    }
                });

              
                frame.setFocusable(true);
                frame.requestFocusInWindow();
                

                frame.setVisible(true);
            }
        });
    }
}