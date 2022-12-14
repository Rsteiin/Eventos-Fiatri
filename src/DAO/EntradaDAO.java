
package DAO;

import entidades.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EntradaDAO implements iOperaciones <Entrada>{
    
    @Override
    public Boolean eliminar(Entrada ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Entrada ent) {
      Boolean exito=false;
        try{
        Connection cn = new ConexionDAO().getConnection();
        String procedimientoAlmacenado= "{call sp_registrarEntrada(?,?)}"; 
        CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
        call.setString("nombre", ent.getNombreEntrada());
        call.setString("descripcion", ent.getDescripcionEntrada());
        
        exito=true;
        call.executeQuery();
        cn.close();
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
    return exito;    
    }

    @Override
    public Boolean modificar(Entrada ent) {
        Boolean exito=false;
        try{
            Connection cn = new ConexionDAO().getConnection();
            String procedimientoAlmacenado= "{call sp_actualizarEntrada(?,?,?)}"; 
            CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
            call.setInt("idEntrada",ent.getIdEntrada());
            call.setString("nombre", ent.getNombreEntrada());
            call.setString("descripcion", ent.getDescripcionEntrada());
            int ejecucion= call.executeUpdate();
            if(ejecucion>0){
                exito=true;
            }
                             
            cn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
    return exito;    
    }

    @Override
    public ArrayList<Entrada> listarTodos() {
        ArrayList<Entrada> lista = new ArrayList<>();
        try{
            Connection cn = new ConexionDAO().getConnection();
            String procedimientoAlmacenado= "{call sp_listarEntrada()}"; 
            CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
            call.executeQuery();
            ResultSet rs=call.executeQuery();
           while(rs.next()){
            Entrada objEntrada= new Entrada();
            objEntrada.setIdEntrada(rs.getInt("IDENTRADA"));
            objEntrada.setNombreEntrada(rs.getString("NOMBREENTRADA"));
            objEntrada.setDescripcionEntrada(rs.getString("DESCRIPCIONENTRADA"));
            lista.add(objEntrada);
           }
            cn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    @Override
    public ArrayList<Entrada> buscar(Entrada ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Entrada> llenarCombo() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    