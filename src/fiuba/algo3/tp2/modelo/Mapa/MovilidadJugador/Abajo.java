package fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador;

import fiuba.algo3.tp2.modelo.Mapa.Celda;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;

public class Abajo implements Movimiento {

    private Mapa entornoMovimiento;

    public Abajo(){}

    public void obtenerEntorno(Mapa mapa){
        this.entornoMovimiento = mapa;
    }

    @Override
    public Celda movible(Celda celdaDeJugador) {
        Celda nuevaCeldaDeJugador;
        int nuevaFila = celdaDeJugador.obtenerSiguienteFila(1);
        int nuevaColumna = celdaDeJugador.obtenerSiguienteColumna(0);
        nuevaFila = this.entornoMovimiento.filaValida(nuevaFila);
        nuevaColumna = this.entornoMovimiento.columnaValida(nuevaColumna);
        if(!this.entornoMovimiento.posicionOcupada(nuevaFila-1,nuevaColumna-1)){
            this.entornoMovimiento.ocuparCelda(nuevaFila-1,nuevaColumna-1,celdaDeJugador);
        }
        nuevaCeldaDeJugador = this.entornoMovimiento.obtenerCelda(nuevaFila-1,nuevaColumna-1);
        return nuevaCeldaDeJugador;
    }
}
