
package DAO;

import entidades.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PlatoFuerteDAO implements iOperaciones <PlatoFuerte>{

    @Override
    public Boolean eliminar(PlatoFuerte ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(PlatoFuerte ent) {
       Boolean exito=false;
        try{
        Connection cn = new ConexionDAO().getConnection();
        String procedimientoAlmacenado= "{call sp_registrarPlatoFuerte(?,?)}"; 
        CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
        call.setString("nombre", ent.getNombrePlatoFuerte());
        call.setString("descripcion", ent.getDescripcionPlatoFuerte());
        
        exito=true;
        call.executeQuery();
        cn.close();
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }    
        return exito;
    }

    @Override
    public Boolean modificar(PlatoFuerte ent) {
        Boolean exito=false;
        try{
            Connection cn = new ConexionDAO().getConnection();
            String procedimientoAlmacenado= "{call sp_actualizarPlatoFuerte(?,?,?)}"; 
            CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
            call.setInt("idPlatoFuerte",ent.getIdPlatoFuerte());
            call.setString("nombre", ent.getNombrePlatoFuerte());
            call.setString("descripcion", ent.getDescripcionPlatoFuerte());
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
    public ArrayList<PlatoFuerte> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PlatoFuerte> buscar(PlatoFuerte ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PlatoFuerte> llenarCombo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
