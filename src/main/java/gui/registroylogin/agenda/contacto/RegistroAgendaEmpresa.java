package gui.registroylogin.agenda.contacto;

import Clases.persona.proveedor.Proveedor;
import Clases.persona.proveedor.ProveedorEmpresa;
import gui.registroylogin.agenda.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import logica.Listas;

public class RegistroAgendaEmpresa extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public RegistroAgendaEmpresa() {
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
        jPanel16 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        botonRegistrarme = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        textoErrorRegistro = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        fieldNombre = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        textoNombreEncargado = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        fieldCelular = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        textoCelular = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        fieldCorreo = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        textoCorreo = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        fieldProducto = new javax.swing.JTextField();
        jPanel33 = new javax.swing.JPanel();
        textoProducto = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        fieldPais = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        textoPais = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        fieldCiudad = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        textoCiudad = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        fieldDireccion = new javax.swing.JTextField();
        jPanel45 = new javax.swing.JPanel();
        textoDireccion = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        fieldNit = new javax.swing.JTextField();
        jPanel49 = new javax.swing.JPanel();
        textoNit = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        fieldRepLegal = new javax.swing.JTextField();
        jPanel53 = new javax.swing.JPanel();
        textoRepLegal = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        checkDocsenRegla = new javax.swing.JCheckBox();
        jPanel57 = new javax.swing.JPanel();
        textoDocsenRegla = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(350, 500));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setPreferredSize(new java.awt.Dimension(350, 600));
        setLayout(new java.awt.BorderLayout());

        panelPrincipal.setBackground(new java.awt.Color(225, 244, 203));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(350, 600));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(350, 600));

        jPanel1.setBackground(new java.awt.Color(225, 244, 203));

        jPanel2.setBackground(new java.awt.Color(241, 191, 152));
        jPanel2.setLayout(new java.awt.BorderLayout());

        textoPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        textoPrincipal.setText("Registro Empresa");
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

        jPanel16.setBackground(new java.awt.Color(225, 244, 203));

        jPanel29.setBackground(new java.awt.Color(241, 191, 152));

        botonRegistrarme.setText("Registrar Contacto");
        botonRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarmeActionPerformed(evt);
            }
        });
        jPanel29.add(botonRegistrarme);

        jPanel4.setOpaque(false);

        textoErrorRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(textoErrorRegistro);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel5.setBackground(new java.awt.Color(186, 203, 169));

        jPanel17.setOpaque(false);

        jPanel18.setBackground(new java.awt.Color(255, 255, 51));
        jPanel18.setOpaque(false);
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setOpaque(false);

        fieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        fieldNombre.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel19.add(fieldNombre);

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel20.setOpaque(false);

        textoNombreEncargado.setForeground(new java.awt.Color(0, 0, 0));
        textoNombreEncargado.setText("Nombre Encargado");
        jPanel20.add(textoNombreEncargado);

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setOpaque(false);

        jPanel22.setBackground(new java.awt.Color(255, 255, 51));
        jPanel22.setOpaque(false);
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setOpaque(false);

        fieldCelular.setForeground(new java.awt.Color(0, 0, 0));
        fieldCelular.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel23.add(fieldCelular);

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel24.setOpaque(false);

        textoCelular.setForeground(new java.awt.Color(0, 0, 0));
        textoCelular.setText("Celular");
        jPanel24.add(textoCelular);

        jPanel22.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setOpaque(false);

        jPanel26.setBackground(new java.awt.Color(255, 255, 51));
        jPanel26.setOpaque(false);
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setOpaque(false);

        fieldCorreo.setForeground(new java.awt.Color(0, 0, 0));
        fieldCorreo.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel27.add(fieldCorreo);

        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel28.setOpaque(false);

        textoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        textoCorreo.setText("Correo");
        jPanel28.add(textoCorreo);

        jPanel26.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setOpaque(false);

        jPanel31.setBackground(new java.awt.Color(255, 255, 51));
        jPanel31.setOpaque(false);
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setOpaque(false);

        fieldProducto.setForeground(new java.awt.Color(0, 0, 0));
        fieldProducto.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel32.add(fieldProducto);

        jPanel31.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel33.setOpaque(false);

        textoProducto.setForeground(new java.awt.Color(0, 0, 0));
        textoProducto.setText("Producto");
        jPanel33.add(textoProducto);

        jPanel31.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setOpaque(false);

        jPanel35.setBackground(new java.awt.Color(255, 255, 51));
        jPanel35.setOpaque(false);
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setOpaque(false);

        fieldPais.setForeground(new java.awt.Color(0, 0, 0));
        fieldPais.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel36.add(fieldPais);

        jPanel35.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel37.setOpaque(false);

        textoPais.setForeground(new java.awt.Color(0, 0, 0));
        textoPais.setText("Pais");
        jPanel37.add(textoPais);

        jPanel35.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel38.setOpaque(false);

        jPanel39.setBackground(new java.awt.Color(255, 255, 51));
        jPanel39.setOpaque(false);
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setOpaque(false);

        fieldCiudad.setForeground(new java.awt.Color(0, 0, 0));
        fieldCiudad.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel40.add(fieldCiudad);

        jPanel39.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel41.setOpaque(false);

        textoCiudad.setForeground(new java.awt.Color(0, 0, 0));
        textoCiudad.setText("Ciudad");
        jPanel41.add(textoCiudad);

        jPanel39.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel42.setOpaque(false);

        jPanel43.setBackground(new java.awt.Color(255, 255, 51));
        jPanel43.setOpaque(false);
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel44.setOpaque(false);

        fieldDireccion.setForeground(new java.awt.Color(0, 0, 0));
        fieldDireccion.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel44.add(fieldDireccion);

        jPanel43.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel45.setOpaque(false);

        textoDireccion.setForeground(new java.awt.Color(0, 0, 0));
        textoDireccion.setText("Direccion");
        jPanel45.add(textoDireccion);

        jPanel43.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel46.setOpaque(false);

        jPanel47.setBackground(new java.awt.Color(255, 255, 51));
        jPanel47.setOpaque(false);
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel48.setOpaque(false);

        fieldNit.setForeground(new java.awt.Color(0, 0, 0));
        fieldNit.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel48.add(fieldNit);

        jPanel47.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel49.setOpaque(false);

        textoNit.setForeground(new java.awt.Color(0, 0, 0));
        textoNit.setText("NIT");
        jPanel49.add(textoNit);

        jPanel47.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel50.setOpaque(false);

        jPanel51.setBackground(new java.awt.Color(255, 255, 51));
        jPanel51.setOpaque(false);
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel52.setOpaque(false);

        fieldRepLegal.setForeground(new java.awt.Color(0, 0, 0));
        fieldRepLegal.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel52.add(fieldRepLegal);

        jPanel51.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel53.setOpaque(false);

        textoRepLegal.setForeground(new java.awt.Color(0, 0, 0));
        textoRepLegal.setText("Rep. Legal");
        jPanel53.add(textoRepLegal);

        jPanel51.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel54.setOpaque(false);

        jPanel55.setBackground(new java.awt.Color(255, 255, 51));
        jPanel55.setOpaque(false);
        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel56.setOpaque(false);

        checkDocsenRegla.setForeground(new java.awt.Color(0, 0, 0));
        checkDocsenRegla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDocsenReglaActionPerformed(evt);
            }
        });
        jPanel56.add(checkDocsenRegla);

        jPanel55.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel57.setOpaque(false);

        textoDocsenRegla.setForeground(new java.awt.Color(0, 0, 0));
        textoDocsenRegla.setText("Docs. en Regla");
        jPanel57.add(textoDocsenRegla);

        jPanel55.add(jPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 28));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void botonRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarmeActionPerformed
        // TODO add your handling code here:
        if (verificarEspacios() == true) {

            Listas.setListaProveedores(agregarProveedor(Listas.getListaProveedores()));

            terminarRegistro();

        } else {

            textoErrorRegistro.setText("Debe diligenciar todos los espacios de texto");
        }
    }//GEN-LAST:event_botonRegistrarmeActionPerformed

    private void checkDocsenReglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDocsenReglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDocsenReglaActionPerformed

    //Mio
    private boolean verificarEspacios() {

        boolean espaciosLlenos;

        if (fieldCelular.getText().isEmpty()
                || fieldCiudad.getText().isEmpty()
                || fieldCorreo.getText().isEmpty()
                || fieldDireccion.getText().isEmpty()
                || fieldNit.getText().isEmpty()
                || fieldNombre.getText().isEmpty()
                || fieldPais.getText().isEmpty()
                || fieldProducto.getText().isEmpty()
                || fieldCelular.getText().isEmpty()
                || fieldRepLegal.getText().isEmpty()) {

            espaciosLlenos = false;

        } else {

            espaciosLlenos = true;
        }

        return espaciosLlenos;
    }

    public ArrayList agregarProveedor(ArrayList listaPrincipal) {

        ArrayList<Proveedor> listaLocal = new ArrayList<>();

        listaLocal = listaPrincipal;

        ProveedorEmpresa nuevoProveedor = new ProveedorEmpresa();

        nuevoProveedor.setNombre(fieldNombre.getText());
        nuevoProveedor.setCelular(fieldCelular.getText());
        nuevoProveedor.setCorreo(fieldCorreo.getText());
        nuevoProveedor.setProducto(fieldProducto.getText());
        nuevoProveedor.setPais(fieldPais.getText());
        nuevoProveedor.setCiudad(fieldCiudad.getText());
        nuevoProveedor.setDireccion(fieldDireccion.getText());
        nuevoProveedor.setNit(Integer.parseInt(fieldNit.getText()));
        nuevoProveedor.setRepresentanteLegal(fieldRepLegal.getText());
        nuevoProveedor.setDocumentosEnRegla(checkDocsenRegla.isSelected());

        listaLocal.add(nuevoProveedor);

        return listaLocal;

    }

    private final void volverPantallaAnterior() {
        SeleccionAgenda p1 = new SeleccionAgenda();
        p1.setSize(350, 600);
        p1.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p1, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    private final void terminarRegistro() {
        PantallaAgenda p2 = new PantallaAgenda();
        p2.setSize(350, 600);
        p2.setLocation(0, 0);

        panelPrincipal.removeAll();
        panelPrincipal.add(p2, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonRegistrarme;
    private javax.swing.JCheckBox checkDocsenRegla;
    private javax.swing.JTextField fieldCelular;
    private javax.swing.JTextField fieldCiudad;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JTextField fieldDireccion;
    private javax.swing.JTextField fieldNit;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldPais;
    private javax.swing.JTextField fieldProducto;
    private javax.swing.JTextField fieldRepLegal;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel textoCelular;
    private javax.swing.JLabel textoCiudad;
    private javax.swing.JLabel textoCorreo;
    private javax.swing.JLabel textoDireccion;
    private javax.swing.JLabel textoDocsenRegla;
    private javax.swing.JLabel textoErrorRegistro;
    private javax.swing.JLabel textoNit;
    private javax.swing.JLabel textoNombreEncargado;
    private javax.swing.JLabel textoPais;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JLabel textoProducto;
    private javax.swing.JLabel textoRepLegal;
    // End of variables declaration//GEN-END:variables
}
