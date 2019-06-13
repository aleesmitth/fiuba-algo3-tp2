package fiuba.algo3.tp2.Entidad.Jugador;

import fiuba.algo3.tp2.Mapa.Tablero;
import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.Entidad.Materiales.Material;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;



public class TestJugador {

    @Test
    public void test01NoPuedoColocarCosasEnLugaresOcupados() {
        Material madera = new Madera();
        boolean debeSerFalso = false;
        Tablero tablero = new Tablero(9, 9);
        //Jugador iniciado en (9.9)
        assertEquals(debeSerFalso, tablero.puedoColocar(9, 9));
    }

}