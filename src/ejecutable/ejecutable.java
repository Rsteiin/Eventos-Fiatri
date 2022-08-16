package ejecutable;

import vistas.formularioLogin;
import vistas.menuPrincipal;

public class ejecutable {

    
    public static void main(String[] args) {
        menuPrincipal menu = new menuPrincipal();
        formularioLogin logeo = new formularioLogin();
        logeo.setSize(1150, 650);
        logeo.setLocationRelativeTo(null);
        logeo.setVisible(true);
    }
    
}
