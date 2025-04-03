package Entidades;


public enum Status {
    PENDENTE ("Pendente"),
    PEDIDOPROCESSADO ("Pedido em Processamento"),
    ENVIADO ("Pedido Enviado"),
    PEDIDOENTREGUE ("Pedido Entregue"),
    CANCELADO ("Pedido Cancelado");

    private String status;
    Status(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
}
