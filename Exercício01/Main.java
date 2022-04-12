/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios_introdução_poo.Exercício01;

import exercícios_introdução_poo.Exercício01.Agenda;
import exercícios_introdução_poo.Exercício01.Contato;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Agenda agenda = new Agenda(); //instanciando a classe Agenda na Main
        System.out.println("Digite as entradas Nome, Telefone e Aniversário:");
        Scanner teclado = new Scanner(System.in);
        Contato contato = new Contato ();
        
        String nome = teclado.next();
        contato.nome = nome;
        String telefone = teclado.next();
        contato.telefone = telefone;
        String aniversario = teclado.next();
        contato.aniversario = aniversario;
             
        agenda.adicionarContato(contato); 
        agenda.imprimirContatos ();
        
        
        
    }

}

