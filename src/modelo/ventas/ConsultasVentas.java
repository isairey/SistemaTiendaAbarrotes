
package modelo.ventas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Consultas Ventas.
 * 
 * @author Arturo Emanuel Fonseca Ruiz.
 * @version 1.
 * @since 06/11/2023.
 */
public class ConsultasVentas extends Conexion{
    Connection Con = getConexion();//Se conecta a la base de datos
    
    public boolean insertar(ModeloVentas Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "insert into ventas (idVenta, idArticulo, Fecha, Monto, idEmpleados, idCliente) values (?,?,?,?,?,?)";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getIdVenta());//? #1 "IdVenta del modelo"
            Ps.setInt(2, Modelo.getIdArticulo());//? #2 "IdArticulo del modelo"
            Ps.setString(3, Modelo.getFecha());//? #3 "Fecha del modelo"
            Ps.setFloat(4, Modelo.getMonto());//? #4 "Monto del modelo"
            Ps.setInt(5, Modelo.getIdCliente());//? #5 "IdCliente del modelo"
            Ps.setInt(6, Modelo.getIdEmpleados());//? #6 "IdEmpleados del modelo"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: insertar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    
    public boolean modificar(ModeloVentas Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL y ocupa una variable de este tipo
            String SQL= "update ventas set idVenta=?, idArticulo=?, Fecha=?, Monto=?, idEmpleados=?, idCliente=? where idVenta=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getIdVenta());//? #1 "IdVenta del modelo"
            Ps.setInt(2, Modelo.getIdArticulo());//? #2 "IdArticulo del modelo"
            Ps.setString(3, Modelo.getFecha());//? #3 "Fecha del modelo"
            Ps.setFloat(4, Modelo.getMonto());//? #4 "Monto del modelo"
            Ps.setInt(5, Modelo.getIdCliente());//? #5 "IdCliente del modelo"
            Ps.setInt(6, Modelo.getIdEmpleados());//? #6 "IdEmpleados del modelo"
             Ps.setInt(7, Modelo.getIdVenta());//? #7 "IdVenta del modelo"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: modificar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean eliminar(ModeloVentas Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "delete from ventas where idVenta=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
             Ps.setInt(1, Modelo.getIdVenta());//? #1 "IdVenta del modelo"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: eliminar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean buscar(ModeloVentas Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "select * from ventas where idVenta=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
             Ps.setInt(1, Modelo.getIdVenta());//? #1 "IdVenta del modelo"
            Ps.execute();//se ejecuta la consulta SQL
            ResultSet Rs= Ps.executeQuery();//Para obtener resultados, se ejecuta la consulta SQL
            if(Rs.next()){// Si se encontro al usuario en la BD
                Modelo.setIdVenta(Rs.getInt("idVenta"));//LLena el modelo con este dato faltante o buscado
                Modelo.setIdArticulo(Rs.getInt("idArticulo"));//LLena el modelo con este dato faltante o buscado
                Modelo.setFecha(Rs.getString("Fecha"));//LLena el modelo con este dato faltante o buscado
                Modelo.setMonto(Rs.getFloat("Monto"));//LLena el modelo con este dato faltante o buscado
                Modelo.setIdCliente(Rs.getInt("idCliente"));//LLena el modelo con este dato faltante o buscado
                Modelo.setIdEmpleados(Rs.getInt("idEmpleados"));//LLena el modelo con este dato faltante o buscado 
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
            String SQL= "select * from ventas order by idVenta";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            ResultSet Rs = Ps.executeQuery();//Rs Para obtener resultados
            int  numeroDeCampos = Rs.getMetaData().getColumnCount();
            while(Rs.next()){
                Object Fila[] = new Object[numeroDeCampos];
                Fila[0]= Rs.getInt("idVenta");
                Fila[1]= Rs.getInt("idArticulo");
                Fila[2]= Rs.getString("Fecha");
                Fila[3]= Rs.getFloat("Monto");
                Fila[4]= Rs.getInt("idCliente");
                Fila[5]= Rs.getInt("idEmpleados");
                
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
            String SQL= "select * from ventas where idVenta like '%"+
                    TxtConsultar.getText()+"%'";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            ResultSet Rs = Ps.executeQuery();//Rs Para obtener resultados
            int  numeroDeCampos = Rs.getMetaData().getColumnCount();
            ModeloTabla.setRowCount(0);
            while(Rs.next()){
                Object Fila[] = new Object[numeroDeCampos];
                Fila[0]= Rs.getInt("idVenta");
                Fila[1]= Rs.getInt("idArticulo");
                Fila[2]= Rs.getString("Fecha");
                Fila[3]= Rs.getFloat("Monto");
                Fila[4]= Rs.getInt("idCliente");
                Fila[5]= Rs.getInt("idEmpleados");
                
                ModeloTabla.addRow(Fila);//Agrega registros al Modelo Tabla
            }
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: buscarFrase()\n" +e);
        }
    }
}
