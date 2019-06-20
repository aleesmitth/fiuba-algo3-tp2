package fiuba.algo3.tp2.Mapa.MovilidadJugador;

import fiuba.algo3.tp2.Mapa.Celda;
import fiuba.algo3.tp2.Mapa.Mapa;

public class Abajo implements Movimiento {

    private Mapa entornoMovimiento;

    public Abajo(){}

    public void obtenerEntorno(Mapa mapa){
        this.entornoMovimiento = mapa;
    }

    @Override
    public void movible(Celda celdaDeJugador) {
        int nuevaFila = celdaDeJugador.obtenerSiguienteFila(1);
        int nuevaColumna = celdaDeJugador.obtenerSiguienteColumna(0);
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
