/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.articulos;

import conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 * Consultas Usuario.
 * 
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 16/10/2023
 * @version 2.
 * @since 16/11/2023
 */
public class ConsultasArticulos extends Conexion{
    Connection Con = getConexion();//Se conecta a la base de datos
    
    public boolean insertar(ModeloArticulos Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "insert into articulos (idArticulo, Articulo, Precio, Marca, Cantidad, Descripcion, Categoria, idProveedores) values (?,?,?,?,?,?,?,?)";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getId());//? #1 "Id del modelo"
            Ps.setString(2, Modelo.getArticulo());//? #2 "Articulo del modelo"
            Ps.setFloat(3, Modelo.getPrecio());//? #3 "Precio del modelo"
            Ps.setString(4, Modelo.getMarca());//? #4 "Marca del modelo"
            Ps.setInt(5, Modelo.getCantidad());//? #5 "Cantidad del modelo"
            Ps.setString(6, Modelo.getDescripcion());//? #6 "Descripcion del modelo"
            Ps.setString(7, Modelo.getCategoria());//? #7 "Categoria del modelo"
            Ps.setInt(8, Modelo.getidProveedores());//? #8 "IdProveedores del modelo"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: insertar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    
    public boolean modificar(ModeloArticulos Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL y ocupa una variable de este tipo
            String SQL= "update articulos set idArticulo=?, Articulo=?, Precio=?, Marca=?, Cantidad=?, Descripcion=?, Categoria=?, idProveedores=? where idArticulo=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getId());//? #1 "Id del modelo"
            Ps.setString(2, Modelo.getArticulo());//? #2 "Articulo del modelo"
            Ps.setFloat(3, Modelo.getPrecio());//? #3 "Precio del modelo"
            Ps.setString(4, Modelo.getMarca());//? #4 "Marca del modelo"
            Ps.setInt(5, Modelo.getCantidad());//? #5 "Cantidad del modelo"
            Ps.setString(6, Modelo.getDescripcion());//? #6 "Descripcion del modelo"
            Ps.setString(7, Modelo.getCategoria());//? #7 "Categoria del modelo"
            Ps.setInt(8, Modelo.getidProveedores());//? #8 "IdProveedores del modelo"
            Ps.setInt(9, Modelo.getId());//? #9 "Id del modelo2"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: modificar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean eliminar(ModeloArticulos Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "delete from articulos where idArticulo=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getId());//? #1 "Id del modelo"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: eliminar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean buscar(ModeloArticulos Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "select * from articulos where idArticulo=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getId());//? #1 "Id del modelo"
            Ps.execute();//se ejecuta la consulta SQL
            ResultSet Rs= Ps.executeQuery();//Para obtener resultados, se ejecuta la consulta SQL
            if(Rs.next()){// Si se encontro al usuario en la BD
                Modelo.setId(Rs.getInt("idArticulo"));//LLena el modelo con este dato faltante o buscado
                Modelo.setArticulo(Rs.getString("Articulo"));//LLena el modelo con este dato faltante o buscado
                Modelo.setPrecio(Rs.getFloat("Precio"));//LLena el modelo con este dato faltante o buscado
                Modelo.setMarca(Rs.getString("Marca"));//LLena el modelo con este dato faltante o buscado
                Modelo.setCantidad(Rs.getInt("Cantidad"));//LLena el modelo con este dato faltante o buscado
                Modelo.setDescripcion(Rs.getString("Descripcion"));//LLena el modelo con este dato faltante o buscado
                Modelo.setCategoria(Rs.getString("Categoria"));//LLena el modelo con este dato faltante o buscado
                Modelo.setidProveedores(Rs.getInt("idProveedores"));//LLena el modelo con este dato faltante o buscado
                return true;//todo esta bien, retorna verdadero y llena el modelo con los datos buscados
            }
            return false;//No se encontro usuario en la base de datos retorna falso
        }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error SQL: buscar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean buscarTodosLosProductos(DefaultTableModel Modelo){
        try{
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "select * from articulos order by Articulo";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            ResultSet Rs = Ps.executeQuery();//Rs Para obtener resultados
            int  numeroDeCampos = Rs.getMetaData().getColumnCount();
            while(Rs.next()){
                Object Fila[] = new Object[numeroDeCampos];
                Fila[0]= Rs.getInt("idArticulo");
                Fila[1]= Rs.getString("Articulo");
                Fila[2]= Rs.getFloat("Precio");
                Fila[3]= Rs.getString("Marca");
                Fila[4]= Rs.getInt("Cantidad");
                Fila[5]= Rs.getString("Descripcion");
                Fila[6]= Rs.getString("Categoria");
                Fila[7]= Rs.getInt("idProveedores");
                
                Modelo.addRow(Fila);//Agrega registros al Modelo Tabla
            }
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: buscarTodosLosProductos()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    
    public void buscarFrase(JTextField TxtConsultar, DefaultTableModel ModeloTabla){
        try{
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "select * from articulos where Articulo like '%"+
                    TxtConsultar.getText()+"%'";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            ResultSet Rs = Ps.executeQuery();//Rs Para obtener resultados
            int  numeroDeCampos = Rs.getMetaData().getColumnCount();
            ModeloTabla.setRowCount(0);
            while(Rs.next()){
                Object Fila[] = new Object[numeroDeCampos];
                Fila[0]= Rs.getInt("idArticulo");
                Fila[1]= Rs.getString("Articulo");
                Fila[2]= Rs.getFloat("Precio");
                Fila[3]= Rs.getString("Marca");
                Fila[4]= Rs.getInt("Cantidad");
                Fila[5]= Rs.getString("Descripcion");
                Fila[6]= Rs.getString("Categoria");
                Fila[7]= Rs.getInt("idProveedores");
                
                ModeloTabla.addRow(Fila);//Agrega registros al Modelo Tabla
            }
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: buscarFrase()\n" +e);
        }
    }
    
    
}
