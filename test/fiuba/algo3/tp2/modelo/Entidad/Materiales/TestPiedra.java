package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Pico;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPiedra {

    @Test
    public void test01PiedraEsGolpeadaPorHachaDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(madera);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(hacha);
        jugador.usarHerramientaContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test02PiedraEsGolpeadaPorHachaDeMetal(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(metal);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(hacha);
        jugador.usarHerramientaContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test03PiedraEsGolpeadaPorHachaDePiedra(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(hacha);
        jugador.usarHerramientaContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test04PiedraEsGolpeadaPorPicoDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Pico pico = new Pico(madera);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(pico);
        jugador.usarHerramientaContra(piedra);

        assertEquals(28,piedra.durabilidad());

    }

    @Test
    public void test05PiedraEsGolpeadaPorPicoDeMetal(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Pico pico = new Pico(metal);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(pico);
        jugador.usarHerramientaContra(piedra);

        assertEquals(18,piedra.durabilidad());

    }

    @Test
    public void test06PiedraEsGolpeadaPorPicoDePiedra(){
        Material piedra = new Piedra();
        Pico pico = new Pico(piedra);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(pico);
        jugador.usarHerramientaContra(piedra);

        assertEquals(26,piedra.durabilidad());

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
    public void test06PiedraEsGolpeadoPorPicoFino(){
        Material piedra = new Piedra();
        Material metal = new Metal();
        Pico pico = new Pico(piedra,metal);
        Jugador jugador = new Jugador();

        jugador.equiparHerramienta(pico);
        jugador.usarHerramientaContra(piedra);


        assertEquals(30,piedra.durabilidad());

    }
}