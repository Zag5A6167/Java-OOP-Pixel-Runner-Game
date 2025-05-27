import javax.swing.JFrame; 
import javax.swing.SwingUtilities; 

public class App { 

    public static void main(String[] args) {
      
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                JFrame frame = new JFrame("Java OOP Pixel Runner Game"); 

               
                frame.setSize(800, 400);
                frame.setResizable(false);
               
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
             
                frame.setLocationRelativeTo(null);

              
                frame.setVisible(true);
            }
        });
    }
}