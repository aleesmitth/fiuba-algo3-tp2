package fiuba.algo3.tp2.Mapa.MovilidadJugador;

import fiuba.algo3.tp2.Mapa.Celda;
import fiuba.algo3.tp2.Mapa.Mapa;

public interface Movimiento {

    public void movible(Celda celdaDeJugador);

    public void obtenerEntorno(Mapa mapa);

    public void nuevaPosicionValida(int posicionNuevaFila,int posicionNuevaColumna);
    }
