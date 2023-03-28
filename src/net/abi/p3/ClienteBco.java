package net.abi.p3;

public class ClienteBco {
    private Integer id;
    private String nombre;
    private Character genero;

    public ClienteBco() {
    }

    public ClienteBco(String nombre, Character genero) {
        this.nombre = nombre;
        this.genero = genero;
        id=(int)((Math.random()*3001)+1000);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ClienteBco: " + "id: " + id + ", nombre: '" + nombre + '\'' + ", genero: " + genero;
    }
}
