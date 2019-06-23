package fiuba.algo3.tp2.modelo.Mapa;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Diamante;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;
import static fiuba.algo3.tp2.modelo.Juego.Juego.*;

public class Mapa {
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

    public boolean posicionOcupada(int fila,int columna){
        int filaEnTablero = fila - 1;
        int columnaEnTablero = columna - 1;
        return this.tableroDeElementos[filaEnTablero][columnaEnTablero].celdaEstaOcupada();
    }

    public int filaValida(int posicionSolicitada){
        if(posicionSolicitada > FILAS_DEL_MAPA-1){
           posicionSolicitada =  FILAS_DEL_MAPA+1;
        }
        if(posicionSolicitada <= 0){
            posicionSolicitada = 1;
        }
        return posicionSolicitada;
    }

    public int columnaValida(int posicionSolicitada){
        if(posicionSolicitada > COLUMNAS_DEL_MAPA){
            posicionSolicitada =  COLUMNAS_DEL_MAPA;
        }
        if(posicionSolicitada <= 0){
            posicionSolicitada = 1;
        }
        return posicionSolicitada;
    }

    public void moverJugador(Movimiento movimiento){
        movimiento.obtenerEntorno(this);
        this.celdaConJugador = movimiento.movible(this.celdaConJugador);
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

    public boolean jugadorEstaEn(int posicionEnFila, int posicionEnColumna) {
        return this.tableroDeElementos[posicionEnFila][posicionEnColumna].tengoAlJugador();
    }

    public String obtenerCodigo(int fila, int columna) { return this.tableroDeElementos[fila][columna].obtenerCodigo(); }

    public Celda obtenerCelda(int fila,int columna) {return this.tableroDeElementos[fila][columna];}
}
