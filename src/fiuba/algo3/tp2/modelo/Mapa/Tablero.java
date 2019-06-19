package fiuba.algo3.tp2.modelo.Mapa;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Diamante;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;

public class Tablero {

    private Celda tableroDeElementos[][];
    private Celda celdaConJugador ;
    private int cantidadDeFilas;
    private int cantidadDeColumnas;
    private static Tablero tablero=new Tablero(20,20);

    private Tablero(int limiteDeFila,int limiteDeColumnas){
        this.cantidadDeFilas = limiteDeFila - 1;
        this.cantidadDeColumnas = limiteDeColumnas - 1;
        this.tableroDeElementos = new Celda[limiteDeFila][limiteDeColumnas];
        for(int numeroDeFila = 0;numeroDeFila<limiteDeFila;numeroDeFila++){
            for(int numeroDeColumna = 0;numeroDeColumna<limiteDeColumnas;numeroDeColumna++)
                this.tableroDeElementos[numeroDeFila][numeroDeColumna] = new Celda(numeroDeFila, numeroDeColumna);
        }
        this.lugaresIniciales(8,8);
    }

    public boolean puedoColocar(int fila,int columna){
        int filaEnTablero = fila - 1;
        int columnaEnTablero = columna - 1;
        return !this.tableroDeElementos[filaEnTablero][columnaEnTablero].celdaEstaOcupada();
    }

    void lugaresIniciales(int jugadorEnFila,int jugadorEnColumna){
        Material diamante = new Diamante();
        Jugador jugador = new Jugador();
        this.tableroDeElementos[1][1].ocuparCelda(diamante);
        this.tableroDeElementos[7][7].ocuparCelda(diamante);
        this.tableroDeElementos[jugadorEnFila][jugadorEnColumna].ocuparCelda(jugador);
        this.celdaConJugador = this.tableroDeElementos[jugadorEnColumna][jugadorEnColumna];
    }

    public int filaValida(int posicionSolicitada){
        if(posicionSolicitada > this.cantidadDeFilas){
           posicionSolicitada =  this.cantidadDeFilas+1;
        }
        return posicionSolicitada;
    }

    public int columnaValida(int posicionSolicitada){
        if(posicionSolicitada > this.cantidadDeColumnas){
            posicionSolicitada =  this.cantidadDeColumnas+1;
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

    public static Tablero getTablero(){
        return tablero;
    }


    public static Tablero getTableroTest(){
        return new Tablero(9,9);
    }

    public static Tablero getTableroTest(int x , int y){

        return new Tablero(x,y);
    }




}
