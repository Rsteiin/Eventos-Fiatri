
package DAO;

import entidades.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SorbeteDAO implements iOperaciones <Sorbete>{

    @Override
    public Boolean eliminar(Sorbete ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Sorbete ent) {
         Boolean exito=false;
        try{
        Connection cn = new ConexionDAO().getConnection();
        String procedimientoAlmacenado= "{call sp_registrarSorbete(?,?)}"; 
        CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
        call.setString("nombre", ent.getNombreSorbete());
        call.setString("descripcion", ent.getDescripcionSorbete());
        
        exito=true;
        call.executeQuery();
        cn.close();
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }    
        return exito;    }

    @Override
    public Boolean modificar(Sorbete ent) {
        Boolean exito=false;
        try{
            Connection cn = new ConexionDAO().getConnection();
            String procedimientoAlmacenado= "{call sp_actualizarSorbete(?,?,?)}"; 
            CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
            call.setInt("idSorbete",ent.getIdSorbete());
            call.setString("nombre", ent.getNombreSorbete());
            call.setString("descripcion", ent.getDescripcionSorbete());
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
    public ArrayList<Sorbete> listarTodos() {
        ArrayList<Sorbete> lista = new ArrayList<>();
        try{
            Connection cn = new ConexionDAO().getConnection();
            String procedimientoAlmacenado= "{call sp_listarSorbete()}"; 
            CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
            call.executeQuery();
            ResultSet rs=call.executeQuery();
           while(rs.next()){
            Sorbete objSorbete= new Sorbete();
            objSorbete.setIdSorbete(rs.getInt("IDSORBETE"));
            objSorbete.setNombreSorbete(rs.getString("NOMBRESORBETE"));
            objSorbete.setDescripcionSorbete(rs.getString("DESCRIPCIONSORBETE"));
            lista.add(objSorbete);
           }
            cn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
        return lista;    
    }

    @Override
    public ArrayList<Sorbete> buscar(Sorbete ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Sorbete> llenarCombo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
