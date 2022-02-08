package gui.principal.pantallas;

import Clases.producto.tipos.Cereal;
import Clases.producto.tipos.Verdura;
import gui.opciones.*;
import gui.principal.pantallas.producto.PantallaVerProducto;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PanelCereales extends javax.swing.JPanel {
    
    private static ArrayList<Cereal> listaCereales = new ArrayList<>();

    public static ArrayList<Cereal> getListaCereales() {
        return listaCereales;
    }

    public static void setListaCereales(ArrayList<Cereal> listaCereales) {
        PanelCereales.listaCereales = listaCereales;
    }

    

    /**
     * Creates new form PanelFrutas
     */
    public PanelCereales() {
        initComponents();
        limpiarLista();
        iniciarLista(listaCereales);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonVolverAtras = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPrincipal = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        botonVerProducto = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(350, 519));

        panelPrincipal.setMinimumSize(new java.awt.Dimension(350, 519));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cereales");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        botonVolverAtras.setText("<");
        botonVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonVolverAtras);

        jPanel2.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(0, 255, 0));

        listaPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listaPrincipal.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Banano", "Papaya", "Durazno", "Melon" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaPrincipal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaPrincipal);

        botonVerProducto.setText("Ver Producto");
        botonVerProducto.setPreferredSize(new java.awt.Dimension(150, 50));
        botonVerProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerProductoActionPerformed(evt);
            }
        });
        jPanel3.add(botonVerProducto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAtrasActionPerformed
        // TODO add your handling code here:
        PantallaInicio p1 = new PantallaInicio();
        p1.setSize(350, 519);
        p1.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p1,BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_botonVolverAtrasActionPerformed

    private void botonVerProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerProductoActionPerformed
        // TODO add your handling code here:
        verProducto();
    }//GEN-LAST:event_botonVerProductoActionPerformed

    //Mio
    
    private DefaultListModel limpiarLista() {
        
        DefaultListModel modelo = new DefaultListModel();
        listaPrincipal.setModel(modelo);
        return modelo;
    }
    
    
    private DefaultListModel iniciarLista(ArrayList listaExterna) {
        DefaultListModel modelo = (DefaultListModel) listaPrincipal.getModel();
        
        ArrayList<Cereal> listaLocal = new ArrayList<>();
        listaLocal = listaExterna;
        
        for (int i = 0; i < listaLocal.size(); i++) {
            
            modelo.addElement(listaLocal.get(i).getNombre());;
            
        }
        return modelo;
    }
    
    private void verProducto(){
        
        PantallaVerProducto.setIndex(listaCereales.get(listaPrincipal.getSelectedIndex()).getId());
        
        PantallaVerProducto p2 = new PantallaVerProducto();
        p2.setSize(350, 519);
        p2.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p2,BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVerProducto;
    private javax.swing.JButton botonVolverAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPrincipal;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
