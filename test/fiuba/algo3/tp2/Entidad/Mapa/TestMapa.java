package fiuba.algo3.tp2.Entidad.Mapa;

import fiuba.algo3.tp2.Mapa.Tablero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMapa {
    @Test
    public void test01NoPuedoColocarCosasEnLugaresOcupados() {
        /**
         * Jugador iniciado en (9.9)
         */
        Tablero tablero = new Tablero(9, 9);

        assertEquals(false, tablero.puedoColocar(9, 9));
    }
}
