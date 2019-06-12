package fiuba.algo3.tp2;

import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Pico;
import fiuba.algo3.tp2.Jugador.Jugador;
import fiuba.algo3.tp2.Mapa.Constructor;
import fiuba.algo3.tp2.Mapa.Tablero;
import fiuba.algo3.tp2.Materiales.*;
import fiuba.algo3.tp2.Mapa.MovilidadJugador.Derecha;
import fiuba.algo3.tp2.Mapa.MovilidadJugador.Movimiento;

//import org.junit.Test;
//import static junit.framework.TestCase.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * faltaria hacer la implementacion de las destrucciones de las herramientas, solo esta considerada la del pico de metal
 * pero no esta implementado el sistema de destruccion.
 */

public class TestJugador {

    @Test
    public void test01NoPuedoColocarCosasEnLugaresOcupados() {
        Material madera = new Madera();
        boolean debeSerFalso = false;
        Tablero tablero = new Tablero(4, 3);
        assertEquals(debeSerFalso, tablero.puedoColocar(4, 3));
    }

    @Test
    public void test02PuedoMoverUsuarioASuDerecha() {
        Tablero tableroDeJuego = new Tablero(4, 4);
    }
}