package net.abi.p2;

import java.time.*;
import java.util.ArrayList;
import java.util.UUID;

public class Factura {
    private UUID id;
    private Double montoTotal=0.0;
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente;

    ArrayList<ItemVenta> productos;
    public Factura() {
    }

    public Factura(Cliente cliente,ArrayList<ItemVenta> productos) {
        for(int i=0;i<productos.size();i++){
            montoTotal+=productos.get(i).precioTotal();
        }
        this.cliente = cliente;
        this.productos=productos;
        fecha=LocalDate.now();
        id=UUID.randomUUID();
        hora=LocalTime.now();

    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double montoFinal(){
        return montoTotal-(montoTotal*(cliente.getDescuento()/100));
    }

    public ArrayList<ItemVenta> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ItemVenta> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Factura[id= "+id+", fecha= "+fecha+", monto= "+montoTotal+", montoDesc= "+montoFinal()+" "+cliente.toString();
    }
}
