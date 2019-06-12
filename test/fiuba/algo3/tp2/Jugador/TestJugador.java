package fiuba.algo3.tp2;

import fiuba.algo3.tp2.Mapa.Tablero;
import fiuba.algo3.tp2.Materiales.Madera;
import fiuba.algo3.tp2.Materiales.Material;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
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