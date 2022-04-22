/*
 Creación del paquete sistema
 */
package sistema;

import sistema.empleadosBL.empleadosBL;
import sistema.empleadosGUI.frmEmpleados;

/**
 * Se implementa la clase sistema
 * @author Daniel
 */
public class Sistema {

    
    public static void main(String[] args) {
        empleadosBL EM=new empleadosBL();
        frmEmpleados E=new frmEmpleados();
        E.setVisible(true);
    }
    
}
