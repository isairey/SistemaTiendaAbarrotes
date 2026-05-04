/*
 * CONTROLADOR VISTA ARTICULOS
 */
package controlador.articulos;

import controlador.busqueda.ControladorVistaBusqueda;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.TEXT_CURSOR;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.articulos.ConsultasArticulos;
import modelo.articulos.ModeloArticulos;
import modelo.tablas.ModeloTablaArticulos;
import vista.articulos.VistaArticulos;
import vista.busqueda.VistaBusqueda;

/**
 * Controlador Vista Articulos.
 * Controla un objeto de tipo VistaArticulos.
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/10/23
 */
public class ControladorVistaArticulos implements MouseListener, KeyListener{
    protected ModeloArticulos ModeloArticulos;
    protected VistaArticulos VistaArticulos;
 
    
    protected ConsultasArticulos ConsultasArticulos = new ConsultasArticulos();
    
    public ControladorVistaArticulos(ModeloArticulos ModeloArticulos, VistaArticulos VistaArticulos) {
       this.ModeloArticulos = ModeloArticulos;
        this.VistaArticulos = VistaArticulos;
         
        oyentes();//Llamada a los oyentes
       this.VistaArticulos.setVisible(true);
    }
/**
 * Oyentes.
 */
    private void oyentes() {
        //TXT
        VistaArticulos.TxtId.addMouseListener(this);
        VistaArticulos.TxtArticulo.addMouseListener(this);
        VistaArticulos.TxtPrecio.addMouseListener(this);
        VistaArticulos.TxtMarca.addMouseListener(this);
        VistaArticulos.TxtCantidad.addMouseListener(this);
        VistaArticulos.TxtDescripcion.addMouseListener(this);
        VistaArticulos.TxtCategoria.addMouseListener(this);
        VistaArticulos.TxtIdProveedores.addMouseListener(this);
        //TXT K
        VistaArticulos.TxtId.addKeyListener(this);
        VistaArticulos.TxtArticulo.addKeyListener(this);
        VistaArticulos.TxtPrecio.addKeyListener(this);
        VistaArticulos.TxtMarca.addKeyListener(this);
        VistaArticulos.TxtCantidad.addKeyListener(this);
        VistaArticulos.TxtDescripcion.addKeyListener(this);
        VistaArticulos.TxtCategoria.addKeyListener(this);
        VistaArticulos.TxtIdProveedores.addKeyListener(this);
        //Lbl
        VistaArticulos.LblTitulo.addMouseListener(this);
        VistaArticulos.LblId.addMouseListener(this);
        VistaArticulos.LblArticulo.addMouseListener(this);
        VistaArticulos.LblPrecio.addMouseListener(this);
        VistaArticulos.LblMarca.addMouseListener(this);
        VistaArticulos.LblCantidad.addMouseListener(this);
        VistaArticulos.LblDes.addMouseListener(this);
        VistaArticulos.LblCat.addMouseListener(this);
        VistaArticulos.LblIdProveedores.addMouseListener(this);
        //BTN
        VistaArticulos.BtnBorrar.addMouseListener(this);
        VistaArticulos.BtnIngresar.addMouseListener(this);
        VistaArticulos.BtnActualizar.addMouseListener(this);
        VistaArticulos.BtnSalir.addMouseListener(this);
        VistaArticulos.BtnBuscar.addMouseListener(this);
        VistaArticulos.BtnSearch.addMouseListener(this);
    }

    
    
    private void llenarModeloConVista(){
        ModeloArticulos.setId(Integer.parseInt(VistaArticulos.TxtId.getText()));
        ModeloArticulos.setArticulo(VistaArticulos.TxtArticulo.getText());
        ModeloArticulos.setPrecio(Float.parseFloat(VistaArticulos.TxtPrecio.getText()));
        ModeloArticulos.setMarca(VistaArticulos.TxtMarca.getText());
        ModeloArticulos.setCantidad(Integer.parseInt(VistaArticulos.TxtCantidad.getText()));
        ModeloArticulos.setDescripcion(VistaArticulos.TxtDescripcion.getText());
        ModeloArticulos.setCategoria(VistaArticulos.TxtCategoria.getText());
        ModeloArticulos.setidProveedores(Integer.parseInt(VistaArticulos.TxtIdProveedores.getText()));
        
    }
    
