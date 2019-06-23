package fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador;

import fiuba.algo3.tp2.modelo.Mapa.Celda;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;

public class Derecha implements Movimiento {

    private Mapa entornoMovimiento;

    public Derecha(){}

    public void obtenerEntorno(Mapa mapa){
        this.entornoMovimiento = mapa;
    }

    @Override
    public Celda movible(Celda celdaDeJugador) {
        Celda nuevaCeldaDelJugador;
        int nuevaFila = celdaDeJugador.obtenerSiguienteFila(0);
        int nuevaColumna = celdaDeJugador.obtenerSiguienteColumna(1);
        nuevaFila = this.entornoMovimiento.filaValida(nuevaFila);
        nuevaColumna = this.entornoMovimiento.columnaValida(nuevaColumna);
        if(!this.entornoMovimiento.posicionOcupada(nuevaFila-1,nuevaColumna-1)){
            this.entornoMovimiento.ocuparCelda(nuevaFila-1,nuevaColumna-1,celdaDeJugador);
        }
        nuevaCeldaDelJugador = this.entornoMovimiento.obtenerCelda(nuevaFila-1,nuevaColumna-1);
        return nuevaCeldaDelJugador;
    }


}
