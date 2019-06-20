package fiuba.algo3.tp2.modelo.Mapa;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Diamante;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;

public class Mapa {
    private static int FILAS_DEL_MAPA = 79;
    private static int COLUMNAS_DEL_MAPA = 59;
    private static int POSICION_X_INICIAL_JUGADOR = 8;
    private static int POSICION_Y_INICIAL_JUGADOR = 8;
    private Celda tableroDeElementos[][];
    private Celda celdaConJugador ;
    private static Mapa mapa =new Mapa();

    private Mapa(){
        this.tableroDeElementos = new Celda[FILAS_DEL_MAPA][COLUMNAS_DEL_MAPA];
        for(int numeroDeFila = 0;numeroDeFila<FILAS_DEL_MAPA;numeroDeFila++){
            for(int numeroDeColumna = 0;numeroDeColumna<COLUMNAS_DEL_MAPA;numeroDeColumna++)
                this.tableroDeElementos[numeroDeFila][numeroDeColumna] = new Celda(numeroDeFila, numeroDeColumna);
        }
    }

    public boolean puedoColocar(int fila,int columna){
        int filaEnTablero = fila - 1;
        int columnaEnTablero = columna - 1;
        return !this.tableroDeElementos[filaEnTablero][columnaEnTablero].celdaEstaOcupada();
    }

    public int filaValida(int posicionSolicitada){
        if(posicionSolicitada > FILAS_DEL_MAPA){
           posicionSolicitada =  FILAS_DEL_MAPA+1;
        }
        return posicionSolicitada;
    }

    public int columnaValida(int posicionSolicitada){
        if(posicionSolicitada > this.COLUMNAS_DEL_MAPA){
            posicionSolicitada =  this.COLUMNAS_DEL_MAPA+1;
        }
        return posicionSolicitada;
    }

    public void moverJugador(Movimiento movimiento){
        movimiento.obtenerEntorno(this);
        this.celdaConJugador.moverJugadorA(movimiento);
    }

    public void ocuparCelda(int posicionDeFila,int posicionDeColumna,Celda celdaQueEnvia){
        Celda nuevaCeldaDeJugador = this.tableroDeElementos[posicionDeFila][posicionDeColumna];
        celdaQueEnvia.enviarJugador(nuevaCeldaDeJugador);
    }

    public static Mapa getMapa(){
        return mapa;
    }


    public static Mapa getTableroTest(){
        return new Mapa();
    }

    public void colocarJugadorPosicionInicial(Jugador jugador) {
        this.tableroDeElementos[POSICION_X_INICIAL_JUGADOR][POSICION_Y_INICIAL_JUGADOR].ocuparCelda(jugador);
        this.celdaConJugador = this.tableroDeElementos[POSICION_X_INICIAL_JUGADOR][POSICION_Y_INICIAL_JUGADOR];
    }

    public void colocarMaterialesIniciales() {
        Material diamante = new Diamante();
        this.tableroDeElementos[1][1].ocuparCelda(diamante);
        this.tableroDeElementos[7][7].ocuparCelda(diamante);
    }
}
