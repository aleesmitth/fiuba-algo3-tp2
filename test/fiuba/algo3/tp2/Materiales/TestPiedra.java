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

public class TestPiedra {

    @Test
    public void test01PiedraGolpeablePorHachaDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(madera);
        hacha.usarContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test02PiedraGolpeablePorHachaDeMetal(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(metal);
        hacha.usarContra(metal);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test03PiedraGolpeablePorHachaDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        hacha.usarContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }
}