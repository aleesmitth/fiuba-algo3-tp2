package fiuba.algo3.tp2.modelo.Juego;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Mapa.Celda;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;

public class Juego {

    public Mapa mapaDelJuego;
    Jugador jugador;

    public static int FILAS_DEL_MAPA = 40;
    public static int COLUMNAS_DEL_MAPA = 50;
    public static int POSICION_X_INICIAL_JUGADOR = 2;
    public static int POSICION_Y_INICIAL_JUGADOR = 2;
    public static int FILAS_TABLERO_CONSTRUCTOR = 3;
    public static int COLUMNAS_TABLERO_CONSTRUCTOR = 3;
    public static int TOTAL_DE_MATERIALES = 4;
    public static int CASILLERO_INVENTARIO_PARA_MADERA = 0;
    public static int CASILLERO_INVENTARIO_PARA_PIEDRA = 1;
    public static int CASILLERO_INVENTARIO_PARA_METAL = 2;
    public static int CASILLERO_INVENTARIO_PARA_DIAMANTE = 3;


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
        this.mapaDelJuego = Mapa.getTableroTest();
        colocarJugadorEnElMapa();
        cargarMaterialesEnElMapa();
    }

    public String obtenerCodigoObjetoEnPosicion(int filaEnElMapa, int columnaEnElMapa) {
        return this.mapaDelJuego.obtenerCodigo(filaEnElMapa,columnaEnElMapa);
    }

    public Herramienta construirHerramienta() {
        Herramienta herramienta = this.jugador.construirHerramienta();
        return herramienta;
    }

    public void jugadorGolpea(){
        this.mapaDelJuego.jugadorGolpeaFrente();
    }

    public Material obtenerMaterialEnCelda(int posicionFila,int posicionColumna){
        Celda celdaSiguiente = this.mapaDelJuego.obtenerCelda(posicionFila,posicionColumna);
        return celdaSiguiente.material;
    }

    public String getCantidadDeMaterial(Material material){
        return this.jugador.getCantidadDeMaterial(material);
    }

    public void cambiarHerramientaEquipada(int posicion) {
        this.jugador.cambiarHerramientaEquipada(posicion);
    }

    public void sacarMaterialDeInventario(Material material) {
        this.jugador.sacarMaterialDeInventario(material);
    }

}
