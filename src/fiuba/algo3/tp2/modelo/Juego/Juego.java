package fiuba.algo3.tp2.modelo.Juego;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;

public class Juego {

    Mapa mapaDelJuego;
    Jugador jugador;

    public static int COLUMNAS_DEL_MAPA = 60;
    public static int FILAS_DEL_MAPA = 80;
    public static int POSICION_X_INICIAL_JUGADOR = 9;
    public static int POSICION_Y_INICIAL_JUGADOR = 9;
    public static int FILAS_TABLERO_CONSTRUCTOR = 3;
    public static int COLUMNAS_TABLERO_CONSTRUCTOR = 3;


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
        movimiento.obtenerEntorno(this.mapaDelJuego);
        this.mapaDelJuego.moverJugador(movimiento);
    }

    public void crearUnMapaParaTestConMateriales() {
        cargarMaterialesEnElMapa();
    }

    public String obtenerCodigoObjetoEnPosicion(int filaEnElMapa, int columnaEnElMapa) {
        return this.mapaDelJuego.obtenerCodigo(filaEnElMapa,columnaEnElMapa);
    }
}
