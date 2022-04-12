package exercícios_introdução_poo;

public class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    private void pintar(String cor) {
        this.cor = cor;
    }

    int qtPortasAbertas() {
        int qtAbertas = 0;

        if (this.porta1.aberta == true) {
            qtAbertas += 1;
        }

        if (this.porta2.aberta == true) {
            qtAbertas += 1;
        }

        if (this.porta3.aberta == true) {
            qtAbertas += 1;
        }
        return qtAbertas;
    }

    int quantasPortasEstaoAbertas() {
        int qtAbertas;

        qtAbertas = this.quantasPortasEstaoAbertas();
        System.out.println("A casa tem a cor" + this.cor + " e ela está com " + qtAbertas + " porta(s) aberta(s)");
        return qtAbertas;
    }

    static class Porta {
        boolean aberta;

        public void abrir() {
            if (this.aberta == false) {
                this.aberta = true;
            }
        }

        public void fechar() {
            if (this.aberta == true) {
                this.aberta = false;
            }
        }
    }

    public static void main(String args[]) {
        Casa casa = new Casa();
        Porta porta = new Porta();
        casa.porta1.fechar(); //Exception in thread "main" java.lang.NullPointerException at exercícios_introdução_poo.Casa.main(Casa.java:57)
        casa.porta2.abrir();
        casa.porta3.abrir(); //tenho duas portas abertas

        casa.pintar("Amarelo");

        casa.quantasPortasEstaoAbertas();

    }
}
