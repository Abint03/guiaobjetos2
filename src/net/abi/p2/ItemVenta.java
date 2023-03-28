package net.abi.p2;

/*
Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
total teniendo en cuenta el precio unitario y cantidad. Un método que permita
imprimir por pantalla los atributos del objeto de la siguiente forma:
ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]*/

public class ItemVenta {
    private Integer id;
    private String descripcion;
    private Integer cantidad;
    private Double precioUnitario;

    public ItemVenta() {
    }

    public ItemVenta(String descripcion, Integer cantidad, Double precioUnitario) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        id=(int)(Math.random()*3001)+1000;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public Double precioTotal(){
        return precioUnitario*cantidad;
    }

    @Override
    public String toString() {
        return "ItemVenta[id= "+id+", descripción= "+descripcion+", cantidad= "+cantidad+", pUnitario= "+precioUnitario+", pTotal= "+precioTotal()+"]";
    }
}