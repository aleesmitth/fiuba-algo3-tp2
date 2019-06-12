package fiuba.algo3.tp2;

import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Herramienta;
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

public class TestMadera {

    @Test
    public void test01MaderaGolpeablePorHachaDeMadera(){
        Material madera = new Madera();
        Hacha hacha = new Hacha(madera);
        hacha.usarContra(madera);

        assertEquals(8,madera.durabilidad());

    }

    @Test
    public void test02MaderaGolpeablePorHachaDeMetal(){
        Material metal = new Metal();
        Material madera = new Madera();
        Hacha hacha = new Hacha(metal);
        hacha.usarContra(madera);

        assertEquals(48,madera.durabilidad());

    }

    @Test
    public void test03MaderaGolpeablePorHachaDePiedra(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        hacha.usarContra(madera);

        assertEquals(28,madera.durabilidad());

    }
}