/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.proveedores;
import conexion.Conexion;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class ConsultasProveedores extends Conexion{
  Connection Con = getConexion();//Se conecta a la base de datos

    public boolean insertar(ModeloProveedores Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "insert into proveedores (idProveedores, Empresa, Nombre, Apellidop, Apellidom, Telefono) values (?,?,?,?,?,?)";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getId());//? #1 "Id del Proveedores"
            Ps.setString(2, Modelo.getEmpresa());//? #2 "Empresa"
            Ps.setString(3, Modelo.getNombre());//? #3 "Nombre"
            Ps.setString(4, Modelo.getApellidoPaterno());//? #4 "Apellido paterno"
            Ps.setString(5, Modelo.getApellidoMaterno());//? #5 "Apellido materno"
            Ps.setInt(6, Modelo.getTelefono());//? #6 "Telefono"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: insertar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    
    public boolean modificar(ModeloProveedores Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL y ocupa una variable de este tipo
            String SQL= "update proveedores set idProveedores=?, Empresa=?, Nombre=?, Apellidop=?, Apellidom=?, Telefono=? where idProveedores=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
           Ps.setInt(1, Modelo.getId());//? #1 "Id del Proveedores"
            Ps.setString(2, Modelo.getEmpresa());//? #2 "Empresa"
            Ps.setString(3, Modelo.getNombre());//? #3 "Nombre"
            Ps.setString(4, Modelo.getApellidoPaterno());//? #4 "Apellido paterno"
            Ps.setString(5, Modelo.getApellidoMaterno());//? #5 "Apellido materno"
            Ps.setInt(6, Modelo.getTelefono());//? #6 "Telefono"
            Ps.setInt(7, Modelo.getId());//? #7 "Id del Proveedores"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: modificar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean eliminar(ModeloProveedores Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "delete from proveedores where idProveedores=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getId());//? #1 "Nombre"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: eliminar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean buscar(ModeloProveedores Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "select * from proveedores where idProveedores=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getId());//? #1 "Nombre del modelo"
            Ps.execute();//se ejecuta la consulta SQL
            ResultSet Rs=Ps.executeQuery();//Para obtener resultados, se ejecuta la consulta SQL
            if(Rs.next()){// Si se encontro al usuario en la BD
                Modelo.setId(Rs.getInt("idProveedores"));//LLena el modelo con este dato faltante o buscado
                Modelo.setEmpresa(Rs.getString("Empresa"));//LLena el modelo con este dato faltante o buscado
                Modelo.setNombre(Rs.getString("Nombre"));//LLena el modelo con este dato faltante o buscado
                Modelo.setApellidoPaterno(Rs.getString("Apellidop"));//LLena el modelo con este dato faltante o buscado
                Modelo.setApellidoMaterno(Rs.getString("Apellidom"));//LLena el modelo con este dato faltante o buscado
                Modelo.setTelefono(Rs.getInt("Telefono"));//LLena el modelo con este dato faltante o buscado
                
                
                return true;//todo esta bien, retorna verdadero y llena el modelo con los datos buscados
            }
            return false;//No se encontro usuario en la base de datos retorna falso
        }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error SQL: buscar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
} 
