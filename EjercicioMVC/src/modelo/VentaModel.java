/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author invitado
 */
public class VentaModel {
    private float cantidad;
    private float valorUnitario;
    private float valorVenta;
    private float descuento;
    private float netoPagar;
    
    public VentaModel(){
        cantidad = 0;
        valorUnitario = 0;
        valorVenta = 0;
        descuento = 0;
        netoPagar = 0;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getValorVenta() {
        return valorVenta;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getNetoPagar() {
        return netoPagar;
    }
    
    public void calcularVenta(){
        valorVenta = cantidad * valorUnitario;
    }
    
    public void calcularDescuento(){
        descuento = valorVenta * 10/100;
    }
    
    public void calcularNetoPagar(){
        netoPagar = valorVenta - descuento;
    }
}
