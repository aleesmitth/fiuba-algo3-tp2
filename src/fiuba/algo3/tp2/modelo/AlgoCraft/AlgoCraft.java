package fiuba.algo3.tp2.modelo.AlgoCraft;

import fiuba.algo3.tp2.modelo.Mapa.Tablero;

public class AlgoCraft {

    Tablero tableroDelJuego;

    public AlgoCraft(){
    this.tableroDelJuego = Tablero.getTablero();
}

    public boolean entidadIniciadaEnPosicion(int posicionEnFila,int posicionEnColumna){
        return this.tableroDelJuego.puedoColocar(posicionEnFila,posicionEnColumna);
    }

}
