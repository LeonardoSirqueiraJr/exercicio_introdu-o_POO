package exercícios_introdução_poo.Exercício08;

public class Celular {
    int bateriaCheia=100; // na unidade 'u'
    int nivelBateria; //mostrador


    void enviarMsg(){
        this.nivelBateria--; //consumindo uma unidade de bateria

    }

    void imprimeBateria(){

        System.out.println(this.nivelBateria+"/"+this.bateriaCheia);
    }
    static void fazerLigacao(Celular celular){
        new java.util.Timer().schedule( //contador de tempo
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        celular.nivelBateria=celular.nivelBateria-5; //diminuindo 5 unidades da bateria
                        celular.imprimeBateria(); //mostrar nível após diminuição
                        if(celular.nivelBateria<=0){
                            System.exit(1); //desligar celular por estar sem bateria
                        }
                    }
                },
                5000,5000);
    }



}
