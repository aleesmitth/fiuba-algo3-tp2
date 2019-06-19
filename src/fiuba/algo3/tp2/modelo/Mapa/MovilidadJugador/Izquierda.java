package fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador;

import fiuba.algo3.tp2.modelo.Mapa.Celda;
import fiuba.algo3.tp2.modelo.Mapa.Tablero;

public class Izquierda implements Movimiento {

    private Tablero entornoMovimiento;

    public Izquierda(){}

    public void obtenerEntorno(Tablero tablero){
        this.entornoMovimiento = tablero;
    }

    @Override
    public void movible(Celda celdaDeJugador) {
        int nuevaFila = celdaDeJugador.obtenerSiguienteFila(0);
        int nuevaColumna = celdaDeJugador.obtenerSiguienteColumna(-1);
        nuevaFila = this.entornoMovimiento.filaValida(nuevaFila);
        nuevaColumna = this.entornoMovimiento.columnaValida(nuevaColumna);
        if(this.entornoMovimiento.puedoColocar(nuevaFila,nuevaColumna)){
            this.entornoMovimiento.ocuparCelda(nuevaFila-1,nuevaColumna-1,celdaDeJugador);
        }
    }

    @Override
    public void nuevaPosicionValida(int posicionNuevaFila, int posicionNuevaColumna) {
        this.entornoMovimiento.filaValida(posicionNuevaFila);
        this.entornoMovimiento.columnaValida(posicionNuevaColumna);
    }
}