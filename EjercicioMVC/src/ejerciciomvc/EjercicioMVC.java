/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomvc;

import controlador.VentaController;
import modelo.VentaModel;
import vista.VentaView;

/**
 *
 * @author invitado
 */
public class EjercicioMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentaView vista = new VentaView();
        VentaModel modelo = new VentaModel();
        VentaController controller = new VentaController(modelo, vista);
    }
    
}
