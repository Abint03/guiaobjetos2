package net.abi.p3;

import java.util.ArrayList;

public class Cuenta{
    private Integer id;
    private Double balance;
    private ClienteBco cliente;

    private ArrayList<String> operaciones=new ArrayList<>(10);
    public Cuenta() {
    }

    public Cuenta(Double balance, ClienteBco cliente) {
        this.balance = balance;
        this.cliente = cliente;
        id=(int)((Math.random()*20000)+10000);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public ClienteBco getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBco cliente) {
        this.cliente = cliente;
    }


    public void depositar(Double deposito){
        balance+=deposito;
        operaciones.add("El cliente " +(cliente.getNombre())+" depositó "+(deposito.toString()));

    }

    public void extraer(Double extraccion){
        if((balance-extraccion)>=-2000){
            balance-=extraccion;
            operaciones.add("El cliente "+(cliente.getNombre())+" retiró "+(extraccion.toString()));
        }else{
            System.out.println("ALERTA: SALDO INSUFICIENTE");
        }
    }

    @Override
    public String toString() {
        return "Cuenta: " + "id: " + id + ", balance: " + balance + ", cliente: " + cliente;
    }

    public void muestraOperaciones(){
        for(int i=0; i<10;i++){
            System.out.println((i+1)+". "+operaciones.get(i));
        }
    }
}
