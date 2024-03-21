package integrador.barbtech.view;

import integrador.barbtech.util.SetIcon;
import javax.swing.JFrame;

public class RetaguardaView extends javax.swing.JFrame {

    SetIcon si = new SetIcon();
    LoginMain lm = new LoginMain();
    
    public RetaguardaView() {
        initComponents();
        inicializaTelaCentro();
        si.setIconJMArquivo(jmArquivo);
        si.setIconJMIFechar(jmiFechar);
        si.setIconJMITrocarUsuario(jmiTrocarUsuario);
    }
    
    private void inicializaTelaCentro() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiTrocarUsuario = new javax.swing.JMenuItem();
        jmiFechar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );

        jmArquivo.setMnemonic('A');
        jmArquivo.setText("Arquivo");

        jmiTrocarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiTrocarUsuario.setText("Trocar Usuário");
        jmArquivo.add(jmiTrocarUsuario);

        jmiFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiFechar.setText("Fechar");
        jmiFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFecharActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiFechar);

        jMenuBar1.add(jmArquivo);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jmiFecharActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenuItem jmiFechar;
    private javax.swing.JMenuItem jmiTrocarUsuario;
    // End of variables declaration//GEN-END:variables
}
