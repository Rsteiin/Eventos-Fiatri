
package logicaNegocio;

import DAO.PlatoFuerteDAO;
import entidades.*;
import java.util.ArrayList;


public class lnPlatoFuerte implements iOperaciones <PlatoFuerte> {

    @Override
    public Boolean eliminar(PlatoFuerte ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(PlatoFuerte ent) {
      return new PlatoFuerteDAO().registrar(ent);
    }

    @Override
    public Boolean modificar(PlatoFuerte ent) {
       return new PlatoFuerteDAO().modificar(ent);
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
