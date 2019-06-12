package fiuba.algo3.tp2.Materiales;

import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Pico;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestMetal {

    @Test
    public void test01MetalGolpeablePorHachaDeMadera(){
        Material madera = new Madera();
        Material metal = new Metal();
        Hacha hacha = new Hacha(madera);
        hacha.usarContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test02MetalGolpeablePorHachaDeMetal(){
        Material metal = new Metal();
        Hacha hacha = new Hacha(metal);
        hacha.usarContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test03MetalGolpeablePorHachaDePiedra(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        hacha.usarContra(metal);

        assertEquals(50,metal.durabilidad());

    }


    @Test
    public void test04MetalGolpeablePorPicoDeMadera(){
        Material madera = new Madera();
        Material metal = new Metal();
        Pico pico = new Pico(madera);
        pico.usarContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test05MetalGolpeablePorPicoDeMetal(){
        Material metal = new Metal();
        Pico pico = new Pico(metal);
        pico.usarContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test06MetalGolpeablePorPicoDePiedra(){
        Material piedra = new Piedra();
        Material metal = new Metal();
        Pico pico = new Pico(piedra);
        pico.usarContra(metal);


        assertEquals(46,metal.durabilidad());

    }

}