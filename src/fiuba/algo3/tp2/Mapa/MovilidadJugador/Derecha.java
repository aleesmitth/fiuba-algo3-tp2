package fiuba.algo3.tp2.Mapa.MovilidadJugador;

import fiuba.algo3.tp2.Mapa.Celda;
import fiuba.algo3.tp2.Mapa.Tablero;

public class Derecha implements Movimiento {

    private Tablero entornoMovimiento;

    public Derecha(){}

    public void obtenerEntorno(Tablero tablero){
        this.entornoMovimiento = tablero;
    }

    @Override
    public void movible(Celda celdaDeJugador) {
        int nuevaFila = celdaDeJugador.obtenerSiguienteFila(0);
        int nuevaColumna = celdaDeJugador.obtenerSiguienteColumna(1);
        //this.nuevaPosicionValida(nuevaFila,nuevaColumna);
        if(this.entornoMovimiento.puedoColocar(nuevaFila,nuevaColumna)){
            this.entornoMovimiento.ocuparCelda(nuevaFila,nuevaColumna,celdaDeJugador);
        }
    }

    @Override
    public void nuevaPosicionValida(int posicionNuevaFila, int posicionNuevaColumna) {
        this.entornoMovimiento.filaValida(posicionNuevaFila);
        this.entornoMovimiento.columnaValida(posicionNuevaColumna);
    }
}
