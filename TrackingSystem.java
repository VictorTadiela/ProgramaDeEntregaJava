package Entidades;

public class TrackingSystem {
    private Product[] produtos = new Product[5];
    private Order[] pedidos = new Order[5];

    public int posicaonull(Product[] produtos) {
        int i = 0, pos = 0;
        while (i < 5) {
            if (produtos[i] == null) {
                pos = i;
                i = 5;
            }
            i++;
        }
        return pos;
    }

    public Product[] getProdutos() {
        return produtos;
    }

    public void inserirProdutos(Product[] produtos, int pos, Product produto) {
        produtos[pos] = produto;
    }

    public boolean rastreio(Product[] produtos, String nomeProduto) {
        boolean result = false;
        for (int i = 0; i < 5; i++) {
            if (produtos[i].getNameProduct().equals(nomeProduto)) {
                result = true;
                i = 5;
            }
        }
        return result;
    }

    public int pedidoNull(Order[] pedidos) {
        int i = 0, pos = 0;
        while (i < 5) {
            if (pedidos[i] == null) {
                pos = i;
                i = 5;
            }
            i++;
        }
        return pos;
    }

    public Order[] getPedidos() {
        return pedidos;
    }

    public void inserirPedidos(Order[] pedidos, int pos, Order order) {
        pedidos[pos] = order;
    }
    public int encontrarPedido (Order[] pedidos, int codigo){
        int result = -1;
        for (int i = 0; i < 5; i++) {
            if (pedidos [i].getCodigoPedido() == codigo) {
                result = i;
                i = 5;
            }
        }
        return result;
    }
}
