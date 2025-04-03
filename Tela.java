package ProgramaDelivery;

import Entidades.Order;
import Entidades.Product;
//import Entidades.Project.Entidades.Project.*;
import Entidades.Status;
import Entidades.TrackingSystem;

import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Tela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        TrackingSystem system = new TrackingSystem();
        while ((true)) {
            System.out.println("*************** Menu ************");
            System.out.println("1 - Adicionar Pedidos ao Sistema");
            System.out.println("2 - Criar Pedido");
            System.out.println("3 - Rastrear Pedido");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nomeProd = sc.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    double precoProd = sc.nextDouble();
                    System.out.println("Digite a quantidade disponível: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Product product = new Product(nomeProd, precoProd, quantidade);
                    int pos = system.posicaonull(system.getProdutos());
                    system.inserirProdutos(system.getProdutos(), pos, product);
                    System.out.println("Produto adicionado com sucesso");
                    break;

                case 2:
                    System.out.println("Digite o nome do produto para criar o pedido: ");
                    String nameOrder = sc.nextLine();
                    System.out.println("Digite a quantidade do produto: ");
                    int orderQuantity = sc.nextInt();
                    sc.nextLine();
                    boolean resultado = system.rastreio(system.getProdutos(), nameOrder);
                    if (resultado == true) {
                        Order pedido = new Order(nameOrder, orderQuantity, Order.gerarCodigo(), Status.ENVIADO);
                        int posPedido = system.pedidoNull(system.getPedidos());
                        system.inserirPedidos(system.getPedidos(), posPedido, pedido);
                        System.out.println(pedido.getCodigoPedido());
                    }

                    break;

                case 3:
                    System.out.println("Digite o código do produto para rastrear: ");
                    int codeOrder = sc.nextInt();
                    int posicaoPedido = system.encontrarPedido(system.getPedidos(), codeOrder);
                    if (posicaoPedido >= 0) {
                        Order[] pedidoTemp = system.getPedidos();
                        System.out.println(pedidoTemp[posicaoPedido].toString());
                    }
                    break;


                case 4:
                    System.out.println("Saindo do sistema ...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção Inválida. Tente Novamente.");
            }

        }
    }
}