    private void llenarVistaConModelo(){
         VistaArticulos.TxtId.setText(ModeloArticulos.getId()+"");
          VistaArticulos.TxtArticulo.setText(ModeloArticulos.getArticulo()+"");
           VistaArticulos.TxtPrecio.setText(ModeloArticulos.getPrecio()+"");
            VistaArticulos.TxtMarca.setText(ModeloArticulos.getMarca()+"");
             VistaArticulos.TxtCantidad.setText(ModeloArticulos.getCantidad()+"");
              VistaArticulos.TxtDescripcion.setText(ModeloArticulos.getDescripcion()+"");
               VistaArticulos.TxtCategoria.setText(ModeloArticulos.getCategoria()+"");
                VistaArticulos.TxtIdProveedores.setText(ModeloArticulos.getidProveedores()+"");
               
    }
    private void limpiaarCampos(){
         VistaArticulos.TxtId.setText("");
          VistaArticulos.TxtArticulo.setText("");
           VistaArticulos.TxtPrecio.setText("");
            VistaArticulos.TxtMarca.setText("");
             VistaArticulos.TxtCantidad.setText("");
              VistaArticulos.TxtDescripcion.setText("");
               VistaArticulos.TxtCategoria.setText("");
                VistaArticulos.TxtIdProveedores.setText("");
               
    }
    private boolean validarCampoId(){
        if (VistaArticulos.TxtId.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private boolean validarTodosLosCampos(){
        if (VistaArticulos.TxtId.getText().isEmpty()||
                VistaArticulos.TxtArticulo.getText().isEmpty()||
                VistaArticulos.TxtPrecio.getText().isEmpty()||
                VistaArticulos.TxtMarca.getText().isEmpty()||
                VistaArticulos.TxtCantidad.getText().isEmpty()||
                VistaArticulos.TxtDescripcion.getText().isEmpty()||
                VistaArticulos.TxtCategoria.getText().isEmpty()||
                VistaArticulos.TxtIdProveedores.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private void insertar(){
        if (validarTodosLosCampos()) {
           
        ModeloArticulos.setId(Integer.parseInt(VistaArticulos.TxtId.getText()));
        if (ConsultasArticulos.buscar(ModeloArticulos) == true) {
           JOptionPane.showMessageDialog(VistaArticulos, "Ese Articulo ya existe");
        }else{
          llenarModeloConVista();//llenarlo con datos
            if (ConsultasArticulos.insertar(ModeloArticulos)==true) {
              JOptionPane.showMessageDialog(null, "Articulo Guardado Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar el registro");
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo Id no debe estar vacio");
        
        }
}
    private void modificar(){
        if (validarTodosLosCampos()) {
            llenarModeloConVista();//DATOS DE MODIFICACION
            
            //para buscar el dato en el modelo Temporal y no modifique al modelo original
            ModeloArticulos ModeloTemporal = new ModeloArticulos();
            ModeloTemporal.setId(Integer.parseInt(VistaArticulos.TxtId.getText()));
        
            if (ConsultasArticulos.buscar(ModeloTemporal)==false) {//Busca con modelo temporal
                JOptionPane.showMessageDialog(VistaArticulos, "Ese Articulo no existe");
                
            }else{
                if (ConsultasArticulos.modificar(ModeloArticulos)) {
              JOptionPane.showMessageDialog(null, "Articulo Modificado Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar el registro");
        
            }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios");
        }
    }
    private void eliminar(){
        if (validarCampoId()) {
           
        ModeloArticulos.setId(Integer.parseInt(VistaArticulos.TxtId.getText()));
        if (ConsultasArticulos.buscar(ModeloArticulos) == false) {
           JOptionPane.showMessageDialog(VistaArticulos, "Ese Articulo no existe");
        }else{//PRoducto si existe por lomtanto se puede eliminar
          
            if (ConsultasArticulos.eliminar(ModeloArticulos)) {
              JOptionPane.showMessageDialog(null, "Articulo Eliminado Correctamente");
              limpiaarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        
            }
        }
    }else{
       JOptionPane.showMessageDialog(null, "El campo Id no debe estar vacio");
        
        }
}
    private void buscar(){//Se busca por codigo En TxtId
        if (validarCampoId()) {
           
        ModeloArticulos.setId(Integer.parseInt(VistaArticulos.TxtId.getText()));
        if (ConsultasArticulos.buscar(ModeloArticulos) == true) {//Producto si existe
           llenarVistaConModelo();//El modelo ya trae los datos buscados
        }else{
                JOptionPane.showMessageDialog(VistaArticulos.LblMarca, "El Regitro  no existe");
 
        }
    }else{
       JOptionPane.showMessageDialog(VistaArticulos, "Los campos no deben estar vacios");
        
        }
}
    private void salir(){
        int opc = JOptionPane.showConfirmDialog(VistaArticulos, "¿Deseas salir de Articulos?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opc == 0)  VistaArticulos.dispose();
            
        
    }
    
    private void busquedaMVC(){
        //Crear el MVC para la ventana Modale de buqueda +  el modelo tabla
        ModeloTablaArticulos ModeloTablaArticulos = new ModeloTablaArticulos();
        VistaBusqueda VistaBusqueda = new VistaBusqueda(new JFrame(), true);//Original
        
        //COntrolador
        ControladorVistaBusqueda ControladorSearch = new ControladorVistaBusqueda(ModeloTablaArticulos, ModeloArticulos, VistaBusqueda);
        llenarVistaConModelo();
        }
    
    //MSL 
    @Override
    public void mouseClicked(MouseEvent e) {
        //Txt
    if (e.getSource() == VistaArticulos.TxtId) {
               VistaArticulos.TxtId.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtArticulo) {
               VistaArticulos.TxtArticulo.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtPrecio) {
               VistaArticulos.TxtPrecio.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtMarca) {
               VistaArticulos.TxtMarca.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtCantidad) {
               VistaArticulos.TxtCantidad.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtDescripcion) {
               VistaArticulos.TxtDescripcion.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtCategoria) {
               VistaArticulos.TxtCategoria.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtIdProveedores) {
               VistaArticulos.TxtIdProveedores.setCursor(new Cursor(TEXT_CURSOR));

        }
     if (e.getSource() == VistaArticulos.BtnBorrar) {
               VistaArticulos.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
               eliminar();
        }
    if (e.getSource() == VistaArticulos.BtnIngresar) {
               VistaArticulos.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                  insertar();
        }
    if (e.getSource() == VistaArticulos.BtnActualizar) {
               VistaArticulos.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                  modificar();
        }
    if (e.getSource() == VistaArticulos.BtnBuscar) {
               VistaArticulos.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
                  buscar();
        }
    if (e.getSource() == VistaArticulos.BtnSearch) {
               VistaArticulos.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                 busquedaMVC();
        }
    if (e.getSource() == VistaArticulos.BtnSalir) {
               VistaArticulos.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
               salir();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
            //Txt
        if (e.getSource() == VistaArticulos.TxtId) {
               VistaArticulos.TxtId.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtArticulo) {
               VistaArticulos.TxtArticulo.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtPrecio) {
               VistaArticulos.TxtPrecio.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtMarca) {
               VistaArticulos.TxtMarca.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtCantidad) {
               VistaArticulos.TxtCantidad.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtDescripcion) {
               VistaArticulos.TxtDescripcion.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtCategoria) {
               VistaArticulos.TxtCategoria.setCursor(new Cursor(TEXT_CURSOR));

        }
    if (e.getSource() == VistaArticulos.TxtIdProveedores) {
               VistaArticulos.TxtIdProveedores.setCursor(new Cursor(TEXT_CURSOR));

        }
    
    if (e.getSource() == VistaArticulos.BtnBorrar) {
               VistaArticulos.BtnBorrar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaArticulos.BtnIngresar) {
               VistaArticulos.BtnIngresar.setCursor(new Cursor(HAND_CURSOR));
                 
        }
    if (e.getSource() == VistaArticulos.BtnActualizar) {
               VistaArticulos.BtnActualizar.setCursor(new Cursor(HAND_CURSOR));
                
        }
    if (e.getSource() == VistaArticulos.BtnBuscar) {
               VistaArticulos.BtnBuscar.setCursor(new Cursor(HAND_CURSOR));
              
        }
    if (e.getSource() == VistaArticulos.BtnSearch) {
               VistaArticulos.BtnSearch.setCursor(new Cursor(HAND_CURSOR));
                
        }
    if (e.getSource() == VistaArticulos.BtnSalir) {
               VistaArticulos.BtnSalir.setCursor(new Cursor(HAND_CURSOR));
            
        }
    
    }
    //BTN
        

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
       if (e.getSource() == VistaArticulos.TxtId) {
               //validarSoloNumeros(e);
               if (e.getKeyChar()==e.VK_ENTER) {
                   if (validarSoloNumeros(VistaArticulos.TxtId.getText(),5,e)==true) {
                        VistaArticulos.TxtArticulo.requestFocus();
                   }else{
                       VistaArticulos.TxtId.setText("");//Limpia el campo
                   }
            }
        }
    if (e.getSource() == VistaArticulos.TxtArticulo) {
               validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_ENTER) {
                   
                VistaArticulos.TxtPrecio.requestFocus();
            }

        }
    if (e.getSource() == VistaArticulos.TxtPrecio) {
               if (e.getKeyChar()==e.VK_ENTER) {
                   if (validarSoloReales(VistaArticulos.TxtPrecio.getText(),10,e)==true) {
                       VistaArticulos.TxtMarca.requestFocus();
                   }else{
                       VistaArticulos.TxtPrecio.setText("");//Limpia el campo
                   }
                
            }

        }
    if (e.getSource() == VistaArticulos.TxtMarca) {
                validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_ENTER) {
                   
                VistaArticulos.TxtCantidad.requestFocus();
            }
        }
    if (e.getSource() == VistaArticulos.TxtCantidad) {
               if (e.getKeyChar()==e.VK_ENTER) {
                   if (validarSoloNumeros(VistaArticulos.TxtCantidad.getText(),5,e)==true) {
                          VistaArticulos.TxtDescripcion.requestFocus();
                   }else{
                         VistaArticulos.TxtCantidad.setText("");//Limpia el campo
                   }
            }
        }
    if (e.getSource() == VistaArticulos.TxtDescripcion) {
                validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_ENTER) {
                   
                VistaArticulos.TxtCategoria.requestFocus();
            }

        }
    if (e.getSource() == VistaArticulos.TxtCategoria) {
            validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_ENTER) {
                   
                VistaArticulos.TxtIdProveedores.requestFocus();
            }

        }
    if (e.getSource() == VistaArticulos.TxtIdProveedores) {
               if (e.getKeyChar()==e.VK_ENTER) {
                if (validarSoloNumeros(VistaArticulos.TxtIdProveedores.getText(),5,e)==true) {
                          VistaArticulos.TxtId.requestFocus();
                   }else{
                         VistaArticulos.TxtIdProveedores.setText("");//Limpia el campo
                   }
            }   
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
     if (e.getSource() == VistaArticulos.TxtId) {
            if (e.getKeyChar()==e.VK_DOWN) {
                   if (validarSoloNumeros(VistaArticulos.TxtId.getText(),5,e)==true) {
                        VistaArticulos.TxtArticulo.requestFocus();
                   }else{
                       VistaArticulos.TxtId.setText("");//Limpia el campo
                   }
            }
        }
    if (e.getSource() == VistaArticulos.TxtArticulo) {
               validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_DOWN) {
                VistaArticulos.TxtPrecio.requestFocus();
            }

        }
    if (e.getSource() == VistaArticulos.TxtPrecio) {
              if (e.getKeyChar()==e.VK_DOWN) {
                   if (validarSoloReales(VistaArticulos.TxtPrecio.getText(),10,e)==true) {
                       VistaArticulos.TxtMarca.requestFocus();
                   }else{
                       VistaArticulos.TxtPrecio.setText("");//Limpia el campo
                   }
                
            }

        }
    if (e.getSource() == VistaArticulos.TxtMarca) {
                validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_DOWN) {
                   
                VistaArticulos.TxtCantidad.requestFocus();
            }
        }
    if (e.getSource() == VistaArticulos.TxtCantidad) {
            if (e.getKeyChar()==e.VK_DOWN) {
                if (validarSoloNumeros(VistaArticulos.TxtCantidad.getText(),5,e)==true) {
                          VistaArticulos.TxtDescripcion.requestFocus();
                   }else{
                         VistaArticulos.TxtCantidad.setText("");//Limpia el campo
                   }
            }
        }
    if (e.getSource() == VistaArticulos.TxtDescripcion) {
                validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_DOWN) {
                   
                VistaArticulos.TxtCategoria.requestFocus();
            }

        }
    if (e.getSource() == VistaArticulos.TxtCategoria) {
             validarSoloLetras(e);
               if (e.getKeyChar()==e.VK_DOWN) {
                  
                VistaArticulos.TxtIdProveedores.requestFocus();
            }

        }
    if (e.getSource() == VistaArticulos.TxtIdProveedores) {
               if (e.getKeyChar()==e.VK_DOWN) {
                if (validarSoloNumeros(VistaArticulos.TxtIdProveedores.getText(),5,e)==true) {
                          VistaArticulos.TxtId.requestFocus();
                   }else{
                         VistaArticulos.TxtIdProveedores.setText("");//Limpia el campo
                   }
            }      
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
        //VALIDAR
    private boolean validarSoloNumeros(String Cadena, int longitud,KeyEvent e) {
        if ((Cadena.matches("[0-9,.]+") || (Cadena.length() < longitud+1) || (e.getKeyChar() == KeyEvent.VK_SPACE)||!(e.getKeyChar()==KeyEvent.VK_ENTER) || (e.getKeyChar()==KeyEvent.VK_BACK_SPACE))) {
            
            return true;
        }else{
            JOptionPane.showMessageDialog(VistaArticulos, "Debes Teclear solo numeros y no \ndebe de  "+ 
                    "estar vacio el campo \ny la longitud no debe ser mayor a " +longitud,"Alerta",0);
            return false;
        }
    }

   public void validarSoloLetras(KeyEvent e){
    if(Character.isLetter(e.getKeyChar()) || (e.getKeyChar()==KeyEvent.VK_SPACE)|| (e.getKeyChar()==KeyEvent.VK_SHIFT) || (e.getKeyChar()==KeyEvent.VK_BACK_SPACE)||(e.getKeyChar()==KeyEvent.VK_ENTER)){
       
        
   }else{
       JOptionPane.showMessageDialog(VistaArticulos, "Debes Teclear solo letras y no \ndebe de  "+
                "estar vacio el campo","Alerta",0);
    }
}

    private boolean validarSoloReales(String Cadena, int longitud,KeyEvent e) {
        if ((Cadena.matches("[0-9,.]+") || (Cadena.length() < longitud+1) || (e.getKeyChar() == KeyEvent.VK_SPACE)||!(e.getKeyChar()==KeyEvent.VK_ENTER) || (e.getKeyChar()==KeyEvent.VK_BACK_SPACE))) {
            
            return true;
        }else{
            JOptionPane.showMessageDialog(VistaArticulos, "Debes Teclear solo numeros y no \ndebe de  "+ 
                    "estar vacio el campo \ny la longitud no debe ser mayor a " +longitud,"Alerta",0);
            return false;
        }
    }
    
}
