package net.abi.p1;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private Double precio;
    private Integer stock;
    private ArrayList<Autor> autores=new ArrayList<>();

    public Libro() {
    }

    public Libro(String titulo, Double precio, Integer stock, ArrayList<Autor> autores) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores=autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public ArrayList<Autor> getAutor() {
        return autores;
    }

    public void setAutor(Autor autor) {
        autores.remove(0);
    }

    @Override
    public String toString() {
        return "Libro: " +
                "titulo: '" + titulo + '\'' +
                ", precio: $" + precio +
                ", stock: " + stock +
                ", autor: " + autores;
    }

    public void mensajeVenta(){
        int tam=autores.size();
        System.out.print("El libro, "+titulo+ " de");
        if(tam==1){
            System.out.print(" "+autores.get(0).getNombre()+" "+autores.get(0).getApellido());
        }else{
            for(int i=0;i<tam;i++){
                System.out.print(" "+autores.get(i).getNombre()+" "+autores.get(i).getApellido());
                if(i!=(tam-1)){
                    System.out.print(", ");
                }
            }
        }
        System.out.print(". Se vende a "+precio+" pesos.");
    }

}
