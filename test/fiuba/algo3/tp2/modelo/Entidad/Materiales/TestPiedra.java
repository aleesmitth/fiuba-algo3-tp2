package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Pico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPiedra {

    @Test
    public void test01PiedraEsGolpeadaPorHachaDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(madera);
        hacha.usarContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test02PiedraEsGolpeadaPorHachaDeMetal(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(metal);
        hacha.usarContra(metal);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test03PiedraEsGolpeadaPorHachaDePiedra(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        hacha.usarContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test04PiedraEsGolpeadaPorPicoDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Pico pico = new Pico(madera);
        pico.usarContra(piedra);

        assertEquals(28,piedra.durabilidad());

    }

    @Test
    public void test05PiedraEsGolpeadaPorPicoDeMetal(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Pico pico = new Pico(metal);
        pico.usarContra(piedra);

        assertEquals(18,piedra.durabilidad());

    }

    @Test
    public void test06PiedraEsGolpeadaPorPicoDePiedra(){
        Material piedra = new Piedra();
        Pico pico = new Pico(piedra);
        pico.usarContra(piedra);

        assertEquals(26,piedra.durabilidad());

    }



    @Test
    public void test04MetalEsGolpeadoPorPicoDeMadera(){
        Material madera = new Madera();
        Material metal = new Metal();
        Pico pico = new Pico(madera);
        pico.usarContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test05MetalEsGolpeadoPorPicoDeMetal(){
        Material metal = new Metal();
        Pico pico = new Pico(metal);
        pico.usarContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test06PiedraEsGolpeadoPorPicoFino(){
        Material piedra = new Piedra();
        Material metal = new Metal();
        Pico pico = new Pico(piedra,metal);
        pico.usarContra(piedra,true);


        assertEquals(30,piedra.durabilidad());

    }
}