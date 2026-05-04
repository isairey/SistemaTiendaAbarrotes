
package modelo.usuarios;

import conexion.Conexion;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;
import modelo.usuarios.ModeloUsuarios;

/**
 * Consultas Usuario.
 * 
 * @author Arturo Emanuel Fonseca Ruiz
 * @version 1.
 * @since 06/11/2023
 */
public class ConsultasUsuarios extends Conexion{
    Connection Con = getConexion();//Se conecta a la base de datos
    
    public boolean insertar(ModeloUsuarios Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "insert into usuarios (usuario, password, nombre, tipo) values (?,?,?,?)";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setString(1, Modelo.getUsuario());//? #1 "Id del modelo"
            Ps.setString(2, Modelo.getPass());//? #2 "Articulo del modelo"
            Ps.setString(3, Modelo.getNombre());//? #3 "Precio del modelo"
            Ps.setString(4, Modelo.getTipo());//? #4 "Marca del modelo"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: insertar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    
    public boolean modificar(ModeloUsuarios Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL y ocupa una variable de este tipo
            String SQL= "update usuarios set usuario=?, password=?, nombre=?, tipo=? where usuario=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setString(1, Modelo.getUsuario());//? #1 "Id del modelo"
            Ps.setString(2, Modelo.getPass());//? #2 "Articulo del modelo"
            Ps.setString(3, Modelo.getNombre());//? #3 "Precio del modelo"
            Ps.setString(4, Modelo.getTipo());//? #4 "Marca del modelo"
            Ps.setString(5, Modelo.getUsuario());//? #9 "Id del modelo2"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: modificar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean eliminar(ModeloUsuarios Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "delete from usuarios where usuario=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setString(1, Modelo.getUsuario());//? #1 "Id del modelo"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: eliminar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean buscar(ModeloUsuarios Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "select * from usuarios where usuario=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setString(1, Modelo.getUsuario());//? #1 "Id del modelo"
            Ps.execute();//se ejecuta la consulta SQL
            ResultSet Rs= Ps.executeQuery();//Para obtener resultados, se ejecuta la consulta SQL
            if(Rs.next()){// Si se encontro al usuario en la BD
                Modelo.setUsuario(Rs.getString("usuario"));//LLena el modelo con este dato faltante o buscado
                Modelo.setPass(Rs.getString("password"));//LLena el modelo con este dato faltante o buscado
                Modelo.setNombre(Rs.getString("nombre"));//LLena el modelo con este dato faltante o buscado
                Modelo.setTipo(Rs.getString("Tipo"));//LLena el modelo con este dato faltante o buscado
                return true;//todo esta bien, retorna verdadero y llena el modelo con los datos buscados
            }
            return false;//No se encontro usuario en la base de datos retorna falso
        }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error SQL: buscar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean buscarTodosLosUsuarios(DefaultTableModel Modelo){
        try{
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "select usuario, nombre, tipo from usuarios order by usuario";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            ResultSet Rs = Ps.executeQuery();//Rs Para obtener resultados
            int  numeroDeCampos = Rs.getMetaData().getColumnCount();
            while(Rs.next()){
                Object Fila[] = new Object[numeroDeCampos];
                Fila[0]= Rs.getString("usuario");
                Fila[1]= Rs.getString("nombre");
                Fila[2]= Rs.getString("tipo");
                
                
                Modelo.addRow(Fila);//Agrega registros al Modelo Tabla
            }
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: buscarTodosLosUsuarios()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    
    public void buscarFrase(JTextField TxtConsultar, DefaultTableModel ModeloTabla){
        try{
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "select usuario, nombre, tipo from usuarios where usuario like '%"+
                    TxtConsultar.getText()+"%'";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            ResultSet Rs = Ps.executeQuery();//Rs Para obtener resultados
            int  numeroDeCampos = Rs.getMetaData().getColumnCount();
            ModeloTabla.setRowCount(0);
            while(Rs.next()){
                Object Fila[] = new Object[numeroDeCampos];
                Fila[0]= Rs.getString("usuario");
                Fila[1]= Rs.getString("nombre");
                Fila[2]= Rs.getString("tipo");
                
                ModeloTabla.addRow(Fila);//Agrega registros al Modelo Tabla
            }
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: buscarFrase()\n" +e);
        }
    }
}
