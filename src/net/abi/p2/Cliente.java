package net.abi.p2;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String email;
    private Double descuento;

    public Cliente() {
    }

    public Cliente(String nombre, String email, Double descuento) {
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
        id=UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente[id= "+id+", nombre= "+nombre+", email= "+email+", descuento= "+descuento+"]";
    }
}
