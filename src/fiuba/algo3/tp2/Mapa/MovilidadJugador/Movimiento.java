package fiuba.algo3.tp2.Mapa.MovilidadJugador;

import fiuba.algo3.tp2.Mapa.Celda;
import fiuba.algo3.tp2.Mapa.Tablero;

public interface Movimiento {

    public void movible(Celda celdaDeJugador);

    public void obtenerEntorno(Tablero tablero);

    public void nuevaPosicionValida(int posicionNuevaFila,int posicionNuevaColumna);
    }
