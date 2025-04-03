package Entidades;

import jdk.jshell.Snippet;

import java.util.Random;

public class Order {
    private String produto;
    private int quantidade;
    private int codigoPedido;
    private Status status;

    public Order (String produto, int quantidade, int codigoPedido, Status status){
        this.produto = produto;
        this.quantidade = quantidade;
        this.codigoPedido = codigoPedido;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public static int gerarCodigo(){
        Random code = new Random();
        int codigo = code.nextInt(10000000);
        return codigo;
    }
    public int getCodigoPedido(){
        return codigoPedido;
    }
    public static Status getRandomStatus (){
        Status[]randomStatus = Status.values();
        Random status = new Random();
        int index = status.nextInt(randomStatus.length);
        return randomStatus[index];
    }

    public String toString () {
        return "Pedido: " +
                this.getProduto() +
                " \nQuantidade: " + this.getQuantidade()+
                "\nStatus: " + getRandomStatus()+

                "\nCódigo do Pedido: " + this.getCodigoPedido();
    }
}
