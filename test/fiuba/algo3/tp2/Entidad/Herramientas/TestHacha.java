package fiuba.algo3.tp2.Entidad.Herramientas;

import fiuba.algo3.tp2.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.Entidad.Materiales.*;
import fiuba.algo3.tp2.Entidad.MesaDeCrafteo.Constructor;
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

        Hacha hachaConstruida = constructor.construirHacha(madera);

        hachaConstruida.usarContra(madera);
        assertEquals(98, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(piedra);
        assertEquals(98, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(metal);
        assertEquals(98, hachaConstruida.durabilidad());
    }

    @Test
    public void test04HachaDeMaderaSeUsaContraMaderaYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();

        Hacha hachaConstruida = constructor.construirHacha(madera);

        hachaConstruida.usarContra(madera);
        assertEquals(98, hachaConstruida.durabilidad());
    }

    @Test
    public void test05HachaDeMaderaSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Material piedra = new Piedra();

        Hacha hachaConstruida = constructor.construirHacha(madera);

        hachaConstruida.usarContra(piedra);
        assertEquals(100, hachaConstruida.durabilidad());

    }

    @Test
    public void test06HachaDeMaderaSeUsaContraMetalYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Material metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(madera);

        hachaConstruida.usarContra(metal);
        assertEquals(100, hachaConstruida.durabilidad());
    }

    @Test
    public void test07HachaDeMaderaSeUsaContraDiamanteYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Material diamante = new Diamante();

        Hacha hachaConstruida = constructor.construirHacha(madera);

        hachaConstruida.usarContra(diamante);
        assertEquals(100, hachaConstruida.durabilidad());
    }

    @Test
    public void test08HachaDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(piedra);

        hachaConstruida.usarContra(madera);
        assertEquals(195, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(piedra);
        assertEquals(195, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(metal);
        assertEquals(195, hachaConstruida.durabilidad());
    }


    @Test
    public void test09HachaDePiedraSeUsaContraMaderaYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera= new Madera();
        Piedra piedra = new Piedra();

        Hacha hachaConstruida = constructor.construirHacha(piedra);

        hachaConstruida.usarContra(madera);
        assertEquals(195, hachaConstruida.durabilidad());
    }


    @Test
    public void test10HachaDePiedraSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();

        Hacha hachaConstruida = constructor.construirHacha(piedra);

        hachaConstruida.usarContra(piedra);
        assertEquals(200, hachaConstruida.durabilidad());
    }


    @Test
    public void test11HachaDePiedraSeUsaContraMetalYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(piedra);


        hachaConstruida.usarContra(metal);
        assertEquals(200, hachaConstruida.durabilidad());
    }


    @Test
    public void test12HachaDePiedraSeUsaDiamanteYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material diamante = new Diamante();
        Piedra piedra = new Piedra();

        Hacha hachaConstruida = constructor.construirHacha(piedra);

        hachaConstruida.usarContra(diamante);
        assertEquals(200, hachaConstruida.durabilidad());
    }


    @Test
    public void test13HachaDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(metal);

        hachaConstruida.usarContra(madera);
        assertEquals(395, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(piedra);
        assertEquals(395, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(metal);
        assertEquals(395, hachaConstruida.durabilidad());
    }


    @Test
    public void test14HachaDeMetalSeUsaContraMaderaYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(metal);

        hachaConstruida.usarContra(madera);
        assertEquals(395, hachaConstruida.durabilidad());
        }


    @Test
    public void test15HachaDeMetalSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(metal);

        hachaConstruida.usarContra(piedra);
        assertEquals(400, hachaConstruida.durabilidad());
    }


    @Test
    public void test16HachaDeMetalSeUsaContraMetalYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(metal);

        hachaConstruida.usarContra(metal);
        assertEquals(400, hachaConstruida.durabilidad());
    }


    @Test
    public void test17HachaDeMetalSeUsaContraDiamanteYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Diamante diamante = new Diamante();
        Metal metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(metal);

        hachaConstruida.usarContra(diamante);
        assertEquals(400, hachaConstruida.durabilidad());
    }

}

