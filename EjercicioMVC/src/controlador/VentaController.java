/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.VentaModel;
import vista.VentaView;

/**
 *
 * @author invitado
 */
public class VentaController {
    private VentaModel modelo;
    private VentaView vista;

    public VentaController(VentaModel modelo, VentaView vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
        this.vista.addBtnCalcularVentaListener(new CalculateListener());
    }
    
    
    class CalculateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
                    
            if(e.getActionCommand().equalsIgnoreCase("Aceptar")){
                float cantidad;
                float valorUnitario;

                try{
                    cantidad = vista.getCantidad();
                    valorUnitario = vista.getValorUnitario();

                    modelo.setCantidad(cantidad);
                    modelo.setValorUnitario(valorUnitario);
                    modelo.calcularVenta();
                    modelo.calcularDescuento();
                    modelo.calcularNetoPagar();

                    vista.activarControles(false);
                    vista.setValorVenta(modelo.getValorVenta());
                    vista.setDescuento(modelo.getDescuento());
                    vista.setNetoPagar(modelo.getNetoPagar());
                } catch(NumberFormatException ex){
                    vista.displayErrorMessage("Necesita ingresar 2 numeros");
                }
           }
           
           if(e.getActionCommand().equalsIgnoreCase("Calcular Venta")){
               vista.activarControles(true);
           }
        }
    }
}
