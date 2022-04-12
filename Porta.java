package exercícios_introdução_poo;


public class Porta {
    private String cor;
    private boolean aberta;
    private double dimensaoX, dimensaoY, dimensaoZ;

    //métodos
    public void abrir(){
        if (this.aberta==false){
            this.aberta=true;
        }
    }
    public void fechar(){
        if (this.aberta==true){
            this.aberta=false;
        }
    }
    public void pintar(String cor){
        this.cor = cor;
        //System.out.println("A cor da porta está: " + this.cor);
    }
    public String estaAberta(){
        if(this.aberta==true){
            return "A porta está Aberta";
        }else{
            return "Agora a porta está Fechada";
        }
    }

    public String qualCor(){
        return this.cor;}

    //alterando as dimensões
    public void dimensaoX(double dimensaoX){
        this.dimensaoX = dimensaoX;
    }
    public void dimensaoY(double dimensaoY){
        this.dimensaoY = dimensaoY;
    }
    public void dimensaoZ(double dimensaoZ){
        this.dimensaoZ = dimensaoZ;
    }

    // retorno das dimensões
    public double qualDimensaoX(){
        return this.dimensaoX;
    }
    public double qualDimensaoY(){
        return this.dimensaoY;
    }
    public double qualDimensaoZ(){
        return this.dimensaoZ;
    }


    public static void main (String args[]){
        Porta porta = new Porta();
        porta.pintar("Ciano");
        porta.dimensaoX(1.25);
        porta.dimensaoY(0.20);
        porta.dimensaoZ(2.10);

        porta.abrir();
        System.out.println(porta.estaAberta());
        porta.fechar();
        System.out.println(porta.estaAberta());

        System.out.println("A cor da Porta é: "+ porta.qualCor());
        System.out.println("As Dimensoes da Porta são :"+"\n"+"X: "+ porta.qualDimensaoX() +"\n"+"Y: "+ porta.qualDimensaoY() +"\n"+"Z: "+ porta.qualDimensaoZ());

        porta.pintar("Azul petróleo");
        porta.dimensaoX(1.10);
        porta.dimensaoY(0.12);
        porta.dimensaoZ(1.90);

        System.out.println("\n"+"Agora a cor da Porta é: "+ porta.qualCor());
        System.out.println("E as Dimensoes da Porta são :"+"\n"+"X: "+ porta.qualDimensaoX() +"\n"+"Y: "+ porta.qualDimensaoY() +"\n"+"Z: "+ porta.qualDimensaoZ());






    }



}
