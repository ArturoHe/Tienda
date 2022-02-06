package gui.registroylogin;

import Clases.persona.cliente.Cliente;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import logica.Listas;

public class PantallaRegistro extends javax.swing.JPanel {

    //Atributos
    private Map<String, String> baseClientesClaseReg = new HashMap<>();
    private ArrayList<Cliente> listaClientesClase = new ArrayList<>();

    //Get & Set
    public Map<String, String> getBaseClientesClaseReg() {
        return baseClientesClaseReg;
    }

    public void setBaseClientesClaseReg(Map<String, String> baseClientesClaseReg) {
        this.baseClientesClaseReg = baseClientesClaseReg;
    }

    public ArrayList<Cliente> getListaClientesClase() {
        return listaClientesClase;
    }

    public void setListaClientesClase(ArrayList<Cliente> listaClientesClase) {
        this.listaClientesClase = listaClientesClase;
    }

    /**
     * Creates new form PantallaRegistro
     */
    public PantallaRegistro() {
        initComponents();
        traerBaseClientes();
        traerListaClientes();
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
        jPanel16 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        fieldUsuario = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        textoUsuario = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        fieldContrasena = new javax.swing.JPasswordField();
        botonVerContrasena = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        textoContrasena = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        fieldRepetirContrasena = new javax.swing.JPasswordField();
        botonVerRepetirContrasena = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        textoRepetirContrasena = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        fieldNombre = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        textoNombre = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        fieldCelular = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        textoCelular = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        fieldCorreo = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        textoCorreo = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        botonRegistrarme = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        textoError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textoPrincipal = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(350, 600));
        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(270, 30));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldUsuario.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel6.add(fieldUsuario);

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        textoUsuario.setText("Usuario");
        jPanel5.add(textoUsuario);

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldContrasena.setPreferredSize(new java.awt.Dimension(150, 20));
        fieldContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldContrasenaMouseClicked(evt);
            }
        });
        fieldContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldContrasenaActionPerformed(evt);
            }
        });
        jPanel9.add(fieldContrasena);

        botonVerContrasena.setText("...");
        botonVerContrasena.setPreferredSize(new java.awt.Dimension(20, 20));
        botonVerContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVerContrasenaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonVerContrasenaMouseReleased(evt);
            }
        });
        botonVerContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerContrasenaActionPerformed(evt);
            }
        });
        jPanel9.add(botonVerContrasena);

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 28));

        textoContrasena.setText("Contrasena");
        jPanel10.add(textoContrasena);

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 51));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldRepetirContrasena.setPreferredSize(new java.awt.Dimension(150, 20));
        fieldRepetirContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldRepetirContrasenaMouseClicked(evt);
            }
        });
        jPanel13.add(fieldRepetirContrasena);

        botonVerRepetirContrasena.setText("...");
        botonVerRepetirContrasena.setPreferredSize(new java.awt.Dimension(20, 20));
        botonVerRepetirContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVerRepetirContrasenaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonVerRepetirContrasenaMouseReleased(evt);
            }
        });
        jPanel13.add(botonVerRepetirContrasena);

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.LINE_AXIS));

        textoRepetirContrasena.setText("Repetir Contrasena");
        jPanel14.add(textoRepetirContrasena);

        jPanel12.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 51));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldNombre.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel18.add(fieldNombre);

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        textoNombre.setText("Nombre");
        jPanel19.add(textoNombre);

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 51));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldCelular.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel22.add(fieldCelular);

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        textoCelular.setText("Celular");
        jPanel23.add(textoCelular);

        jPanel21.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 51));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldCorreo.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel26.add(fieldCorreo);

        jPanel25.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        textoCorreo.setText("Correo");
        jPanel27.add(textoCorreo);

        jPanel25.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonRegistrarme.setText("Registrarme");
        botonRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarmeActionPerformed(evt);
            }
        });
        jPanel28.add(botonRegistrarme);

        textoError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel29.add(textoError);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoPrincipal.setText("Registro");
        jPanel2.add(textoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 90, 40));

        jPanel30.setBackground(new java.awt.Color(255, 153, 0));

        botonAtras.setText("...");
        botonAtras.setPreferredSize(new java.awt.Dimension(30, 30));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        add(panelPrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        volverPantallaAnterior();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarmeActionPerformed
        // TODO add your handling code here:
        if (verificarEspacios() == true) {
            if (verificarSiExisteEnHashMap() == true) {

                textoError.setText("El usuario ya existe");
            } else {
                if (verificarContrasenas() == true) {

                    agregarClienteLista();
                    agregarClienteHashMap();
                    volverPantallaAnterior();

                }else{
                    textoError.setText("Las Contrasenas no coinciden");
                }

            }

            for (int i = 0; i < Listas.getListaClientes().size(); i++) {
                System.out.println(i);
            }

        } else {
            textoError.setText("Debe diligenciar todos los campos de texto");
        }
    }//GEN-LAST:event_botonRegistrarmeActionPerformed

    private void botonVerRepetirContrasenaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerRepetirContrasenaMouseReleased
        // TODO add your handling code here:
        fieldRepetirContrasena.setEchoChar('*');
    }//GEN-LAST:event_botonVerRepetirContrasenaMouseReleased

    private void botonVerRepetirContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerRepetirContrasenaMousePressed
        // TODO add your handling code here:
        fieldRepetirContrasena.setEchoChar((char) 0);
    }//GEN-LAST:event_botonVerRepetirContrasenaMousePressed

    private void fieldRepetirContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldRepetirContrasenaMouseClicked
        // TODO add your handling code here:
        fieldRepetirContrasena.setEchoChar('*');
    }//GEN-LAST:event_fieldRepetirContrasenaMouseClicked

    private void botonVerContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerContrasenaActionPerformed

    private void botonVerContrasenaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerContrasenaMouseReleased
        // TODO add your handling code here:
        fieldContrasena.setEchoChar('*');
    }//GEN-LAST:event_botonVerContrasenaMouseReleased

    private void botonVerContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerContrasenaMousePressed
        // TODO add your handling code here:
        fieldContrasena.setEchoChar((char) 0);
    }//GEN-LAST:event_botonVerContrasenaMousePressed

    private void fieldContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldContrasenaActionPerformed

    private void fieldContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldContrasenaMouseClicked
        // TODO add your handling code here:
        fieldContrasena.setEchoChar('*');
    }//GEN-LAST:event_fieldContrasenaMouseClicked

    //Mio
    private void traerBaseClientes() {
        setBaseClientesClaseReg(Listas.getBaseClientes());
    }

    private void traerListaClientes() {

        setListaClientesClase(Listas.getListaClientes());

    }

    private boolean verificarEspacios() {

        boolean espaciosLlenos;

        if (fieldUsuario.getText().isEmpty()
                || String.valueOf(fieldContrasena.getPassword()).isEmpty()
                || String.valueOf(fieldRepetirContrasena.getPassword()).isEmpty()
                || fieldNombre.getText().isEmpty()
                || fieldCelular.getText().isEmpty()
                || fieldCorreo.getText().isEmpty()) {

            espaciosLlenos = false;
        } else {
            espaciosLlenos = true;
        }

        return espaciosLlenos;
    }

    private boolean verificarSiExisteEnHashMap() {

        boolean existeElUsuario = false;

        if (baseClientesClaseReg.containsKey(fieldUsuario.getText()) == true) {

            existeElUsuario = true;
        }

        return existeElUsuario;

    }

    private void agregarClienteLista() {
        ArrayList<Cliente> listaClientesLocal = new ArrayList<>();

        listaClientesLocal = listaClientesClase;

        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setUsuario(fieldUsuario.getText());
        nuevoCliente.setContrasena(String.valueOf(fieldContrasena.getPassword()));
        nuevoCliente.setNombre(fieldNombre.getText());
        nuevoCliente.setCelular(fieldCelular.getText());
        nuevoCliente.setCorreo(fieldCorreo.getText());

        listaClientesLocal.add(nuevoCliente);
        Listas.setListaClientes(listaClientesLocal);

    }

    private void agregarClienteHashMap() {
        Map<String, String> baseClientesLocal = new HashMap<>();

        baseClientesLocal = baseClientesClaseReg;

        baseClientesLocal.put(fieldUsuario.getText(), String.valueOf(fieldContrasena.getPassword()));

        Listas.setBaseClientes(baseClientesLocal);

    }

    private boolean verificarContrasenas() {

        boolean contrasenasIguales = false;

        if (String.valueOf(fieldContrasena.getPassword()).equals(String.valueOf(fieldRepetirContrasena.getPassword()))) {

            contrasenasIguales = true;
        }

        return contrasenasIguales;
    }

    private final void volverPantallaAnterior() {
        PantallaLogin p1 = new PantallaLogin();
        p1.setSize(350, 600);
        p1.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p1, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonRegistrarme;
    private javax.swing.JButton botonVerContrasena;
    private javax.swing.JButton botonVerRepetirContrasena;
    private javax.swing.JTextField fieldCelular;
    private javax.swing.JPasswordField fieldContrasena;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JPasswordField fieldRepetirContrasena;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel textoCelular;
    private javax.swing.JLabel textoContrasena;
    private javax.swing.JLabel textoCorreo;
    private javax.swing.JLabel textoError;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JLabel textoRepetirContrasena;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables

}
