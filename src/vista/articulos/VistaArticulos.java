/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.articulos;

import interfaces.Colores;
import static interfaces.Colores.PANEL_ABAJO;
import static interfaces.Colores.PANEL_ARRIBA;
import static interfaces.Colores.PANEL_CENTRO;
import interfaces.Fuentes;
import java.awt.BorderLayout;
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
 * Clase Vista Articulos.
 * Pantalla De Articulos.
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 17/10/2023
 */
public class VistaArticulos extends JDialog implements Fuentes, Colores{
     private ImageIcon  ImArt = new ImageIcon(getClass().getResource("/imagenes/articulos/art.jpeg"));
     private ImageIcon  Imlupa = new ImageIcon(getClass().getResource("/imagenes/articulos/lupa.png"));
    
    JPanel PanelArriba = new JPanel();
    JPanel PanelCentro = new JPanel();
    JPanel PanelAbajo = new JPanel();
    public JLabel LblArt = new JLabel(ImArt);
    public JTextField TxtId = new JTextField();
    public JTextField TxtArticulo = new JTextField();
    public JTextField TxtPrecio = new JTextField();
    public JTextField TxtMarca = new JTextField();
    public JTextField TxtCantidad = new JTextField();
    public JTextField TxtDescripcion = new JTextField();
    public JTextField TxtCategoria = new JTextField();
    public JTextField TxtIdProveedores = new JTextField();
    public JButton BtnSalir = new JButton("Salir");
    public JButton BtnBorrar = new JButton("Borrar");
    public JButton BtnBuscar = new JButton("Buscar");
    public JButton BtnSearch = new JButton(Imlupa);
    public JButton BtnIngresar = new JButton("Ingresar");
    public JButton BtnActualizar = new JButton("Actualizar");
    public JLabel LblTitulo = new JLabel("REGISTRO DE ARTICULOS");
    public JLabel LblId = new JLabel("Id Articulo:");
    public JLabel LblArticulo = new JLabel("Articulo:");
    public JLabel LblPrecio = new JLabel("Precio:");
    public JLabel LblMarca = new JLabel("Marca:");
    public JLabel LblCantidad = new JLabel("Cantidad:");
    public JLabel LblDes = new JLabel("Descripcion:");
    public JLabel LblCat = new JLabel("Categoria:");
    public JLabel LblIdProveedores = new JLabel("Id_Proveedor:");
    
    public VistaArticulos(JFrame owner, boolean modal){
        super(owner,modal);
        configuracion();
        agregaPaneles();
 
   
    }

        private void configuracion() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(ImArt.getIconWidth(), ImArt.getIconHeight());
        this.setContentPane(LblArt);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de Articulos");
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
        PanelCentro.add(LblId);
        PanelCentro.add(TxtId);
        
        PanelCentro.add(LblArticulo);
        PanelCentro.add(TxtArticulo);
        
        PanelCentro.add(LblPrecio);
        PanelCentro.add(TxtPrecio);
        
        PanelCentro.add(LblMarca);
        PanelCentro.add(TxtMarca);
       
        PanelCentro.add(LblCantidad);
        PanelCentro.add(TxtCantidad);

        PanelCentro.add(LblDes);
        PanelCentro.add(TxtDescripcion);
        
        PanelCentro.add(LblCat);
        PanelCentro.add(TxtCategoria);
        
        PanelCentro.add(LblIdProveedores);
        PanelCentro.add(TxtIdProveedores);

        //TXT
        TxtId.setBounds(600, 150, 200, 30);
        TxtArticulo.setBounds(600, 250, 200, 30);
        TxtPrecio.setBounds(600, 350, 200, 30);
        TxtMarca.setBounds(600, 450, 200, 30);
        TxtCantidad.setBounds(600, 550, 200, 30);
        TxtCategoria.setBounds(600, 650, 200, 30);
        TxtDescripcion.setBounds(600, 750, 200, 30);
        TxtIdProveedores.setBounds(600, 850, 200, 30);
        //LBL
        LblTitulo.setBounds(275, 10, 450, 100);
        LblId.setBounds(250, 150, 200, 30);
        LblArticulo.setBounds(250, 250, 200, 30);
        LblPrecio.setBounds(250, 350, 200, 30);
        LblMarca.setBounds(250, 450, 200, 30);
        LblCantidad.setBounds(250, 550, 200, 30);
        LblDes.setBounds(250, 650, 200, 30);
        LblCat.setBounds(250, 750, 200, 30);
        LblIdProveedores.setBounds(250, 850, 220, 30);
        
        LblTitulo.setFont(FUENTE_TITLE);
        LblId.setFont(FUENTE_ART);
        LblArticulo.setFont(FUENTE_ART);
        LblPrecio.setFont(FUENTE_ART);
        LblMarca.setFont(FUENTE_ART);
        LblCantidad.setFont(FUENTE_ART);
        LblDes.setFont(FUENTE_ART);
        LblCat.setFont(FUENTE_ART);
        LblIdProveedores.setFont(FUENTE_ART);
        //FONDO LBL
        LblTitulo.setBackground(FONDOTITLE);
        LblId.setBackground(FONDOLBL);
        LblArticulo.setBackground(FONDOLBL);
        LblPrecio.setBackground(FONDOLBL);
        LblMarca.setBackground(FONDOLBL);
        LblCantidad.setBackground(FONDOLBL);
        LblDes.setBackground(FONDOLBL);
        LblCat.setBackground(FONDOLBL);
        LblIdProveedores.setBackground(FONDOLBL);
        
        LblTitulo.setOpaque(true);
        LblId.setOpaque(true);
        LblArticulo.setOpaque(true);
        LblPrecio.setOpaque(true);
        LblMarca.setOpaque(true);
        LblCantidad.setOpaque(true);
        LblDes.setOpaque(true);
        LblCat.setOpaque(true);
        LblIdProveedores.setOpaque(true);
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

