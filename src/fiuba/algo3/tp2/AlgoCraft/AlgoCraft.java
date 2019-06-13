package fiuba.algo3.tp2.AlgoCraft;

import fiuba.algo3.tp2.Mapa.Tablero;

public class AlgoCraft {

    Tablero tableroDelJuego;


public AlgoCraft(){
    this.tableroDelJuego = new Tablero(9,9);
}

public boolean entidadIniciadaEnPosicion(int posicionEnFila,int posicionEnColumna){
    return this.tableroDelJuego.puedoColocar(posicionEnFila,posicionEnColumna);
}



}
