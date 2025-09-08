//vista general utilizando la libreria SWING
package view;

import javax.swing.*;
import java.awt.event.*;

public class frmPrincipal extends JFrame{
    private JMenuBar menubar;
    private JMenu menuUsuario, menuCliente, menuSalir;

    public frmPrincipal(JMenuBar menubar, JMenu menuUsuario, JMenu menuCliente, JMenu menuSalir) {
        this.menubar = menubar;
        this.menuUsuario = menuUsuario;
        this.menuCliente = menuCliente;
        this.menuSalir = menuSalir;
    }
    
    public frmPrincipal() {
        setTitle("Aplicación MVC - principal");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
