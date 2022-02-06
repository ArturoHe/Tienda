package gui.registroylogin;

import Clases.persona.cliente.Cliente;
import gui.opciones.PantallaInicio;
import java.awt.BorderLayout;
import gui.registroylogin.agenda.PantallaAgenda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import logica.Listas;

public class PantallaLogin extends javax.swing.JPanel {

    //Atributos
    private ArrayList<Cliente> listaClientesClase = new ArrayList<>();

    private Map<String, String> baseClientesClase = new HashMap<>();

    //Get & Set
    public ArrayList<Cliente> getListaClientesClase() {
        return listaClientesClase;
    }

    public void setListaClientesClase(ArrayList<Cliente> listaClientesClase) {
        this.listaClientesClase = listaClientesClase;
    }

    public Map<String, String> getBaseClientesClase() {
        return baseClientesClase;
    }

    public void setBaseClientesClase(Map<String, String> baseClientesClase) {
        this.baseClientesClase = baseClientesClase;
    }

    /**
     * Creates new form Login
     */
    public PantallaLogin() {
        initComponents();

        if (Listas.getComienzoLogin() == 0) {

            iniciarBaseClientes();
            Listas.setListaClientes(Listas.crearListaInicialClientes());
            Listas.setComienzoLogin(1);
        }

        traerBaseClientes();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        textoUsuario = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        textoContrasena = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        botonVerPassword = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        botonRegistro = new javax.swing.JButton();
        botonEntrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        textoPrincipal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        textoProovedores = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textoError = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(350, 500));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new java.awt.BorderLayout());

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 204));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(350, 600));
        jPanel7.setPreferredSize(new java.awt.Dimension(350, 500));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        textoUsuario.setText("Usuario");
        jPanel2.add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        fieldUsuario.setBackground(new java.awt.Color(255, 255, 255));
        fieldUsuario.setForeground(new java.awt.Color(0, 0, 0));
        fieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(fieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 53));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoContrasena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textoContrasena.setForeground(new java.awt.Color(0, 0, 0));
        textoContrasena.setText("Contraseña");
        jPanel3.add(textoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        fieldPassword.setBackground(new java.awt.Color(255, 255, 255));
        fieldPassword.setForeground(new java.awt.Color(0, 0, 0));
        fieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldPasswordMouseClicked(evt);
            }
        });
        jPanel3.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        botonVerPassword.setText("...");
        botonVerPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVerPasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonVerPasswordMouseReleased(evt);
            }
        });
        botonVerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(botonVerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 20, -1));

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(350, 40));

        botonRegistro.setForeground(new java.awt.Color(0, 0, 0));
        botonRegistro.setText("Registro");
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });
        jPanel4.add(botonRegistro);

        botonEntrar.setForeground(new java.awt.Color(0, 0, 0));
        botonEntrar.setText("Entrar");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });
        jPanel4.add(botonEntrar);

        jPanel5.setAutoscrolls(true);
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(350, 40));

        textoPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        textoPrincipal.setText("Tienda Ecomun");
        jPanel5.add(textoPrincipal);

        jPanel6.setOpaque(false);

        textoProovedores.setForeground(new java.awt.Color(0, 0, 255));
        textoProovedores.setText("¿Es Proovedor?, click  aqui.");
        textoProovedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textoProovedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoProovedoresMouseClicked(evt);
            }
        });
        jPanel6.add(textoProovedores);

        textoError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(textoError);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        add(panelPrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsuarioActionPerformed

    private void fieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldPasswordMouseClicked
        // TODO add your handling code here:
        fieldPassword.setEchoChar('*');
    }//GEN-LAST:event_fieldPasswordMouseClicked

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        // TODO add your handling code here:
        PantallaRegistro p1 = new PantallaRegistro();
        p1.setSize(350, 600);
        p1.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p1, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        // TODO add your handling code here:
        if (verificarEspacios() == false) {

            textoError.setText("Debe diligenciar los campos");
            
        } else {
            if (verificarIdentidad() == true) {
                irPantallaInicio();
            } else {
                textoError.setText("Usuario y/o Contrasena Incorrectos");
            }
        }

//        
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void textoProovedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoProovedoresMouseClicked
        // TODO add your handling code here:
        PantallaAgenda p2 = new PantallaAgenda();
        p2.setSize(350, 600);
        p2.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p2, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_textoProovedoresMouseClicked

    private void botonVerPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerPasswordMousePressed
        // TODO add your handling code here:
        fieldPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_botonVerPasswordMousePressed

    private void botonVerPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerPasswordMouseReleased
        // TODO add your handling code here:
        fieldPassword.setEchoChar('*');
    }//GEN-LAST:event_botonVerPasswordMouseReleased

    private void botonVerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerPasswordActionPerformed

    //Mio
    private boolean verificarIdentidad() {

        boolean acceso = false;

        String usuarioVerificar = fieldUsuario.getText();
        String contrasenaVerificar = String.valueOf(fieldPassword.getPassword());

        if (baseClientesClase.containsKey(usuarioVerificar)) {
            System.out.println("si esta");
            if (baseClientesClase.get(usuarioVerificar).equals(contrasenaVerificar)) {
                acceso = true;
            }

        } else {
            acceso = false;
        }

        return acceso;

    }

    private final void irPantallaInicio() {
        PantallaInicio p1 = new PantallaInicio();
        p1.setSize(350, 600);
        p1.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p1, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();

    }

    private void iniciarBaseClientes() {
        Listas.getBaseClientes().put("a", "a");
    }

    private void traerBaseClientes() {
        setBaseClientesClase(Listas.getBaseClientes());
    }

    private boolean verificarEspacios() {

        boolean espaciosLlenos;

        if (fieldUsuario.getText().isEmpty()
                || String.valueOf(fieldPassword.getPassword()).isEmpty()) {

            espaciosLlenos = false;
        } else {
            espaciosLlenos = true;
        }

        return espaciosLlenos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton botonVerPassword;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel textoContrasena;
    private javax.swing.JLabel textoError;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JLabel textoProovedores;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables

}
