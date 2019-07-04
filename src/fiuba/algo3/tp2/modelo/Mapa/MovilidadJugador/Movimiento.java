package fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador;

import fiuba.algo3.tp2.modelo.Mapa.Celda;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;

public interface Movimiento {

    public Celda movible(Celda celdaDeJugador);

    public Celda obtenerCeldaSiguiente(Celda celdaActual);

    public void obtenerEntorno(Mapa mapa);

    public boolean movio();

}
