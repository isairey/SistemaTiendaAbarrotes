/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.ventas;

import interfaces.Colores;
import static interfaces.Colores.PANEL_ABAJO;
import static interfaces.Colores.PANEL_ARRIBA;
import static interfaces.Colores.PANEL_CENTRO;
import interfaces.Fuentes;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Clase Vista Ventas.
 * Pantalla De Ventas.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 06/11/2023
 */
public class VistaVentas extends JDialog implements Fuentes, Colores{
     private final ImageIcon  ImArt = new ImageIcon(getClass().getResource("/imagenes/articulos/art.jpeg"));
     private ImageIcon  Imlupa = new ImageIcon(getClass().getResource("/imagenes/articulos/lupa.png"));
    JPanel PanelArriba = new JPanel();
    JPanel PanelCentro = new JPanel();
    JPanel PanelAbajo = new JPanel();
     public JLabel LblArt = new JLabel(ImArt);
    public JTextField TxtIdVenta = new JTextField();
    public JTextField TxtIdArticulo = new JTextField();
    public JTextField TxtFecha = new JTextField();
    public JTextField TxtMonto = new JTextField();
    public JTextField TxtIdCliente= new JTextField();
    public JTextField TxtIdEmpleados = new JTextField();
    public JButton BtnSalir = new JButton("Salir");
    public JButton BtnBorrar = new JButton("Borrar");
    public JButton BtnBuscar = new JButton("Buscar");
    public JButton BtnSearch = new JButton(Imlupa);
    public JButton BtnIngresar = new JButton("Ingresar");
    public JButton BtnActualizar = new JButton("Actualizar");
    public JLabel LblTitulo = new JLabel("REGISTRO DE VENTAS");
    public JLabel LblIdVenta = new JLabel("Id_Venta:");
    public JLabel LblIdArticulo = new JLabel("Id_Articulo:");
    public JLabel LblFecha = new JLabel("Fecha:");
    public JLabel LblMonto = new JLabel("Monto:");
    public JLabel LblIdCliente = new JLabel("Id_Cliente:");
    public JLabel LblIdEmpleados = new JLabel("Id_Empleados:");
    
    public VistaVentas(JFrame owner, boolean modal){
        super(owner,modal);
        configuracion();
        agregaPaneles();
 
   
    }

        private void configuracion() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(ImArt.getIconWidth(), ImArt.getIconHeight());
        this.setContentPane(LblArt);
        this.setLocationRelativeTo(null);
        this.setTitle("Ventas");
        this.setLayout(new BorderLayout());//Diseño Libre

        
    }
private void agregaPaneles(){
    //Caracteristicas de los paneles
    PanelArriba.setBackground(PANEL_ARRIBA);
    PanelAbajo.setBackground(PANEL_ABAJO);
    PanelCentro.setBackground(PANEL_CENTRO);
            this.add(PanelArriba,BorderLayout.NORTH);
            this.add(PanelCentro,BorderLayout.CENTER);
            this.add(PanelAbajo,BorderLayout.SOUTH);
    
    PanelCentro.setLayout(null);
    PanelCentro.setAlignmentX(CENTER_ALIGNMENT);
        PanelCentro.add(LblTitulo);
        PanelCentro.add(LblIdVenta);
        PanelCentro.add(TxtIdVenta);
        
        PanelCentro.add(LblIdArticulo);
        PanelCentro.add(TxtIdArticulo);
        
        PanelCentro.add(LblFecha);
        PanelCentro.add(TxtFecha);
        
        PanelCentro.add(LblMonto);
        PanelCentro.add(TxtMonto);
       
        PanelCentro.add(LblIdCliente);
        PanelCentro.add(TxtIdCliente);

        PanelCentro.add(LblIdEmpleados);
        PanelCentro.add(TxtIdEmpleados);
        

        //TXT
        TxtIdVenta.setBounds(600, 300, 200, 30);
        TxtIdArticulo.setBounds(600, 400, 200, 30);
        TxtFecha.setBounds(600, 500, 200, 30);
        TxtMonto.setBounds(600, 600, 200, 30);
        TxtIdCliente.setBounds(600, 700, 200, 30);
        TxtIdEmpleados.setBounds(600, 800, 200, 30);
       
        //LBL
        LblTitulo.setBounds(275, 100, 410, 100);
        LblIdVenta.setBounds(250, 300, 200, 30);
        LblIdArticulo.setBounds(250, 400, 200, 30);
        LblFecha.setBounds(250, 500, 200, 30);
        LblMonto.setBounds(250, 600, 200, 30);
        LblIdCliente.setBounds(250, 700, 200, 30);
        LblIdEmpleados.setBounds(250, 800, 200, 30);
        
         LblTitulo.setFont(FUENTE_TITLE);
        LblIdVenta.setFont(FUENTE_ART);
        LblIdArticulo.setFont(FUENTE_ART);
        LblFecha.setFont(FUENTE_ART);
        LblMonto.setFont(FUENTE_ART);
        LblIdCliente.setFont(FUENTE_ART);
        LblIdEmpleados.setFont(FUENTE_ART);
        
        //FONDO LBL
        LblTitulo.setBackground(FONDOTITLE);
        LblIdVenta.setBackground(FONDOLBL);
        LblIdArticulo.setBackground(FONDOLBL);
        LblFecha.setBackground(FONDOLBL);
        LblMonto.setBackground(FONDOLBL);
        LblIdCliente.setBackground(FONDOLBL);
        LblIdEmpleados.setBackground(FONDOLBL);
        
        LblTitulo.setOpaque(true);
        LblIdVenta.setOpaque(true);
        LblIdArticulo.setOpaque(true);
        LblFecha.setOpaque(true);
        LblMonto.setOpaque(true);
        LblIdCliente.setOpaque(true);
        LblIdEmpleados.setOpaque(true);
        
        //BTN
        PanelAbajo.setLayout(new GridLayout(1,6));
    PanelAbajo.setAlignmentX(CENTER_ALIGNMENT);
        PanelAbajo.add(BtnIngresar); 
        PanelAbajo.add(BtnActualizar);
        PanelAbajo.add(BtnBuscar);
        PanelAbajo.add(BtnBorrar);
        PanelAbajo.add(BtnSalir);
        PanelAbajo.add(BtnSearch);
        BtnIngresar.setSize(96, 48);
        BtnActualizar.setSize(96, 48);
        BtnBuscar.setSize(96, 48);
        BtnSearch.setSize(96, 48);
        BtnBorrar.setSize(96, 48);
        BtnSalir.setSize(96, 48);
}
   
    
}

