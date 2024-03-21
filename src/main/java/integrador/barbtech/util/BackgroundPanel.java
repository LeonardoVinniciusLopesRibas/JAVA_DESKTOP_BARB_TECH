package integrador.barbtech.util;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel{
    
    private Image backImage;
    
    public BackgroundPanel(String imagePath){
        backImage = Toolkit.getDefaultToolkit().getImage(imagePath);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        g.drawImage(backImage, 0, 0, getWidth(), getHeight(), this);
    }
    
    
    
}
