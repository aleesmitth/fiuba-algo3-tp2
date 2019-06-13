package fiuba.algo3.tp2.Entidad.Materiales;

import fiuba.algo3.tp2.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.Entidad.Herramienta.Pico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMadera {

    @Test
    public void test01MaderaEsGolpeadaPorHachaDeMadera(){
        Material madera = new Madera();
        Hacha hacha = new Hacha(madera);
        hacha.usarContra(madera);

        assertEquals(8,madera.durabilidad());

    }

    @Test
    public void test02MaderaEsGolpeadaPorHachaDeMetal(){
        Material metal = new Metal();
        Material madera = new Madera();
        Hacha hacha = new Hacha(metal);
        hacha.usarContra(madera);

        assertEquals(0,madera.durabilidad());

    }

    @Test
    public void test03MaderaEsGolpeadaPorHachaDePiedra(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        hacha.usarContra(madera);

        assertEquals(5,madera.durabilidad());

    }


    @Test
    public void test04MaderaEsGolpeadaPorPicoDeMadera(){
        Material madera = new Madera();
        Pico pico = new Pico(madera);
        pico.usarContra(madera);


        assertEquals(10,madera.durabilidad());

    }

    @Test
    public void test05MaderaEsGolpeadaPorPicoDeMetal(){
        Material metal = new Metal();
        Material madera = new Madera();
        Pico pico = new Pico(metal);
        pico.usarContra(madera);

        assertEquals(10,madera.durabilidad());

    }

    @Test
    public void test06MaderaEsGolpeadaPorPicoDePiedra(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Pico pico = new Pico(piedra);
        pico.usarContra(madera);

        assertEquals(10,madera.durabilidad());

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
    public void test07MaderaEsGolpeadoPorPicoFino(){
        Material piedra = new Piedra();
        Material madera = new Madera();
        Material metal = new Metal();
        Pico pico = new Pico(piedra,metal);
        pico.usarContra(madera,true);


        assertEquals(50,metal.durabilidad());

    }
}