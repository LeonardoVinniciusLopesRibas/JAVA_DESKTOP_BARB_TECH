package integrador.barbtech.controller;

import integrador.barbtech.dao.LoginDao;
import integrador.barbtech.interfaces.ControllerInterface;
import integrador.barbtech.view.LoginMain;
import integrador.barbtech.view.RetaguardaView;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class LoginController implements ControllerInterface {

    LoginDao ld = new LoginDao();

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

        /*if (valor[0].equals("")) {
            JOptionPane.showMessageDialog(null, "USUÁRIO NÃO FOI PREENCHIDO");
        } else if (valor[1].equals("")) {
            JOptionPane.showMessageDialog(null, "SENHA NÃO FOI PREENCHIDA");
        } else {
            StringBuilder hexBuilder = new StringBuilder();
            try {
                String password = (String) valor[1];
                MessageDigest digest = MessageDigest.getInstance("SHA-256");

                byte[] hashCriptografado = digest.digest(password.getBytes());

                for (byte b : hashCriptografado) {
                    String hex = Integer.toHexString(0xff & b);
                    if (hex.length() == 1) {
                        hexBuilder.append('0');
                    }
                    hexBuilder.append(hex);

                }

            } catch (NoSuchAlgorithmException nsae) {
                JOptionPane.showMessageDialog(null, nsae);
            }
            valor[1] = (Object) hexBuilder.toString();
            boolean usuarioExiste = ld.loginDao(valor);

            if (usuarioExiste) {
                // Cria uma instância da tela RetaguardaView e a exibe
                RetaguardaView retaguardaView = new RetaguardaView();
                retaguardaView.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            }
        }*/

    }

    public void loginController(String usuario, String senha){
        if (usuario.equals("")) {
        JOptionPane.showMessageDialog(null, "USUÁRIO NÃO FOI PREENCHIDO");
    } else if (senha.equals("")) {
        JOptionPane.showMessageDialog(null, "SENHA NÃO FOI PREENCHIDA");
    } else {
        StringBuilder hexBuilder = new StringBuilder();
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hashCriptografado = digest.digest(senha.getBytes());

            for (byte b : hashCriptografado) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexBuilder.append('0');
                }
                hexBuilder.append(hex);

            }

        } catch (NoSuchAlgorithmException nsae) {
            JOptionPane.showMessageDialog(null, nsae);
            System.out.println("integrador.barbtech.controller.LoginController"+nsae);
        }
        String senhaCriptografada = hexBuilder.toString();
        boolean usuarioExiste = ld.loginDao(usuario, senhaCriptografada);

        if (usuarioExiste) {
            // Cria uma instância da tela RetaguardaView e a exibe
            RetaguardaView retaguardaView = new RetaguardaView();
            LoginMain lm = new LoginMain();
            lm.dispose();
            retaguardaView.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            
        }
    }
    }
}
