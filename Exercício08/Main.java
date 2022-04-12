package exercícios_introdução_poo.Exercício08;

import static exercícios_introdução_poo.Exercício08.Celular.fazerLigacao;

public class Main {
    public static void main(String[] args){

        Celular celular1 =new Celular();
        celular1.nivelBateria=25; //setando bateria inicial

        celular1.imprimeBateria(); //status inicial
        celular1.enviarMsg();
        celular1.enviarMsg();
        celular1.enviarMsg();
        celular1.enviarMsg();
        celular1.imprimeBateria(); //status após mensagens
        fazerLigacao(celular1);
        fazerLigacao(celular1);
        fazerLigacao(celular1);
        celular1.imprimeBateria(); //status após ligações

    }
}
