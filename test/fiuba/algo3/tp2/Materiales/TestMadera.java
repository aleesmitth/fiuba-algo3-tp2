package fiuba.algo3.tp2.Materiales;

import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Pico;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals(0,madera.durabilidad());

    }

    @Test
    public void test03MaderaGolpeablePorHachaDePiedra(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        hacha.usarContra(madera);

        assertEquals(5,madera.durabilidad());

    }

    @Test
    public void test04MaderaGolpeablePorPicoDeMadera(){
        Material madera = new Madera();
        Pico pico = new Pico(madera);
        pico.usarContra(madera);

        assertEquals(10,madera.durabilidad());

    }

    @Test
    public void test05MaderaGolpeablePorPicoDeMetal(){
        Material metal = new Metal();
        Material madera = new Madera();
        Pico pico = new Pico(metal);
        pico.usarContra(madera);

        assertEquals(10,madera.durabilidad());

    }

    @Test
    public void test06MaderaGolpeablePorPicoDePiedra(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Pico pico = new Pico(piedra);
        pico.usarContra(madera);

        assertEquals(10,madera.durabilidad());

    }

}