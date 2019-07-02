package fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador;

import fiuba.algo3.tp2.modelo.Mapa.Celda;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;

public class Izquierda implements Movimiento {

    public boolean movio;
    private Mapa entornoMovimiento;

    public Izquierda(){}

    public void obtenerEntorno(Mapa mapa){
        this.entornoMovimiento = mapa;
    }

    @Override
    public Celda movible(Celda celdaDeJugador) {
        this.movio = false;
        int nuevaFila = celdaDeJugador.obtenerSiguienteFila(0);
        int nuevaColumna = celdaDeJugador.obtenerSiguienteColumna(-1);
        nuevaFila = this.entornoMovimiento.filaValida(nuevaFila);
        nuevaColumna = this.entornoMovimiento.columnaValida(nuevaColumna);
        if (!this.entornoMovimiento.posicionOcupada(nuevaFila-1, nuevaColumna-1)) {
            this.entornoMovimiento.ocuparCelda(nuevaFila - 1, nuevaColumna - 1, celdaDeJugador);
            this.movio = true;
            celdaDeJugador = this.entornoMovimiento.obtenerCelda(nuevaFila-1,nuevaColumna-1);
        }
        return celdaDeJugador;
    }

    @Override
    public boolean movio(){return this.movio;}

}
