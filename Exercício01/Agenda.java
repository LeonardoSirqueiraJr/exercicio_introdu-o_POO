package exercícios_introdução_poo.Exercício01;

import java.util.Scanner;

public class Agenda {
    Scanner teclado = new Scanner(System.in);
    Contato lista [] = new Contato[1000];
    void imprimirContatos (){
        for (int i = 0; i< lista.length; i++){ 
            if (lista[i] != null){
                System.out.println ("Nome: " + lista[i].nome);
                System.out.println ("Telefone: " + lista[i].telefone);
                System.out.println ("Aniversário: " + lista[i].aniversario);
            }    
        }
    } 
    void adicionarContato (Contato contato){
        for (int i =0; i< lista.length; i++){
            if (lista[i] == null){
                lista[i] = contato;
                break;
            }
        } 
    }
    void removerContato(Contato contato){
        for (int i =0; i< lista.length; i++){
            if (lista[i] == contato){
                lista[i] = null;
                break;
            }
        } 
    }
    
}

