
package logicaNegocio;

import DAO.SorbeteDAO;
import entidades.*;
import java.util.ArrayList;

public class lnSorbete implements iOperaciones <Sorbete>{

    @Override
    public Boolean eliminar(Sorbete ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Sorbete ent) {
        return new SorbeteDAO().registrar(ent);    
    }

    @Override
    public Boolean modificar(Sorbete ent) {
        return new SorbeteDAO().registrar(ent);
    }

    @Override
    public ArrayList<Sorbete> listarTodos() {
     return new SorbeteDAO().listarTodos();
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
