public class App{
    public static void main(String[] args){

        Lampada lamp = new Lampada();

        lamp.ligar();
        lamp.desligar();

        if(lamp.getSituacaoLampada()){
            System.out.println("Lampada ligada");
        }else{
            System.out.println("Lampada desligada");
        }


    }
}
