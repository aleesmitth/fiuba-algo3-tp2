package fiuba.algo3.tp2.modelo.Entidad.Herramientas;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.*;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.Constructor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestHacha {

    @Test
    public void test01ArmarHachaDeMaderaConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Hacha hachaConstruida = constructor.construirHacha(madera);

        assertEquals(2, hachaConstruida.fuerza());
        assertEquals(100, hachaConstruida.durabilidad());
    }

    @Test
    public void test02ArmarHachaDeMetalConSuDurabilidadYFuerzaCorrespondiente() {
        Constructor constructor = new Constructor();
        Material metal = new Metal();
        Hacha hachaConstruida = constructor.construirHacha(metal);

        assertEquals(10, hachaConstruida.fuerza());
        assertEquals(400, hachaConstruida.durabilidad());
    }

    @Test
    public void test03HachaDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Material piedra = new Piedra();
        Material metal = new Metal();
        Material diamante = new Diamante();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(madera);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(madera);
        assertEquals(98, hachaConstruida.durabilidad());
        jugador.usarHerramientaContra(piedra);
        assertEquals(98, hachaConstruida.durabilidad());
        jugador.usarHerramientaContra(metal);
        assertEquals(98, hachaConstruida.durabilidad());
        jugador.usarHerramientaContra(diamante);
        assertEquals(98, hachaConstruida.durabilidad());
    }

    @Test
    public void test04HachaDeMaderaSeUsaContraMaderaYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(madera);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(madera);
        assertEquals(98, hachaConstruida.durabilidad());
    }

    @Test
    public void test05HachaDeMaderaSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Material piedra = new Piedra();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(madera);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(piedra);
        assertEquals(100, hachaConstruida.durabilidad());

    }

    @Test
    public void test06HachaDeMaderaSeUsaContraMetalYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Material metal = new Metal();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(madera);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(metal);
        assertEquals(100, hachaConstruida.durabilidad());
    }

    @Test
    public void test07HachaDeMaderaSeUsaContraDiamanteYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Material diamante = new Diamante();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(madera);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(diamante);
        assertEquals(100, hachaConstruida.durabilidad());
    }

    @Test
    public void test08HachaDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(piedra);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(madera);
        assertEquals(195, hachaConstruida.durabilidad());
        jugador.usarHerramientaContra(piedra);
        assertEquals(195, hachaConstruida.durabilidad());
        jugador.usarHerramientaContra(metal);
        assertEquals(195, hachaConstruida.durabilidad());
        jugador.usarHerramientaContra(diamante);
        assertEquals(195, hachaConstruida.durabilidad());
    }


    @Test
    public void test09HachaDePiedraSeUsaContraMaderaYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera= new Madera();
        Piedra piedra = new Piedra();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(piedra);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(madera);
        assertEquals(195, hachaConstruida.durabilidad());
    }


    @Test
    public void test10HachaDePiedraSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(piedra);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(piedra);
        assertEquals(200, hachaConstruida.durabilidad());
    }


    @Test
    public void test11HachaDePiedraSeUsaContraMetalYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(piedra);
        jugador.equiparHerramienta(hachaConstruida);


        jugador.usarHerramientaContra(metal);
        assertEquals(200, hachaConstruida.durabilidad());
    }


    @Test
    public void test12HachaDePiedraSeUsaDiamanteYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material diamante = new Diamante();
        Piedra piedra = new Piedra();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(piedra);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(diamante);
        assertEquals(200, hachaConstruida.durabilidad());
    }


    @Test
    public void test13HachaDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(metal);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(madera);
        assertEquals(395, hachaConstruida.durabilidad());
        jugador.usarHerramientaContra(piedra);
        assertEquals(395, hachaConstruida.durabilidad());
        jugador.usarHerramientaContra(metal);
        assertEquals(395, hachaConstruida.durabilidad());
        jugador.usarHerramientaContra(diamante);
        assertEquals(395, hachaConstruida.durabilidad());
    }


    @Test
    public void test14HachaDeMetalSeUsaContraMaderaYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(metal);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(madera);
        assertEquals(395, hachaConstruida.durabilidad());
        }


    @Test
    public void test15HachaDeMetalSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(metal);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(piedra);
        assertEquals(400, hachaConstruida.durabilidad());
    }


    @Test
    public void test16HachaDeMetalSeUsaContraMetalYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(metal);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(metal);
        assertEquals(400, hachaConstruida.durabilidad());
    }


    @Test
    public void test17HachaDeMetalSeUsaContraDiamanteYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Diamante diamante = new Diamante();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Hacha hachaConstruida = constructor.construirHacha(metal);
        jugador.equiparHerramienta(hachaConstruida);

        jugador.usarHerramientaContra(diamante);
        assertEquals(400, hachaConstruida.durabilidad());
    }

}

