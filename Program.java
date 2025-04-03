package Entidades;

import java.util.Date;

public class Program {
    private Integer codigoPedido;
    private Date moment;
    private Status status;


    public Program (Integer codigoPedido, Date moment , Status status){
        this.codigoPedido = codigoPedido;
        this.moment = moment;
        this.status = status;
    }

    public Integer getCodigoPedido(){
        return codigoPedido;
    }
    public void setCodigoPedido(Integer codigoPedido){
        this.codigoPedido = codigoPedido;
    }

    public Date getMoment(){

        return moment;
    }
    public void setMoment(Date moment){

        this.moment = moment;
    }

    public Status getStatus(){

        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public void displayInitialScreen(){
        System.out.println("Código Pedido: " + codigoPedido);
        System.out.println("Hora do Pedido: " + moment);
        System.out.println("Status da Compra: " + status);
    }

    @Override
    public String toString (){
        return "Código do Pedido " + codigoPedido +
                "Hora do Pedido: " + moment +
                "Status da Compra: " + status;
    }
}