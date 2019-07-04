package fiuba.algo3.tp2.modelo.Mapa;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.*;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;

import static fiuba.algo3.tp2.modelo.Juego.Juego.*;

public class Mapa {
    private Celda tableroDeElementos[][];
    public Celda celdaConJugador ;
    private static Mapa mapa = new Mapa();

    private Mapa(){
        this.tableroDeElementos = new Celda[FILAS_DEL_MAPA][COLUMNAS_DEL_MAPA];
        for(int numeroDeFila = 0;numeroDeFila<FILAS_DEL_MAPA;numeroDeFila++){
            for(int numeroDeColumna = 0;numeroDeColumna<COLUMNAS_DEL_MAPA;numeroDeColumna++)
                this.tableroDeElementos[numeroDeFila][numeroDeColumna] = new Celda(numeroDeFila, numeroDeColumna);
        }
    }

    public boolean posicionOcupada(int fila,int columna){

        return this.tableroDeElementos[fila][columna].celdaEstaOcupada();
    }

    public int filaValida(int posicionSolicitada){
        if(posicionSolicitada > FILAS_DEL_MAPA){
           posicionSolicitada =  FILAS_DEL_MAPA;
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
        for(int i=5;i<8;i++){
            for(int j=3;j<5;j++){
                Material madera = new Madera();
                Material maderaDos = new Madera();
                this.tableroDeElementos[i][j].ocuparCelda(madera);
                this.tableroDeElementos[j*2-j][i+i/2].ocuparCelda(maderaDos);
            }
        }
        for(int i=15;i<18;i++){
            for(int j=20;j<25;j++){
                Material piedra = new Piedra();
                Material piedraDos = new Piedra();
                this.tableroDeElementos[i][j].ocuparCelda(piedra);
                this.tableroDeElementos[j*2-j][i+i/3].ocuparCelda(piedraDos);
            }
        }
        for(int i=22;i<27;i++){
            for(int j=30;j<33;j++){
                Material metal = new Metal();
                Material metalDos = new Metal();
                this.tableroDeElementos[i][j].ocuparCelda(metal);
                this.tableroDeElementos[j-j/2][i-i/2].ocuparCelda(metalDos);
            }
        }
        for(int i=30;i<32;i++){
            for(int j=38;j<40;j++){
                Material diamante = new Diamante();
                this.tableroDeElementos[i][j].ocuparCelda(diamante);
            }
        }
    }

    public boolean jugadorEstaEn(int posicionEnFila, int posicionEnColumna) {
        return this.tableroDeElementos[posicionEnFila][posicionEnColumna].tengoAlJugador();
    }

    public String obtenerCodigo(int fila, int columna) {
        if(tableroDeElementos[fila][columna].celdaEstaOcupada() & !tableroDeElementos[fila][columna].tengoAlJugador()){
            if(tableroDeElementos[fila][columna].material.laHerramientaMeRompio()) {
                this.tableroDeElementos[fila][columna].vaciarCelda();
            }
        }
        return this.tableroDeElementos[fila][columna].obtenerCodigo();
    }

    public Celda obtenerCelda(int fila,int columna) {return this.tableroDeElementos[fila][columna];}

    public void moverJugador(Movimiento movimiento){
        movimiento.obtenerEntorno(this);
        this.celdaConJugador = movimiento.movible(this.celdaConJugador);
        this.celdaConJugador.jugador.nuevaPosicionFrontal(movimiento);
    }

    public void jugadorGolpeaFrente(){
        this.celdaConJugador.jugador.golpearFrente(this.celdaConJugador);
    }
}
