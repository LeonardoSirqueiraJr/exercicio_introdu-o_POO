package exercícios_introdução_poo.Exercicio_6;

public class Main {
    public static void main (String[] args){
        Baralho deck = new Baralho(); //criando novo baralho no main, mas chamando de deck para não confundir

        for (int i=0; i<52;i++){
            deck.cartas[i] = new Carta();
        }

        deck.insereValores();
        deck.insereNaipes();
        deck.imprimir();

    }

}
