
package logicaNegocio;

import DAO.PostreDAO;
import entidades.*;
import java.util.ArrayList;

public class lnPostre implements iOperaciones <Postre>{

    @Override
    public Boolean eliminar(Postre ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Postre ent) {
        return new PostreDAO().registrar(ent);    }

    @Override
    public Boolean modificar(Postre ent) {
        return new PostreDAO().registrar(ent);    }

    @Override
    public ArrayList<Postre> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Postre> buscar(Postre ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Postre> llenarCombo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
