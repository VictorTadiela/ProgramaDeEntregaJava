package Entidades;

public class Product {
    private String nameProduct;
    private double preco;
    private int quantity;

    public Product (String nameProduct, double preco, int quantity){
        this.nameProduct = nameProduct;
        this.preco = preco;
        this.quantity = quantity;
    }
    public String getNameProduct(){
        return nameProduct;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantity(){
        return quantity;
    }

    public String toString(){
        return  nameProduct +
                "R$ - " +
                preco;
    }
}
