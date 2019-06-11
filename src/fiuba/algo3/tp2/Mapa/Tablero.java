package fiuba.algo3.tp2.Mapa;

import fiuba.algo3.tp2.Mapa.MovilidadJugador.Movimiento;
import fiuba.algo3.tp2.Materiales.Diamante;
import fiuba.algo3.tp2.Materiales.Material;

public class Tablero {

    private Celda tableroDeElementos[][];
    private Celda celdaConJugador ;

    public Tablero(int posicionFilaInicialJugador,int posicionColumnaInicialJugador){
        this.tableroDeElementos = new Celda[9][9];
        for(int numeroDeFila = 0;numeroDeFila<9;numeroDeFila++){
            for(int numeroDeColumna = 0;numeroDeColumna<9;numeroDeColumna++)
                this.tableroDeElementos[numeroDeFila][numeroDeColumna] = new Celda(numeroDeFila, numeroDeColumna);
        }
        this.lugaresIniciales(posicionFilaInicialJugador-1,posicionColumnaInicialJugador-1);
    }

    public boolean puedoColocar(int fila,int columna){
        int filaEnTablero = fila - 1;
        int columnaEnTablero = columna - 1;
        return !this.tableroDeElementos[filaEnTablero][columnaEnTablero].celdaEstaOcupada();
    }

    void lugaresIniciales(int jugadorEnFila,int jugadorEnColumna){
        Material diamante = new Diamante();
        Jugador jugador = new Jugador();
        this.tableroDeElementos[1][1] = new Celda(1,1,diamante);
        this.tableroDeElementos[jugadorEnFila][jugadorEnColumna] = new Celda(jugadorEnFila,jugadorEnColumna,jugador);
        this.celdaConJugador = this.tableroDeElementos[jugadorEnColumna][jugadorEnColumna];
    }

    private void posicionValida(int posicionSolicitada){
        boolean esValido = (posicionSolicitada>=0);
        if(!esValido){
            //LanzarExcepcion
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
