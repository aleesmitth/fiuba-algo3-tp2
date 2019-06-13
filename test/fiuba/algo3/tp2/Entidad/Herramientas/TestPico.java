package fiuba.algo3.tp2.Entidad.Herramientas;

import fiuba.algo3.tp2.Entidad.Herramienta.Pico;
import fiuba.algo3.tp2.Entidad.MesaDeCrafteo.Constructor;
import fiuba.algo3.tp2.Entidad.Materiales.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * faltaria hacer la implementacion de las destrucciones de las herramientas, tiran excepciones y printean el mensaje
 * pero no esta implementado el sistema de destruccion.
 */

public class TestPico {


    @Test
    public void test01ArmarPicoDeMaderaConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Pico picoConstruido = constructor.construirPico(madera);

        assertEquals(2, picoConstruido.fuerza());
        assertEquals(100, picoConstruido.durabilidad());
    }

    @Test
    public void test02ArmarPicoDeMetalConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material metal = new Metal();
        Pico picoConstruido = constructor.construirPico(metal);

        assertEquals(12, picoConstruido.fuerza());
        assertEquals(400, picoConstruido.durabilidad());
    }

    @Test
    public void test03ArmarPicoFinoConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material metal = new Metal();
        Material piedra = new Piedra();
        Pico picoConstruido = constructor.construirPico(metal, piedra);

        assertEquals(20, picoConstruido.fuerza());
        assertEquals(1000, picoConstruido.durabilidad());
    }

    @Test
    public void test04PicoDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidad() {
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
    public void test05PicoDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad() {
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

    public void test06PicoDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidad() {
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
    public void test07PicoFinoSeUsaContraDiamanteYReduceSuDurabilidad() {
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
    public void test08PicoFinoSeUsaContraMaderaYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();
        Piedra piedra = new Piedra();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);

        picoFinoConstruido.usarContra(madera,true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(madera,true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(madera,true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test09PicoFinoSeUsaContraPiedraYNoReduceSuDurabilidad() {
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
    public void test10PicoFinoSeUsaContraMetalYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();
        Piedra piedra = new Piedra();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);

        picoFinoConstruido.usarContra(metal,true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(metal,true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(metal,true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }
}