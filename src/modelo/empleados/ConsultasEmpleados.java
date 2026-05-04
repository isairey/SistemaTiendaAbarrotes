
package modelo.empleados;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Consultas Usuario.
 * @author Noemi Zavalza Valderrama
 * @version 1.
 * @since 06/11/23
 */
public class ConsultasEmpleados extends Conexion{
    Connection Con = getConexion();//Se conecta a la base de datos
    
    public boolean insertar(ModeloEmpleados Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "insert into empleados(idEmpleados, Nombre, Apellidop, Apellidom, FechaNac, Horario, Telefono) values (?,?,?,?,?,?,?)";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getIdEmpleados());//? #1 "Id del modelo"
            Ps.setString(2, Modelo.getNombre());//? #2 "Nombre del Empleado"
            Ps.setString(3, Modelo.getApellidop());//? #3 "ApellidoPaterno del Empleado"
            Ps.setString(4, Modelo.getApellidom());//? #4 "Apellido Materno del Empleado"
            Ps.setString(5, Modelo.getFechaNac());//? #5 "Fecha de Nacimiento del Empleado"
            Ps.setString(6, Modelo.getHorario());//? #6 "Horario del Empleado"
            Ps.setInt(7, Modelo.getTelefono());//? #7 "Telefono del Empleado"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: insertar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    
    public boolean modificar(ModeloEmpleados Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL y ocupa una variable de este tipo
            String SQL= "update empleados set idEmpleados=?, Nombre=?, Apellidop=?, Apellidom=?, FechaNac=?, Horario=?, Telefono=? where idEmpleados=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
             Ps.setInt(1, Modelo.getIdEmpleados());//? #1 "Id del modelo"
            Ps.setString(2, Modelo.getNombre());//? #2 "Nombre del Empleado"
            Ps.setString(3, Modelo.getApellidop());//? #3 "ApellidoPaterno del Empleado"
            Ps.setString(4, Modelo.getApellidom());//? #4 "Apellido Materno del Empleado"
            Ps.setString(5, Modelo.getFechaNac());//? #5 "Fecha de Nacimiento del Empleado"
            Ps.setString(6, Modelo.getHorario());//? #6 "Horario del Empleado"
            Ps.setInt(7, Modelo.getTelefono());//? #7 "Telefono del Empleado"
            Ps.setInt(8, Modelo.getIdEmpleados());//? #8 "Id del modelo"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: modificar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean eliminar(ModeloEmpleados Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "delete from empleados where idEmpleados=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getIdEmpleados());//? #1 "Id del Empleado"
            Ps.executeUpdate();//se ejecuta la consulta SQL
            return true;//Todo salio bien e inserto los registros
           }catch(SQLException e){//CACHA el error si ocurre
            JOptionPane.showMessageDialog(null,"Error: SQL: eliminar()\n" +e);
            return false;//algo salio mal, return falso y error
        }
    }
    public boolean buscar(ModeloEmpleados Modelo){
        try{//Intenta ejecutar el sig. bloque de instrucciones
            PreparedStatement Ps;//Para hacer consulta SQL e ocupa una variable de este tipo
            String SQL= "select * from empleados where idEmpleados=?";//Consulta SQL
            Ps =Con.prepareCall(SQL);//prepara llama o consulta SQL
            //Reemplaza las ? con los datos del modelo
            Ps.setInt(1, Modelo.getIdEmpleados());//? #1 "Id del modelo"
            Ps.execute();//se ejecuta la consulta SQL
            ResultSet Rs= Ps.executeQuery();//Para obtener resultados, se ejecuta la consulta SQL
            if(Rs.next()){// Si se encontro al usuario en la BD
                Modelo.setIdEmpleados(Rs.getInt("idEmpleados"));//LLena el modelo con este dato faltante o buscado
                Modelo.setNombre(Rs.getString("Nombre"));//LLena el modelo con este dato faltante o buscado
                Modelo.setApellidop(Rs.getString("Apellidop"));//LLena el modelo con este dato faltante o buscado
                Modelo.setApellidom(Rs.getString("Apellidom"));//LLena el modelo con este dato faltante o buscado
                Modelo.setFechaNac(Rs.getString("FechaNac"));//LLena el modelo con este dato faltante o buscado
                Modelo.setHorario(Rs.getString("Horario"));//LLena el modelo con este dato faltante o buscado
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
