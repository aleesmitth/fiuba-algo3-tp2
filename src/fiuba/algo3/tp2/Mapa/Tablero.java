package fiuba.algo3.tp2.Mapa;

import fiuba.algo3.tp2.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.Mapa.MovilidadJugador.Movimiento;
import fiuba.algo3.tp2.Entidad.Materiales.Diamante;
import fiuba.algo3.tp2.Entidad.Materiales.Material;

public class Tablero {

    private Celda tableroDeElementos[][];
    private Celda celdaConJugador ;
    private int cantidadDeFilas;
    private int cantidadDeColumnas;

    public Tablero(int limiteDeFila,int limiteDeColumnas){
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
        this.tableroDeElementos[jugadorEnFila][jugadorEnColumna].ocuparCelda(jugador);
        this.celdaConJugador = this.tableroDeElementos[jugadorEnColumna][jugadorEnColumna];
    }

    public void filaValida(int posicionSolicitada){
        if(posicionSolicitada < 0 && posicionSolicitada > cantidadDeFilas){
            /*LanzoExcepcion*/
        }
    }

    public void columnaValida(int posicionSolicitada){
        if(posicionSolicitada < 0 && posicionSolicitada > cantidadDeColumnas){
            /*LanzoExcepcion*/
        }
    }

    public void moverJugador(Movimiento movimiento){
        movimiento.obtenerEntorno(this);
        this.celdaConJugador.moverJugadorA(movimiento);
    }

    public void ocuparCelda(int posicionDeFila,int posicionDeColumna,Celda celdaQueEnvia){
        Celda nuevaCeldaDeJugador = this.tableroDeElementos[posicionDeFila][posicionDeColumna];
        celdaQueEnvia.enviarJugador(nuevaCeldaDeJugador);
    }
}
