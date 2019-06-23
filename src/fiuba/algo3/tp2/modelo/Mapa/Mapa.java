package fiuba.algo3.tp2.modelo.Mapa;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.*;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;

import static fiuba.algo3.tp2.modelo.Juego.Juego.*;

public class Mapa {
    private Celda tableroDeElementos[][];
    private Celda celdaConJugador ;
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
        Material madera = new Madera();
        Material piedra = new Piedra();
        Material metal = new Metal();
        Material diamante = new Diamante();
        for(int i=15;i<30;i++){
            for(int j=3;j<7;j++){
                this.tableroDeElementos[i][j].ocuparCelda(madera);
                this.tableroDeElementos[j*2-j][i+i/2].ocuparCelda(madera);
            }
        }
        for(int i=33;i<40;i++){
            for(int j=15;j<19;j++){
                this.tableroDeElementos[i][j].ocuparCelda(piedra);
                this.tableroDeElementos[j*2-j][i+i/3].ocuparCelda(piedra);
            }
        }
        for(int i=50;i<60;i++){
            for(int j=40;j<45;j++){
                this.tableroDeElementos[i][j].ocuparCelda(metal);
                this.tableroDeElementos[j-j/2][i-i/2].ocuparCelda(metal);
            }
        }
        for(int i=70;i<77;i++){
            for(int j=23;j<29;j++){
                this.tableroDeElementos[i][j].ocuparCelda(diamante);
            }
        }
    }

    public boolean jugadorEstaEn(int posicionEnFila, int posicionEnColumna) {
        return this.tableroDeElementos[posicionEnFila][posicionEnColumna].tengoAlJugador();
    }

    public String obtenerCodigo(int fila, int columna) { return this.tableroDeElementos[fila][columna].obtenerCodigo(); }

    public Celda obtenerCelda(int fila,int columna) {return this.tableroDeElementos[fila][columna];}
}
