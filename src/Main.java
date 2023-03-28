import net.abi.p1.Autor;
import net.abi.p1.Libro;
import net.abi.p2.Cliente;
import net.abi.p2.Factura;
import net.abi.p2.ItemVenta;
import net.abi.p3.ClienteBco;
import net.abi.p3.Cuenta;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        /*--------------------------PUNTO 1------------------------*/
       /* Autor aut1=new Autor("Joshua", "Bloch","joshua@email.com",'M');
        Autor aut2=new Autor("Abigail", "Alegre","abi@email.com",'F');
        Autor aut3=new Autor("Sebastian", "Pelletieri","sebi@email.com",'M');
        ArrayList<Autor> lista=new ArrayList<>();
        lista.add(aut1);
        lista.add(aut2);
        lista.add(aut3);
        Libro lib1=new Libro("Effective Java",450.0,150,lista);
        System.out.println(lib1.toString());
        lib1.mensajeVenta();*/
       /* lib1.setPrecio(500.0);
        lib1.setStock(lib1.getStock()+50);
        System.out.println(lib1.toString());
        System.out.println("Atributos del autor del libro: "+lib1.getAutor());
        lib1.mensajeVenta();*/

        /*--------------------------PUNTO 2---------------------------*/
  /*      Cliente cl1=new Cliente("Abigail Alegre","abi@mail.com",15.0);
        System.out.println(cl1.toString());
        ItemVenta it1=new ItemVenta("Silla blanca",4,15.0);
        ItemVenta it2=new ItemVenta("Alfombra",2,10.0);
        ArrayList<ItemVenta> listaItems=new ArrayList<>();
        listaItems.add(it1);
        listaItems.add(it2);
        Factura fac1=new Factura(cl1,listaItems);
        System.out.println("MONTO TOTAL FACTURA: "+fac1.getMontoTotal()+", MONTO FINAL CON DESCUENTO: "+fac1.montoFinal());
        System.out.println(fac1.toString());*/

        /*--------------------------PUNTO 3---------------------------*/
        ClienteBco cl1=new ClienteBco("Abigail Alegre",'F');
        System.out.println(cl1.toString());
        Cuenta cnta1=new Cuenta(10000.0,cl1);
        System.out.println(cnta1.toString());
        cnta1.depositar(1500.0);
        cnta1.extraer(12000.0);
        cnta1.depositar(150.0);
        cnta1.depositar(1560.0);
        cnta1.depositar(900.0);
        cnta1.depositar(15000.0);
        cnta1.extraer(12.0);
        cnta1.extraer(1600.0);
        cnta1.extraer(1800.0);
        cnta1.depositar(700.0);
        cnta1.depositar(9050.0);
        System.out.println(cnta1.toString());
        cnta1.muestraOperaciones();

    }
}
