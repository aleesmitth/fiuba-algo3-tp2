package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Pico;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMetal {

    @Test
    public void test01MetalEsGolpeadoPorHachaDeMadera(){
        Material madera = new Madera();
        Material metal = new Metal();
        Hacha hacha = new Hacha(madera);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(hacha);
        jugador.usarHerramientaContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test02MetalEsGolpeadoPorHachaDeMetal(){
        Material metal = new Metal();
        Hacha hacha = new Hacha(metal);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(hacha);
        jugador.usarHerramientaContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test03MetalEsGolpeadoPorHachaDePiedra(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(hacha);
        jugador.usarHerramientaContra(metal);

        assertEquals(50,metal.durabilidad());

    }


    @Test
    public void test04MetalEsGolpeadoPorPicoDeMadera(){
        Material madera = new Madera();
        Material metal = new Metal();
        Pico pico = new Pico(madera);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(pico);
        jugador.usarHerramientaContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test05MetalEsGolpeadoPorPicoDeMetal(){
        Material metal = new Metal();
        Pico pico = new Pico(metal);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(pico);
        jugador.usarHerramientaContra(metal);

        assertEquals(50,metal.durabilidad());

    }

    @Test
    public void test06MetalEsGolpeadoPorPicoDePiedra(){
        Material piedra = new Piedra();
        Material metal = new Metal();
        Pico pico = new Pico(piedra);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(pico);
        jugador.usarHerramientaContra(metal);


        assertEquals(46,metal.durabilidad());

    }


    @Test
    public void test07MetalEsGolpeadoPorPicoFino(){
        Material piedra = new Piedra();
        Material metal = new Metal();
        Pico pico = new Pico(piedra,metal);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(pico);
        jugador.usarHerramientaContra(metal);

        assertEquals(50,metal.durabilidad());

    }

}