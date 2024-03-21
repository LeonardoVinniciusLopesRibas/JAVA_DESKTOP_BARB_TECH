package integrador.barbtech.controller;

import integrador.barbtech.dao.LoginAdministradorDao;
import integrador.barbtech.interfaces.ControllerInterface;
import integrador.barbtech.view.LoginAdministrador;
import integrador.barbtech.view.RetaguardaAdministrador;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginAdministradorController implements ControllerInterface{

    LoginAdministradorDao lad = new LoginAdministradorDao();
    
    @Override
    public void saveController(Object... valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteController(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void readController(Object... valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int userId;
    public void loginController(String usuario, String senha, JFrame loginAdministrador) {
        
        if(usuario.equals("")){
            JOptionPane.showMessageDialog(null, "USUÁRIO NÃO FOI PREENCHIDO");
        }else if(senha.equals("")){
            JOptionPane.showMessageDialog(null, "SENHA NÃO FOI PREENCHIDA");
        }else{
            StringBuilder hexBuilder = new StringBuilder();
            try{
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hashCriptografado = digest.digest(senha.getBytes());
                
                for(byte b : hashCriptografado){
                    String hex = Integer.toHexString(0xff & b);
                    if(hex.length() == 1){
                        hexBuilder.append('0');
                    }
                    hexBuilder.append(hex);
                }
                
            }catch (NoSuchAlgorithmException nsae){
                JOptionPane.showMessageDialog(null, "integrador.barbtech.controller.LoginAdministradorController"+nsae);
            }
            String senhaCriptografada = hexBuilder.toString();
            int userId = lad.getUserId(usuario, senhaCriptografada);
            
            if(userId != -1){
                this.userId = userId;
                
                RetaguardaAdministrador retaguardaAdministrador = new RetaguardaAdministrador();
                loginAdministrador.dispose();
                retaguardaAdministrador.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválido");
            }
        }
    }
    public int getUserId(){
        return userId;
    }
    
}
