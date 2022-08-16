
package logicaNegocio;

import DAO.MenuDAO;
import entidades.*;
import java.util.ArrayList;

public class lnMenu implements iOperaciones <Menu>{

    @Override
    public Boolean eliminar(Menu ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Menu ent) {
        return new MenuDAO().registrar(ent);

    }

    @Override
    public Boolean modificar(Menu ent) {
        return new MenuDAO().modificar(ent); 
    }

    @Override
    public ArrayList<Menu> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Menu> buscar(Menu ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Menu> llenarCombo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
