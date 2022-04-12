package exercícios_introdução_poo.Exercício07;

public class Pedido {
    Produto item[] = new Produto[100];
    String meioPagamento;

    void imprimir(){
        System.out.println("O meio de pagamento é: " + this.meioPagamento);
        for (int i=0; i<this.item.length; i++){ //percorrendo a lista de compras
            System.out.println("O preço do produto é " + this.item[i].preco);

            System.out.println("A quantidade pedida deste produto é de " + this.item[i].quantidadePedida + " unidades.");

            System.out.println("O total a pagar é de " + this.item[i].quantidadePedida*this.item[i].preco);

            }
        }
}

