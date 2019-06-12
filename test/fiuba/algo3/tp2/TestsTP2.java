package fiuba.algo3.tp2;

import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Pico;
import fiuba.algo3.tp2.Mapa.Constructor;
import fiuba.algo3.tp2.Mapa.Tablero;
import fiuba.algo3.tp2.Materiales.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * faltaria hacer la implementacion de las destrucciones de las herramientas, solo esta considerada la del pico de metal
 * pero no esta implementado el sistema de destruccion.
 */

public class TestsTP2 {

    @Test
    public void test01ArmarHachaDeMaderaConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Hacha hachaConstruida = constructor.construirHacha(madera);

        assertEquals(2, hachaConstruida.fuerza());
        assertEquals(100, hachaConstruida.durabilidad());
    }

    @Test
    public void test02ArmarPicoDeMaderaConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Pico picoConstruido = constructor.construirPico(madera);

        assertEquals(2, picoConstruido.fuerza());
        assertEquals(100, picoConstruido.durabilidad());
    }

    @Test
    public void test03ArmarHachaDeMetalConSuDurabilidadYFuerzaCorrespondiente() {
        Constructor constructor = new Constructor();
        Material metal = new Metal();
        Hacha hachaConstruida = constructor.construirHacha(metal);

        assertEquals(10, hachaConstruida.fuerza());
        assertEquals(400, hachaConstruida.durabilidad());
    }

    @Test
    public void test04ArmarPicoDeMetalConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material metal = new Metal();
        Pico picoConstruido = constructor.construirPico(metal);

        assertEquals(12, picoConstruido.fuerza());
        assertEquals(400, picoConstruido.durabilidad());
    }

    @Test
    public void test05ArmarPicoFinoConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material metal = new Metal();
        Material piedra = new Piedra();
        Pico picoConstruido = constructor.construirPico(metal, piedra);

        assertEquals(20, picoConstruido.fuerza());
        assertEquals(1000, picoConstruido.durabilidad());
    }

    @Test
    public void test06HachaDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidad() {
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
    public void test07HachaDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad() {
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
    public void test08HachaDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidad() {
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
    public void test09PicoDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Pico picoConstruido = constructor.construirPico(madera);

        picoConstruido.usarContra(madera);
        assertEquals(100, picoConstruido.durabilidad());
        picoConstruido.usarContra(piedra);
        assertEquals(98, picoConstruido.durabilidad());
        picoConstruido.usarContra(metal);
        assertEquals(98, picoConstruido.durabilidad());
    }

    @Test
    public void test10PicoDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        int desgaste = (int) (5 / 1.5);
        int primerDesgasteReal = (200 - desgaste);
        int segundoDesgasteReal = (primerDesgasteReal - desgaste);

        Pico picoConstruido = constructor.construirPico(piedra);

        picoConstruido.usarContra(madera);
        assertEquals(200, picoConstruido.durabilidad());
        picoConstruido.usarContra(piedra);
        assertEquals(primerDesgasteReal, picoConstruido.durabilidad());
        picoConstruido.usarContra(metal);
        assertEquals(segundoDesgasteReal, picoConstruido.durabilidad());

    }

    @Test

    public void test10PicoDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Pico picoConstruido = constructor.construirPico(metal);

        picoConstruido.usarContra(madera);
        assertEquals(400, picoConstruido.durabilidad());
        picoConstruido.usarContra(piedra);
        assertEquals(400, picoConstruido.durabilidad());
        picoConstruido.usarContra(metal);
        assertEquals(400, picoConstruido.durabilidad());
        /*cuenta un solo uso , por la piedra*/
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        assertEquals(0, picoConstruido.durabilidad());
    }

    @Test
    public void test10PicoFinoSeUsaContraDiamanteYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Diamante diamante = new Diamante();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);

        picoFinoConstruido.usarContra(diamante, true);
        assertEquals(900, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(diamante, true);
        assertEquals(810, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(diamante, true);
        assertEquals(729, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test11PicoFinoSeUsaContraMaderaYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();
        Piedra piedra = new Piedra();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);

        picoFinoConstruido.usarContra(madera);
        assertEquals(1000, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(madera);
        assertEquals(1000, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(madera);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test11PicoFinoSeUsaContraPiedraYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);

        picoFinoConstruido.usarContra(piedra, true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(piedra, true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(piedra, true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test11PicoFinoSeUsaContraMetalYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();
        Piedra piedra = new Piedra();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);

        picoFinoConstruido.usarContra(metal);
        assertEquals(1000, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(metal);
        assertEquals(1000, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(metal);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test12NoPuedoColocarCosasEnLugaresOcupados() {
        Material madera = new Madera();
        boolean debeSerFalso = false;
        Tablero tablero = new Tablero(4, 3);
        assertEquals(debeSerFalso, tablero.puedoColocar(4, 3));
    }

    @Test
    public void test13PuedoMoverUsuarioASuDerecha() {
        Tablero tableroDeJuego = new Tablero(4, 4);
    }


}
