package exercícios_introdução_poo;

public class Televisao {

    //estado: ligada ou desligada; volume(que está entre 0 e 10), pelo canal (que está entre 0 e 99) e pelo fato de estar em modo silencioso ou não
    private boolean ligado;
    private boolean silenciado;
    private int canal = 0;
    private int volume = 0;

    //métodos: ligar/desligar;mudar o canal (canal específico, canal anterior, próximo canal) e silenciar a televisão.
    public void ligarTv() {
        ligado = true;
    }

    public void desligarTv() {
        ligado = false;
    }

    public void qualCanal(int canalNovo){
        if (ligado){
            canal = canalNovo;
        }
    }

    public void subirCanal() {
        if (ligado) {
            if (canal < 99) {
                canal++;
            }
        }
    }

    public void descerCanal() {
        if (ligado) {
            if (canal > 0) {
                canal--;
            }
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        if (ligado) {
            if (volume < 10) {
                volume++;
            }
        }
    }

    public void reduzirVolume() {
        if (ligado) {
            if (volume > 0) {
                volume--;
            }
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void silenciar(){
        silenciado = true;
    }

    public void dessilenciar (){
        silenciado = false;
    }

    //Instancie um objeto dessa classe, utilize seus métodos para mudar de canal, ligar e desligar a TV, silenciar ou dessilenciar a TV
    public static void main(String[] args) {
        Televisao tv = new Televisao();

        tv.ligarTv();

        // subir 5 canais
        for (int i = 0; i < 5; i++) {
            tv.subirCanal();
        }

        // colocar o volume no máx
        while (tv.getVolume() < 10) {
            tv.aumentarVolume();
        }

        tv.mostarStatus();

        // subir até o canal 99
        while(tv.getCanal() != 99){
            tv.subirCanal();
        }

        // silenciar
        tv.silenciar();

        tv.mostarStatus();
    }

    // imprima o estado da TV.
    public void mostarStatus() {
        if (ligado) {
            if (silenciado == false) {
                System.out.println("O televisor esá ligado no canal " + canal + " e no volume " + volume + ".");
            } else {
                System.out.println("O televisor esá ligado no canal " + canal + " e com o volume silenciado.");
            }
        }else {
            System.out.println("O televisor esta desligado.");
        }
    }
}







    //public boolean isLigado() {
    //return ligado;
    //}

    //public void setLigado(boolean ligado) {
    //this.ligado = ligado;
    //}



