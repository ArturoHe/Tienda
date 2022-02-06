package gui.registroylogin.agenda;

import gui.registroylogin.*;
import Clases.persona.proveedor.*;
import java.awt.BorderLayout;
import logica.*;
import gui.registroylogin.agenda.contacto.*;
import java.util.ArrayList;
import javax.swing.*;

public class PantallaAgenda extends javax.swing.JPanel {

    //Atributos
    private ArrayList<Proveedor> listaProveedoresClase = new ArrayList<>();

    //Get & Set
    public ArrayList<Proveedor> getListaProveedoresClase() {
        return listaProveedoresClase;
    }
    
    public void setListaProveedoresClase(ArrayList<Proveedor> listaProveedoresClase) {
        this.listaProveedoresClase = listaProveedoresClase;
    }

    /**
     * Creates new form Login
     */
    public PantallaAgenda() {
        
        if (Listas.getComienzoAgenda()== 0) {
            
            Listas.setListaProveedores(Listas.crearListaInicial());
            Listas.setComienzoAgenda(1);
            
        }
        
        setListaProveedoresClase(Listas.getListaProveedores());
        
        initComponents();
        limpiarLista();
        iniciarLista(getListaProveedoresClase());
        
        System.out.println(Listas.getListaProveedores());
        
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
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        botonVer = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaContactos = new javax.swing.JList<>();

        setMaximumSize(new java.awt.Dimension(350, 500));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new java.awt.BorderLayout());

        panelPrincipal.setBackground(new java.awt.Color(0, 0, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoPrincipal.setText("Agenda");
        jPanel2.add(textoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 90, 40));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        botonAtras.setText("jButton1");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        botonVer.setText("Ver");
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });
        jPanel5.add(botonVer);

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        jPanel5.add(botonEditar);

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanel5.add(botonAgregar);

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(botonEliminar);

        listaContactos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaContactos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaContactosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaContactos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        PantallaLogin p4 = new PantallaLogin();
        p4.setSize(350, 600);
        p4.setLocation(0, 0);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(p4, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        SeleccionAgenda p4 = new SeleccionAgenda();
        p4.setSize(350, 600);
        p4.setLocation(0, 0);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(p4, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        eliminarDatoDeLista();
        eliminarDato();
        Listas.setListaProveedores(listaProveedoresClase);

    }//GEN-LAST:event_botonEliminarActionPerformed

    private void listaContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaContactosMouseClicked
        // TODO add your handling code here:
        System.out.println(listaContactos.getSelectedIndex());
        System.out.println(listaContactos.getSelectedValue());
    }//GEN-LAST:event_listaContactosMouseClicked

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        // TODO add your handling code here:

        if (listaProveedoresClase.get(listaContactos.getSelectedIndex()).getClass() == ProveedorEmpresa.class) {
            
            VerAgendaEmpresa.setIndex(listaContactos.getSelectedIndex());

            VerAgendaEmpresa p1 = new VerAgendaEmpresa();
            p1.setSize(350, 600);
            p1.setLocation(0, 0);
            
            panelPrincipal.removeAll();
            panelPrincipal.add(p1, BorderLayout.CENTER);
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
            
        } else if(listaProveedoresClase.get(listaContactos.getSelectedIndex()).getClass() == ProveedorPersonaNatural.class) {

            VerAgendaPersonaNatural.setIndex(listaContactos.getSelectedIndex());

            VerAgendaPersonaNatural p1 = new VerAgendaPersonaNatural();
            p1.setSize(350, 600);
            p1.setLocation(0, 0);
            
            panelPrincipal.removeAll();
            panelPrincipal.add(p1, BorderLayout.CENTER);
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
            System.out.println("Persona");
            
        }
    }//GEN-LAST:event_botonVerActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        // TODO add your handling code here:
        if (listaProveedoresClase.get(listaContactos.getSelectedIndex()).getClass() == ProveedorEmpresa.class) {
            
            EditarAgendaEmpresa.setIndex(listaContactos.getSelectedIndex());

            EditarAgendaEmpresa p1 = new EditarAgendaEmpresa();
            p1.setSize(350, 600);
            p1.setLocation(0, 0);
            
            panelPrincipal.removeAll();
            panelPrincipal.add(p1, BorderLayout.CENTER);
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
            
        } else if(listaProveedoresClase.get(listaContactos.getSelectedIndex()).getClass() == ProveedorPersonaNatural.class) {

            EditarAgendaPersonaNatural.setIndex(listaContactos.getSelectedIndex());

            EditarAgendaPersonaNatural p1 = new EditarAgendaPersonaNatural();
            p1.setSize(350, 600);
            p1.setLocation(0, 0);
            
            panelPrincipal.removeAll();
            panelPrincipal.add(p1, BorderLayout.CENTER);
            panelPrincipal.revalidate();
            panelPrincipal.repaint();
            System.out.println("Persona");
            
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    //Mio
    private DefaultListModel agregarDato() {
        DefaultListModel modelo = (DefaultListModel) listaContactos.getModel();
        
        return modelo;
    }
    
    private DefaultListModel limpiarLista() {
        
        DefaultListModel modelo = new DefaultListModel();
        listaContactos.setModel(modelo);
        return modelo;
    }
    
    private DefaultListModel iniciarLista(ArrayList listaExterna) {
        DefaultListModel modelo = (DefaultListModel) listaContactos.getModel();
        
        ArrayList<Proveedor> listaLocal = new ArrayList<>();
        listaLocal = listaExterna;
        
        for (int i = 0; i < listaLocal.size(); i++) {
            
            modelo.addElement(listaLocal.get(i).getNombre());;
            
        }
        return modelo;
    }
    
    private DefaultListModel eliminarDato() {
        
        DefaultListModel modelo = (DefaultListModel) listaContactos.getModel();
        modelo.remove(listaContactos.getSelectedIndex());
        return modelo;
    }
    
    private void eliminarDatoDeLista() {
        
        ArrayList<Proveedor> listaLocal = new ArrayList<>();
        listaLocal = getListaProveedoresClase();
        
        int indexSeleccionado = listaContactos.getSelectedIndex();
        listaLocal.remove(indexSeleccionado);
        System.out.println("eliminado");
        
        setListaProveedoresClase(listaLocal);
        System.out.println(getListaProveedoresClase());
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonVer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaContactos;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel textoPrincipal;
    // End of variables declaration//GEN-END:variables

}
