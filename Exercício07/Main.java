package exercícios_introdução_poo.Exercício07;

public class Main {
    public static void main(String[] args){
        Pedido pedido1=new Pedido();
        pedido1.item[0]=new Produto();
        pedido1.item[0].preco=1.99;
        pedido1.item[0].quantidadePedida=25;
        pedido1.meioPagamento="dinheiro";

        pedido1.imprimir();
    }
}

