package fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador;

import fiuba.algo3.tp2.modelo.Mapa.Celda;
import fiuba.algo3.tp2.modelo.Mapa.Tablero;

public interface Movimiento {

    public void movible(Celda celdaDeJugador);

    public void obtenerEntorno(Tablero tablero);

    public void nuevaPosicionValida(int posicionNuevaFila,int posicionNuevaColumna);
    }
