package fiuba.algo3.tp2.Materiales;

import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Pico;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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
        hacha.usarContra(piedra);

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


    @Test
    public void test04PiedraGolpeablePorPicoDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Pico pico = new Pico(madera);
        pico.usarContra(piedra);

        assertEquals(28,piedra.durabilidad());

    }

    @Test
    public void test05PiedraGolpeablePorPicoDeMetal(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Pico pico = new Pico(metal);
        pico.usarContra(piedra);

        assertEquals(18,piedra.durabilidad());

    }

    @Test
    public void test06PiedraGolpeablePorPicoDePiedra(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Pico pico = new Pico(piedra);
        pico.usarContra(piedra);

        assertEquals(26,piedra.durabilidad());

    }

}