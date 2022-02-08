package gui.registroylogin.agenda.contacto;

import gui.registroylogin.agenda.*;
import gui.registroylogin.*;
import gui.*;
import gui.opciones.PantallaInicio;
import java.awt.BorderLayout;
import gui.registroylogin.*;
import javax.swing.*;

public class SeleccionAgenda extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public SeleccionAgenda() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        textoPrincipal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        botonEmpresa = new javax.swing.JButton();
        botonPersonaNatural = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(350, 500));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new java.awt.BorderLayout());

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 204));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(350, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        textoPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoPrincipal.setText("Selecione el Tipo");
        jPanel2.add(textoPrincipal, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        botonAtras.setText("<");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel3.add(botonAtras);

        jPanel2.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(153, 153, 0));

        botonEmpresa.setText("Empresa");
        botonEmpresa.setPreferredSize(new java.awt.Dimension(120, 50));
        botonEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpresaActionPerformed(evt);
            }
        });
        jPanel7.add(botonEmpresa);

        botonPersonaNatural.setText("Persona Natural");
        botonPersonaNatural.setPreferredSize(new java.awt.Dimension(120, 50));
        botonPersonaNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonaNaturalActionPerformed(evt);
            }
        });
        jPanel7.add(botonPersonaNatural);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(panelPrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        volverPantallaAnterior();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonPersonaNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPersonaNaturalActionPerformed
        // TODO add your handling code here:
        irRegistroPersonas();
    }//GEN-LAST:event_botonPersonaNaturalActionPerformed

    private void botonEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpresaActionPerformed
        // TODO add your handling code here:
        irRegistroEmpresas();
    }//GEN-LAST:event_botonEmpresaActionPerformed
    
    
    //Mio
    
    private final void volverPantallaAnterior() {
        PantallaAgenda p2 = new PantallaAgenda();
        p2.setSize(350, 600);
        p2.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p2, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    private final void irRegistroEmpresas() {
        RegistroAgendaEmpresa p3 = new RegistroAgendaEmpresa();
        p3.setSize(350, 600);
        p3.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p3,BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    private final void irRegistroPersonas() {
        RegistroAgendaPersona p2 = new RegistroAgendaPersona();
        p2.setSize(350, 600);
        p2.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p2,BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonEmpresa;
    private javax.swing.JButton botonPersonaNatural;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel textoPrincipal;
    // End of variables declaration//GEN-END:variables
}
