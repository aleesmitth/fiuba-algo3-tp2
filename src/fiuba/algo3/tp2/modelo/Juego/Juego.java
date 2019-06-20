package fiuba.algo3.tp2.modelo.Juego;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;

public class Juego {

    Mapa mapaDelJuego;
    Jugador jugador;


public Juego(){
    this.mapaDelJuego = Mapa.getMapa();
    this.jugador = new Jugador();
    colocarJugadorEnElMapa();
    cargarMaterialesEnElMapa();
}

    private void colocarJugadorEnElMapa() {
        this.mapaDelJuego.colocarJugadorPosicionInicial(this.jugador);
    }

    private void cargarMaterialesEnElMapa() {
        this.mapaDelJuego.colocarMaterialesIniciales();
    }

    public boolean entidadIniciadaEnPosicion(int posicionEnFila,int posicionEnColumna){
        return this.mapaDelJuego.puedoColocar(posicionEnFila,posicionEnColumna);
    }



}
