package integrador.barbtech.util;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class SetIcon {
    
    public void setIconJMArquivo(JMenu jmArquivo){
        
        Image iconImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\JAVA_DESKTOP_BARB_TECH\\src\\main\\java\\integrador\\barbtech\\icon\\arquivo.png");
        ImageIcon imageIcon = new ImageIcon(iconImage);
        jmArquivo.setIcon(imageIcon);
        
    }
    
    public void setIconJMIFechar (JMenuItem jmiFechar){
        
        Image iconImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\JAVA_DESKTOP_BARB_TECH\\src\\main\\java\\integrador\\barbtech\\icon\\fechar.png");
        ImageIcon imageIcon = new ImageIcon(iconImage);
        jmiFechar.setIcon(imageIcon);
        
    }

    public void setIconJMITrocarUsuario(JMenuItem jmiTrocarUsuario) {

        Image iconImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\JAVA_DESKTOP_BARB_TECH\\src\\main\\java\\integrador\\barbtech\\icon\\usuario.png");
        ImageIcon imageIcon = new ImageIcon(iconImage);
        jmiTrocarUsuario.setIcon(imageIcon);

    }

    public void setIconJMFerramentas(JMenu jmFerramentas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIconJMCadastrarEditar(JMenu jmCadastrarEditar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIconJMReativar(JMenu jmReativar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIconJMICadastrarEditarUsuario(JMenuItem jmiCadastrarEditarUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIconJMIReativarUsuario(JMenuItem jmiReativarUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
}
