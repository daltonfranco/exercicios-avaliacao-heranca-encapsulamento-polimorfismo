public class Lampada{

    private boolean situacaoLampada;

    public boolean getSituacaoLampada() {
        return this.situacaoLampada;
    }

    public void setSituacaoLampada(boolean situacaoLampada) {
        this.situacaoLampada = situacaoLampada;
    }

    public void ligar(){
        this.situacaoLampada = true;
    }

    public void desligar(){
        this.situacaoLampada = false;
    }

}