/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.clientes;
import modelo.usuario.*;
import conexion.Conexion;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class ConsultasClientes extends Conexion{
  Connection Con = getConexion();//Se conecta a la base de datos

    public boolean insertar(ModeloClientes Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "insert into cliente (idCliente, nombre, apellidop, apellidom, Telefono, Direccion, RFC) values (?,?,?,?,?,?,?)";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getIdCliente());//? #1 "Id del cliente"
            Ps.setString(2, Modelo.getNombre());//? #2 "Nombre del cliente"
            Ps.setString(3, Modelo.getApPaterno());//? #3 "Apellido paterno del cliente"
            Ps.setString(4, Modelo.getApMaterno());//? #4 "Apellido materno del cliente"
            Ps.setInt(5, Modelo.getTelefono());//? #5 "Telefono del cliente"
            Ps.setString(6, Modelo.getDireccion());//? #6 "Direccion del cliente"
            Ps.setString(7, Modelo.getRFC());//? #7 "RFC del cliente"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: insertar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    
    public boolean modificar(ModeloClientes Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL y ocupa una variable de este tipo
            String SQL= "update cliente set idCliente=?, nombre=?, apellidop=?, apellidom=?, Telefono=?, Direccion=?, RFC=? where idCliente=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getIdCliente());//? #1 "Id del cliente"
            Ps.setString(2, Modelo.getNombre());//? #2 "Nombre del cliente"
            Ps.setString(3, Modelo.getApPaterno());//? #3 "Apellido paterno del cliente"
            Ps.setString(4, Modelo.getApMaterno());//? #4 "Apellido materno del cliente"
            Ps.setInt(5, Modelo.getTelefono());//? #5 "Telefono del cliente"
            Ps.setString(6, Modelo.getDireccion());//? #6 "Direccion del cliente"
            Ps.setString(7, Modelo.getRFC());//? #7 "RFC del cliente"
            Ps.setInt(8, Modelo.getIdCliente());//? #8 "Id del cliente"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: modificar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean eliminar(ModeloClientes Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "delete from cliente where idCliente=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getIdCliente());//? #1 "Nombre"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: eliminar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean buscar(ModeloClientes Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "select * from cliente where idCliente=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getIdCliente());//? #1 "Nombre del modelo"
            Ps.execute();//se ejecuta la consulta SQL
            ResultSet Rs= Ps.executeQuery();//Para obtener resultados, se ejecuta la consulta SQL
            if(Rs.next()){// Si se encontro al usuario en la BD
                Modelo.setIdCliente(Rs.getInt("idCliente"));//LLena el modelo con este dato faltante o buscado
                Modelo.setNombre(Rs.getString("Nombre"));//LLena el modelo con este dato faltante o buscado
                Modelo.setApPaterno(Rs.getString("apellidop"));//LLena el modelo con este dato faltante o buscado
                Modelo.setApMaterno(Rs.getString("apellidom"));//LLena el modelo con este dato faltante o buscado
                Modelo.setTelefono(Rs.getInt("Telefono"));//LLena el modelo con este dato faltante o buscado
                Modelo.setDireccion(Rs.getString("Direccion"));//LLena el modelo con este dato faltante o buscado
                Modelo.setRFC(Rs.getString("RFC"));//LLena el modelo con este dato faltante o buscado
                
                return true;//todo esta bien, retorna verdadero y llena el modelo con los datos buscados
            }
            return false;//No se encontro usuario en la base de datos retorna falso
        }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error SQL: buscar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
} 