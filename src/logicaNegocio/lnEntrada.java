
package logicaNegocio;

import DAO.EntradaDAO;
import entidades.*;
import java.util.ArrayList;

public class lnEntrada implements iOperaciones <Entrada>{

    @Override
    public Boolean eliminar(Entrada ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Entrada ent) {
        return new EntradaDAO().registrar(ent) ;   
    }

    @Override
    public Boolean modificar(Entrada ent) {
        return new EntradaDAO().modificar(ent);
    }

    @Override
    public ArrayList<Entrada> listarTodos() {
       return new EntradaDAO().listarTodos();
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
