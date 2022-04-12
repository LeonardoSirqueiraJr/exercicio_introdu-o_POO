package exercícios_introdução_poo.Exercício02;

import exercícios_introdução_poo.Exercício02.Pessoa;

public class Exercicio_2 {
    public static void main (String[]args){
        Pessoa pessoa = new Pessoa();
        // Dando nome e idade iniciais à pessoa criada
        pessoa.nome = "Leonardo";
        pessoa.idade = 24;

        pessoa.idade ++; //somente um aniversario, não sei se precisa de algo a mais

        System.out.println("O nome dessa pessoa é " + pessoa.nome + "e ela tem hoje " + pessoa.idade + " anos de idade. ");
    }
}
