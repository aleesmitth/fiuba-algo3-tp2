package fiuba.algo3.tp2.AlgoCraft;

import fiuba.algo3.tp2.Mapa.Mapa;

public class AlgoCraft {

    Mapa mapaDelJuego;


public AlgoCraft(){
    this.mapaDelJuego = Mapa.getMapa();
}

public boolean entidadIniciadaEnPosicion(int posicionEnFila,int posicionEnColumna){
    return this.mapaDelJuego.puedoColocar(posicionEnFila,posicionEnColumna);
}



}
