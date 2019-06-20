package fiuba.algo3.tp2.modelo.Juego;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;

public class Juego {

    Mapa mapaDelJuego;
    Jugador jugador;


    public Juego(){
        this.mapaDelJuego = Mapa.getMapa();
        this.jugador = new Jugador();
        colocarJugadorEnElMapa();
        cargarMaterialesEnElMapa();
    }
    public void crearUnMapaParaTestSinMateriales(){
        this.mapaDelJuego = Mapa.getTableroTest();
        colocarJugadorEnElMapa();
    }

    private void colocarJugadorEnElMapa() {
        this.mapaDelJuego.colocarJugadorPosicionInicial(this.jugador);
    }

    private void cargarMaterialesEnElMapa() {
        this.mapaDelJuego.colocarMaterialesIniciales();
    }

    public boolean posicionOcupadaEnMapa(int posicionEnFila, int posicionEnColumna){
        return this.mapaDelJuego.posicionOcupada(posicionEnFila,posicionEnColumna);
    }
    public boolean jugadorEstaEn(int posicionEnFila, int posicionEnColumna){
        return this.mapaDelJuego.jugadorEstaEn(posicionEnFila, posicionEnColumna);
    }


    public void moverJugador(Movimiento movimiento) {
        this.mapaDelJuego.moverJugador(movimiento);
    }

    public void crearUnMapaParaTestConMateriales() {
        cargarMaterialesEnElMapa();
    }
}
