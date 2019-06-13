package fiuba.algo3.tp2.Entidad.Materiales;

import fiuba.algo3.tp2.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.Entidad.Herramienta.Pico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMetal {

    @Test
    public void test01MetalEsGolpeadoPorHachaDeMadera(){
        Material madera = new Madera();
        Material metal = new Metal();
        Hacha hacha = new Hacha(madera);
        hacha.usarContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test02MetalEsGolpeadoPorHachaDeMetal(){
        Material metal = new Metal();
        Hacha hacha = new Hacha(metal);
        hacha.usarContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test03MetalEsGolpeadoPorHachaDePiedra(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        hacha.usarContra(metal);

        assertEquals(50,metal.durabilidad());

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
    public void test06MetalEsGolpeadoPorPicoDePiedra(){
        Material piedra = new Piedra();
        Material metal = new Metal();
        Pico pico = new Pico(piedra);
        pico.usarContra(metal);


        assertEquals(46,metal.durabilidad());

    }


    @Test
    public void test07MetalEsGolpeadoPorPicoFino(){
        Material piedra = new Piedra();
        Material metal = new Metal();
        Pico pico = new Pico(piedra,metal);
        pico.usarContra(metal,true);

        assertEquals(50,metal.durabilidad());

    }

}