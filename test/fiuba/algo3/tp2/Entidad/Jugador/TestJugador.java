package fiuba.algo3.tp2.Entidad.Jugador;

import fiuba.algo3.tp2.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Mapa.Tablero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestJugador {

    @Test
    public void test01CorrectaInicialzacionDelJugador() {
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.obtenerHerramientaEquipada();

        assertEquals(100,hacha.durabilidad());
        assertEquals(2,hacha.fuerza());
    }
    @Test
    public void test02JugadorUsaHachaContraMadera() {
        Jugador jugador = new Jugador();
        Material madera = new Madera();
        jugador.usarHerramientaContra(madera);
        Herramienta hacha = jugador.obtenerHerramientaEquipada();

        assertEquals(98,hacha.durabilidad());
        assertEquals(2,hacha.fuerza());
        assertEquals(8,madera.durabilidad());
    }

}