package exercícios_introdução_poo.Exercicio_6;

public class Baralho {
    Carta cartas[]=new Carta[52]; //tamanho do baralho, contendo todas as cartas

    void imprimir(){
        for(int i=1;i<52;i++){
            System.out.println("Valor:"+this.cartas[i].valor);
            System.out.println("Naipe:"+this.cartas[i].naipe);

        }

    }

    void insereNaipes(){
        for(int i=0;i<52;i++){
            if(i<13){
                this.cartas[i].naipe=" ouros ";
            }
            else if(13<=i && i<26){
                this.cartas[i].naipe=" paus ";
            }
            else if(26<=i && i<39){
                this.cartas[i].naipe=" copas ";
            }
            else if(39<=i && i<52){
                this.cartas[i].naipe=" espadas ";
            }

        }
    }

    void insereValores(){
        int j=0;
        int k=1;
        for(int i=1;i<=4;i++){ //anda pelos naipes
            while(k<=13){ //anda pelas cartas
                this.cartas[j].valor=k;
                k++;
                j++;
            }
            k=1;
        }
    }
}